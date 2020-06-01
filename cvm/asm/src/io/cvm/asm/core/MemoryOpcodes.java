package io.cvm.asm.core;

import io.cvm.asm.core.OpcodeListener.OpCmd;

import java.nio.ByteBuffer;

public class MemoryOpcodes implements OpCmd{

    short opcode;
    int off1, off2;

    public MemoryOpcodes(short opcode, int off1, int off2) {
        this.opcode = opcode;
        this.off1 = off1;
        this.off2 = off2;
    }

    @Override
    public byte length() {
        return 10;
    }

    @Override
    public byte[] bytes() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.putShort(opcode);
        byteBuffer.putInt(off1);
        byteBuffer.putInt(off2);
        byteBuffer.flip();
        return byteBuffer.array();
    }

    public static MemoryOpcodes code(short opcode, String off1, String off2){
        int offset1 = Integer.parseInt(off1.substring(3, off1.length()), 16);
        int offset2 = Integer.parseInt(off2.substring(3, off2.length()), 16);
        return new MemoryOpcodes(opcode, offset1, offset2);
    }
}
