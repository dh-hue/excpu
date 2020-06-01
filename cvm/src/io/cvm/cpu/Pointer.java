package io.cvm.cpu;

public interface Pointer {

	void point_to(int location, int len);
	byte[] points_to(Memory memory);
	
	int[] addr();
	
}
