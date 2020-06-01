package io.cvm.asm.core;

import java.nio.ByteBuffer;

public class OutputOpcodes {

    public static class Mono implements OpcodeListener.OpCmd {

        short pointer_id;
        byte b;
        byte off;

        public Mono(short pointer_id, byte b, byte off) {
            this.pointer_id = pointer_id;
            this.b = b;
            this.off = off;
        }

        @Override
        public byte length() {
            return 6;
        }

        @Override
        public byte[] bytes() {
            ByteBuffer byteBuffer = ByteBuffer.allocate(6);
            byteBuffer.putShort(Opcodes.OUT);
            byteBuffer.putShort(pointer_id);
            byteBuffer.put(b);
            byteBuffer.put(off);
            byteBuffer.flip();
            return byteBuffer.array();
        }

        public static Mono code(String pointer_id, String b, String off){
            short ptr_id = Short.parseShort(pointer_id.substring(3, pointer_id.length()), 16);
            byte bite = Byte.parseByte(b.substring(2, b.length()), 16);
            byte offset = Byte.parseByte(off.substring(2, off.length()), 16);
            return new Mono(ptr_id, bite, offset);
        }
    }

}
