package decimalToBinary;


public class Converter8 {
	
	int[] binary = new int[8];
	
	public Converter8() {
		convertArrayZero();
	}
	
	
	public int[] getBinary(int x) {
		if(x<0) {
			binary[0] = 1;
			x *= -1;
		}
		
		int i = binary.length-1;
		while(x!=0 && i != 0) {
			binary[i--] = x % 2;
			x /= 2;
		}
		return binary;
	}
	
	private void convertArrayZero() {
		int i = 0;
		while(i<binary.length) {
			binary[i++] = 0;
		}
	}

}
