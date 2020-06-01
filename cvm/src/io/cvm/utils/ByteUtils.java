package io.cvm.utils;

import java.nio.ByteBuffer;

public class ByteUtils {

	public static byte[] fromInt(int value){
		ByteBuffer buffer = ByteBuffer.allocate(4);
		buffer.putInt(value);	// Put the integer for conversion
		buffer.flip();	// Change to read mode
		return buffer.array();
	}
	
	public static byte[] fromShort(short value){
		ByteBuffer buffer = ByteBuffer.allocate(2);
		buffer.putShort(value);
		buffer.flip();
		return buffer.array();
	}

	public static int toInt(byte[] bytes){
		return ByteBuffer.wrap(bytes).getInt();
	}
	
	public static short unsignedToBytes(byte b) {
	    return (short) (b & 0xFF);
	  }
	
	public static byte[] concat(byte[] a, byte[] b) {
		   int aLen = a.length;
		   int bLen = b.length;
		   byte[] c= new byte[aLen+bLen];
		   System.arraycopy(a, 0, c, 0, aLen);
		   System.arraycopy(b, 0, c, aLen, bLen);
		   return c;
	}
	
}
