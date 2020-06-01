package io.cvm.cpu;

import javax.naming.OperationNotSupportedException;

public class CPtr implements Pointer{

	int location;
	int len;
	
	protected CPtr(int location, int len) {
		super();
		this.location = location;
		this.len = len;
	}

	@Override
	public void point_to(int location, int len) {
		throw new RuntimeException(new OperationNotSupportedException("Updating constant pointers!"));
	}

	@Override
	public byte[] points_to(Memory memory) {
		byte[] dat = memory.getconstant(this);
		return dat;
	}

	@Override
	public int[] addr() {
		return new int[]{location,len};
	}

}
