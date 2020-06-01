package io.cvm.cpu;

import java.io.IOException;
import java.io.OutputStream;

import javax.naming.OperationNotSupportedException;

public class OutDevPtr implements Pointer {

	OutputStream stream;
	
	public OutDevPtr(OutputStream stream) {
		this.stream = stream;
	}

	@Override
	public void point_to(int location, int len) {
		throw new RuntimeException(new OperationNotSupportedException("Device Pointers cannot be repointed!"));
	}

	@Override
	public byte[] points_to(Memory memory) {
		throw new RuntimeException(new OperationNotSupportedException("Device Pointer!"));
	}

	@Override
	public int[] addr() {
		return null;
	}
	
	public void write(byte[] data, int off) {
		try {
			stream.write(data, off, data.length - off);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void write(byte data, int off){
		try {
			stream.write(new byte[]{data}, off, 1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
