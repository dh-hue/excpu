package io.cvm.cpu;

public class VPtr implements Pointer{

	public int location, len;
	
	public VPtr(int location, int len) {
		super();
		this.location = location;
		this.len = len;
	}

	@Override
	public void point_to(int location, int len) {
		this.location = location;
		this.len = len;
	}

	@Override
	public byte[] points_to(Memory memory) {
		byte[] dat = memory.getData(location, location + len);
		return dat;
	}

	@Override
	public int[] addr() {
		// TODO Auto-generated method stub
		return new int[]{location,len};
	}

	

}
