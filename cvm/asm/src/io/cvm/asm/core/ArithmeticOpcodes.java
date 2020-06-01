package io.cvm.asm.core;


import java.nio.ByteBuffer;

public class ArithmeticOpcodes implements OpcodeListener.OpCmd {

    short opcode;
    int num1, num2, off;

    public ArithmeticOpcodes(short opcode, int num1, int num2, int off){
        this.num1 = num1;
        this.num2 = num2;
        this.off = off;
        this.opcode = opcode;
    }

    @Override
    public byte length() {
        return 14;
    }

    @Override
    public byte[] bytes() {
        ByteBuffer byteBuffer = ByteBuffer.allocate(14);
        byteBuffer.putShort(opcode);
        byteBuffer.putInt(num1);
        byteBuffer.putInt(num2);
        byteBuffer.putInt(off);
        byteBuffer.flip();
        return byteBuffer.array();
    }

    public static ArithmeticOpcodes code(short opcode, String num1, String num2, String off){
        int n1 = Integer.parseInt(num1.substring(2, num1.length()), 16);
        int n2 = Integer.parseInt(num2.substring(2, num2.length()), 16);
        int of = Integer.parseInt(off.substring(3, off.length()), 16);
        return new ArithmeticOpcodes(opcode, n1, n2, of);
    }
}