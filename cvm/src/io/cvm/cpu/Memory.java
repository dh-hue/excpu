package io.cvm.cpu;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import io.cvm.utils.ByteUtils;

public class Memory {
	
	public byte[] mem = new byte[1024 * 1024 * 5];	// 5MB memory
	int pc;	// Program counter
	
	// Some constants
	
	// Global Locations
	public static final int PROGRAM_LEN_OFF = 0xF;	// Offset - 15
	public static final int PROGRAM_OFF = PROGRAM_LEN_OFF + 4;
	public static final int TIMESTAMP_OFF = 0x0; // Offset - 0
	public static final int CONSTANTS_OFF = 0x400000; // Offset - 4th Megabyte 
	
	private int cur_const_loc = CONSTANTS_OFF;
	
	public Memory(int start_off) {
		System.out.println("Internal Memory: " + mem.length + "bytes");
		pc = start_off;
		timestamp();
	}
	
	public void inject(byte[] data, int mem_off, int len, int off){
		for(int x = off; x < len; x++){
			mem[x+mem_off] = data[x];
		}
	}
	
	
	public void injectInt(int integer, int location){
		byte[] intdata = ByteUtils.fromInt(integer);
		inject(intdata, location, 4, 0);
	}
	
	/**
	 * Stores the start up time.
	 */
	private void timestamp(){
		String date = new SimpleDateFormat("dd-MM-yy-mm-HH-ss").format(new Date());
		//System.out.println(date);
		String[] toki = date.split("-");
		int[] ints = new int[toki.length];
		for (int i = 0; i < toki.length; i++) {
			String string = toki[i];
			ints[i] = Integer.parseInt(string);
		}
		byte[] timedata = new byte[ints.length];
		for (int i = 0; i < ints.length; i++) {
//			System.out.println(ints[i]);
			timedata[i] = (byte)ints[i];
		}
		inject(timedata,TIMESTAMP_OFF, timedata.length, 0);
//		System.out.println(Arrays.toString(timedata));
	}

	public void loadprogram(InputStream inputStream){
		ByteArrayOutputStream buffer = new ByteArrayOutputStream();

		int nRead;
		byte[] data = new byte[16384];

		try {
			while((nRead = inputStream.read(data, 0, data.length)) != -1){	// Loop till EOF
				buffer.write(data, 0, nRead);
			}
			buffer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] program_data = buffer.toByteArray();
		injectInt(program_data.length, PROGRAM_LEN_OFF);
		inject(program_data, PROGRAM_OFF, program_data.length, 0);	// Inject program source at 0xF offset
	}
	
	public CPtr addconstant(byte[] data, int off, int len){
		int data_offset = cur_const_loc;
		inject(data, cur_const_loc, len, off);
		cur_const_loc += len;
		return new CPtr(data_offset - CONSTANTS_OFF, len);
	}
	
	public byte[] getData(int location_from, int location_to){
		//System.out.println(location_from + " - " + location_to);
		return Arrays.copyOfRange(mem, location_from, location_to);	// Return bytes from location_from to location_to
	}
	
	public void move(int locationf, int locationt){
		// Copy the data
		byte f = mem[locationf];
		mem[locationt] = f;
		// Free the old one
		mem[locationf] = (byte)0;
	}
	
	public void copy(int locationf, int locationt){
		mem[locationt] = mem[locationf];
	}
	
	public int readInt(int location){
		byte[] int_data = Arrays.copyOfRange(mem, location, location+4);
		//System.out.println(Arrays.toString(int_data));
		ByteBuffer buffer = ByteBuffer.wrap(int_data);
		return buffer.getInt();
	}
	
	public byte[] getconstant(CPtr pointer){
		// Copy a range of values from the memory
		int soff = pointer.location + CONSTANTS_OFF;	// The start location, the starting offset of the memory where the value is contained
		int eoff = pointer.location + CONSTANTS_OFF + pointer.len; // The end location
		return Arrays.copyOfRange(mem, soff, eoff);
	}
	
	protected static CPtr getConstantPointer(int location, int len){
		return new CPtr(location, len);
	}
	
}
