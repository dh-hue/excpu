
package io.cvm.cpu;

import java.nio.ByteBuffer;
import java.util.Arrays;

import io.cvm.utils.ByteUtils;
import io.cvm.utils.LimitedHashMap;

public class CPU {

	public Memory memory;
	byte[] codes;
	
	int instrcounter;
	int program_end_location;
	
	LimitedHashMap<Short, Pointer> pointer_table = new LimitedHashMap<>(127);
	
	public CPU(Memory memory) {
		this.memory = memory;
		pointer_table.put((short) 0, new OutDevPtr(System.out));	// Put the STDOUT as a Output Device Pointer
	}
	
	@Deprecated
	public void findCode(){
		int program_len = memory.readInt(Memory.PROGRAM_LEN_OFF);
		int program_location = Memory.PROGRAM_OFF;
		byte[] program  = memory.getData(program_location, program_location + program_len);
		this.codes = program;
	}
	
	public void program_protect(){
		int program_len = memory.readInt(Memory.PROGRAM_LEN_OFF);
		this.program_end_location = Memory.PROGRAM_OFF + program_len;
	}
	
	public void interpret(){
		instrcounter = 0;
		System.out.println("Beginning execution");
		int cmd_len = memory.mem[memory.pc];
		memory.pc++;
		byte[] cmd = memory.getData(memory.pc, memory.pc + cmd_len);
		int result = process(ByteBuffer.wrap(cmd));
		memory.pc += cmd.length;
		instrcounter++;
		while(result == 0){
			cmd_len = memory.mem[memory.pc];
			memory.pc++;
			cmd = memory.getData(memory.pc, memory.pc + cmd_len);
			result = process(ByteBuffer.wrap(cmd));
			memory.pc += cmd.length;
			instrcounter++;
		}
		if(result == -1){
			System.out.println("Command" + Arrays.toString(cmd) + " Could not be executed");
		}
		//System.out.println(Arrays.toString(cmd));
		System.out.println("Execution Halted!");
	}
	
	private int process(ByteBuffer buffer){
		int count = 0;
		//System.out.println(count);
		short opcode = buffer.getShort(count);
		count += 2;
		//System.out.println(opcode);
		if(opcode == Opcodes.MOV){
//			System.out.println("Move detected!");
			int from = buffer.getInt(count);
			count += 4;
			int to = buffer.getInt(count);
			count += 4;
			System.out.println("move from:" + from + " move to:" + to);
			memory.move(from, to);
			return 0;
		}
		if(opcode == Opcodes.MOVL){
			int from = buffer.getInt(count);
			count+=4;
			int to = buffer.getInt(count);
			count+=4;
			short length = buffer.getShort(count);
			count+=2;
			for (int x = 0; x < length; x++) {
				memory.move(from+x, to+x);
			}
		}
		if(opcode == Opcodes.CPY){
//			System.out.println("Copy detected");
			int from = buffer.getInt(count);
			count += 4;
			int to = buffer.getInt(count);
			count += 4;
			memory.copy(from, to);
			return 0;
		}
		if(opcode == Opcodes.CPYL){
			int from = buffer.getInt(count);
			count += 4;
			int to = buffer.getInt(count);
			count += 4;
			short length = buffer.getShort(count);
			count += 2;
			for (int x = 0; x < length; x++) {
				memory.copy(from+x, to+x);
			}
		}
		if(opcode == Opcodes.ADD){
//			System.out.println("Add detected");
			int num1 = buffer.getInt(count);
			count += 4;
			int num2 = buffer.getInt(count);
			count += 4;
//			System.out.println(num1+ " + "+num2);
			int off = buffer.getInt(count);
			//int end = num1 + num2;
			memory.injectInt(num1 + num2, off);
			return 0;
		}
		if(opcode == Opcodes.SUB){
//			System.out.println("Subtract detected!");
			int num1 = buffer.getInt(count);
			count += 4;
			int num2 = buffer.getInt(count);
			count += 4;
			int off = buffer.getInt(count);
			memory.injectInt(num1 - num2, off);
			return 0;
		}
		if(opcode == Opcodes.MUL){
//			System.out.println("Multiplicaton detected");
			int num1 = buffer.getInt(count);
			count += 4;
			int num2 = buffer.getInt(count);
			count += 4;
			int off = buffer.getInt(count);
			memory.injectInt(num1 * num2, off);
			return 0;
		}
		if(opcode == Opcodes.DIV){
//			System.out.println("Division detected");
			int num1 = buffer.getInt(count);
			count += 4;
			int num2 = buffer.getInt(count);
			count += 4;
			int off = buffer.getInt(count);
			memory.injectInt(num1 / num2, off);
			return 0;
		}
		if(opcode == Opcodes.HLT){
			System.out.println("halting....");
			return 1;
		}
		if(opcode == Opcodes.ADDV){
			int off1 = buffer.getInt(count);
			count += 4;
			int off2 = buffer.getInt(count);
			count += 4;
			int num1 = ByteUtils.toInt(memory.getData(off1 ,off1+5));
			int num2 = ByteUtils.toInt(memory.getData(off2 ,off1+5));
			memory.injectInt(num1+num2, off2);

		}
		if(opcode == Opcodes.SUBV){
			int off1 = buffer.getInt(count);
			count += 4;
			int off2 = buffer.getInt(count);
			count += 4;
			int num1 = ByteUtils.toInt(memory.getData(off1 ,off1+5));
			int num2 = ByteUtils.toInt(memory.getData(off2 ,off1+5));
			memory.injectInt(num1-num2, off2);

		}
		if(opcode == Opcodes.MULV){
			int off1 = buffer.getInt(count);
			count += 4;
			int off2 = buffer.getInt(count);
			count += 4;
			int num1 = ByteUtils.toInt(memory.getData(off1 ,off1+5));
			int num2 = ByteUtils.toInt(memory.getData(off2 ,off1+5));
			memory.injectInt(num1*num2, off2);

		}
		if(opcode == Opcodes.DIVV){
			int off1 = buffer.getInt(count);
			count += 4;
			int off2 = buffer.getInt(count);
			count += 4;
			int num1 = ByteUtils.toInt(memory.getData(off1 ,off1+5));
			int num2 = ByteUtils.toInt(memory.getData(off2 ,off1+5));
			memory.injectInt(num1/num2, off2);

		}
		if(opcode == Opcodes.SETL){
			//System.out.println("Found SETL");
			int memoff = buffer.getInt(count);
			//System.out.println(memoff);
			count+= 4;
			int numofbytes = buffer.limit() - count - 1;
			for (int x = 0; x < numofbytes; x++) {
				memory.mem[memoff + x] = buffer.get(count);
				count++;
			}
			return 0;
		}
		if(opcode == Opcodes.OUT){
			short ptr_id = buffer.getShort(count);
			count+=2;
			Pointer ptr = lookup_pointer(ptr_id);
			if(ptr instanceof OutDevPtr){
				byte val = buffer.get(count);
				count++;
				byte offset = buffer.get(count);
				((OutDevPtr)ptr).write(val, offset);
			} else {
				System.err.println("Error: Pointer at " + Integer.toHexString((int)ptr_id) + " is not an output device pointer");
				return -1;
			}
			return 0;
		}
		if(opcode == Opcodes.OUTL){
			short ptr_id = buffer.getShort(count);
			count+=2;
			Pointer ptr = lookup_pointer(ptr_id);
			if(ptr instanceof OutDevPtr){
				int numofbytes = buffer.limit() - count - 1;
				byte[] data = new byte[numofbytes];
				for (int x = 0; x < numofbytes; x++) {
					data[x] = buffer.get(count);
					count++;
				}
				//scount++;
				byte offset = buffer.get(count);
				//System.out.println(new String(data));
				((OutDevPtr)ptr).write(data, offset);
			} else {
				System.err.println("Error: Pointer at " + Integer.toHexString((int)ptr_id) + " is not an output device pointer");
				return -1;
			}
			return 0;
		}
		if(opcode == Opcodes.SET){
			int memoff = buffer.get(count);
			count++;
			byte b = buffer.get(count);
			memory.mem[memoff] = b;
			return 0;
		}
		else{
			return -1;
		}
	}
	
	public Pointer lookup_pointer(short id){
		if((id % 8) == 0){
			Pointer pointer = pointer_table.get(id);
			return pointer;
		}  else {
			throw new RuntimeException(new IllegalArgumentException("All ids are multiples of 8 where as" + id +" is not!"));
		}
	}

}
