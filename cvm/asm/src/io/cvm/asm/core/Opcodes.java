package io.cvm.asm.core;

import java.util.Arrays;

public class Opcodes {

	// Regular important based opcodes
	static final short MOV = 0xFF1;
	public static final short LDI = 0xFF3;
	public static final short LDO = 0xFF5;
	static final short CPY = 0xFF7;
	static final short HLT = 0xFFF;
	
	// Simple constant arithmetic
	static final short ADD = 0xFF9;
	static final short SUB = 0xFFA;
	static final short MUL = 0xFFC;
	static final short DIV = 0xFFD;

	// Variable Arithmetic
	static final short ADDV = 0xBF9;
	static final short SUBV = 0xBFA;
	static final short MULV = 0xBFC;
	static final short DIVV = 0xBFD;
	
	//Long Byte Transfer
	static final short MOVL = 0XFFE;
	static final short CPYL = 0x1000;
	
	//Device Output
	static final short OUT = 0x1001;
	static final short OUTL = 0x1002;
	
	//Set value
	static final short SET = 0xAFA;
	static final short SETL = 0XAFB;
	
	// Graphic based opcodes
	public static final short GFXP = 0xFF0;
	public static final short GFXC = 0xFF2;
	
	public static  void all_opcodes(){
		System.out.println("MOVE:"+bytestrings(MOV));
		System.out.println("MOVEL:"+bytestrings(MOVL));
		System.out.println("ADD:"+bytestrings(ADD));
		System.out.println("SUB:"+bytestrings(SUB));
		System.out.println("MUL:"+bytestrings(MUL));
		System.out.println("DIV:"+bytestrings(DIV));
		System.out.println("COPY:"+bytestrings(CPY));
		System.out.println("COPYL:"+bytestrings(CPYL));
		System.out.println("OUT:"+bytestrings(OUT));
		System.out.println("OUTL:"+bytestrings(OUTL));
		System.out.println("SET:"+bytestrings(SET));
		System.out.println("SETL:"+bytestrings(SETL));
		System.out.println("ADDV:"+bytestrings(ADDV));
		System.out.println("MULV:"+bytestrings(MULV));
		System.out.println("SUBV:"+bytestrings(SUBV));
		System.out.println("DIVV:"+bytestrings(DIVV));
		System.out.println("HALT:"+bytestrings(HLT));
	}
	
	private static String bytestrings(short opcode){
		byte[] opdata = ByteUtils.fromShort(opcode);
		int[] converted = {ByteUtils.unsignedToBytes(opdata[0]),ByteUtils.unsignedToBytes(opdata[1])};
		String[] hex = {Integer.toHexString(converted[0]),Integer.toHexString(converted[1])};
		return Arrays.toString(hex) + ":" + Arrays.toString(opdata);
	}

}
