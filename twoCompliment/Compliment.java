package twoCompliment;

public class Compliment {

	public int[] getTwoCompliment(int[] binary) {
		
		int i = binary.length-1;
		while(i>0) {
			if(binary[i] == 1) {
				binary[i--] = 0;
			}
			else {
				binary[i--] = 1;
			}
		}
		
		i = binary.length-1;
		while(binary[i]!=0)
			binary[i--] = 0;
		
		binary[i] = 1;
		
		return binary;
	}
}
