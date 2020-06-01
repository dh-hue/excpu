package io.cvm.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.cvm.cpu.CPU;
//import io.cvm.cpu.CPtr;
import io.cvm.cpu.Memory;
import io.cvm.cpu.Opcodes;
import io.cvm.utils.ByteUtils;

public class Test {
	
	public static void main(String[] args){
		Opcodes.all_opcodes();
		
		Memory memory = new Memory(Memory.PROGRAM_OFF);	// Instantiate the memory
		// The program
		try {
			//System.out.println(Arrays.toString(ByteUtils.fromInt(1024)));
			memory.loadprogram(new FileInputStream("test.cx.bin"));
			//System.out.println(Arrays.toString(Arrays.copyOfRange(memory.mem, Memory.PROGRAM_OFF, 100)));
		} catch (FileNotFoundException e) {
			Logger.getLogger(Test.class.getName()).log(Level.SEVERE, "could not load file!", e);
		}
		
//		byte[] DIV = ByteUtils.fromShort(Opcodes.DIV);
//		byte[] num1 = ByteUtils.fromInt(12);
//		byte[] num2 = ByteUtils.fromInt(4);
//		byte[] memoff = ByteUtils.fromInt(0xFFA);
//		byte[] start = {(byte) (DIV.length + num1.length + num2.length + memoff.length), DIV[0], DIV[1]};
//		byte[] end = ByteUtils.concat(ByteUtils.concat(num1, num2), memoff);
//		byte[] divcmd = ByteUtils.concat(start, end);
//
//		byte[] HLT = ByteUtils.fromShort(Opcodes.HLT);
//		byte[] halt = {(byte)HLT.length, HLT[0], HLT[1]};
		
		//System.out.println(Arrays.toString(divcmd));
		//System.out.println(Arrays.toString(halt));
		
//		byte[] program = ByteUtils.concat(divcmd, halt);
//		memory.injectInt(program.length, Memory.PROGRAM_LEN_OFF);
//		memory.inject(program, Memory.PROGRAM_OFF, program.length, 0);
		
		//System.out.println(Arrays.toString(Arrays.copyOfRange(memory.mem, Memory.PROGRAM_OFF, 100)));
		
		//CPU
		CPU cpu = new CPU(memory);	// Create the CPU with the memory
		cpu.program_protect();	// Protect program data from being moved around
		cpu.interpret();	// Interpret the opcodes and the program
		//System.out.println(memory.mem[1] == memory.mem[0x32]);
	}

}
