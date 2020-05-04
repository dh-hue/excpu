package io.ex.cpu;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class ByteUtils {

    public static void putInt(ByteBuffer buf, int num, int off){
        buf.putInt(off, num);
    }
    public static void putShort(ByteBuffer buf, short num, int off){
        buf.putShort(off, num);
    }
    public static void put(ByteBuffer buf, byte num, int off){
        buf.put(off, num);
    }

    public static int getInt(ByteBuffer buf, int off){
        return buf.getInt(off);
    }
    public static short getShort(ByteBuffer buf, int off){
        return buf.getShort(off);
    }
    public static byte get(ByteBuffer buf, int off){
        return buf.get(off);
    }

    public static int get_uShort(ByteBuffer buf, int off){
        return (getShort(buf, off) & 0xffff);
    }
    public static int get_uByte(ByteBuffer buf, int off){
        return (get(buf,off) & 0xff);
    }

    //String convention
    public static String getString(ByteBuffer buf, int off){
        int len = get_uShort(buf,off); off+=2;
        byte[] data = new byte[len];
        for(int x =0; x < len; x++){
            data[x] = buf.get(off+x);
        }
        return new String(data, StandardCharsets.UTF_8);
    }

    public static void putString(ByteBuffer buf, int off, String str){
        byte[] bytes = str.getBytes();
        putShort(buf,(short) bytes.length,off);off+=2;
        for(int x=0; x<bytes.length; x++){
            buf.put(x+off,bytes[x]);
        }
    }

}
