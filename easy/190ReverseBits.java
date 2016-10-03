public int reverseBits(int n) {
	int result = 0;
	for (int i = 0; i < 32; i++) {
		result |= (n >> i & 0x1) << (31 - i); 
	}
	return result;
}