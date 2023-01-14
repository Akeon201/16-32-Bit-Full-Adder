package adder;

import decimalToBinary.Converter16;
import twoCompliment.Compliment;

public class SixteenAdder {
	
	final int LEN = 16;

	int decimal1;
	int decimal2;
	int[] binary1;
	int[] binary2;
	int[] sum = new int[LEN];
	int[] cOut = new int[LEN];

	public SixteenAdder(int one, int two) {
		decimal1 = one; decimal2 = two;
		
		setArrays();

		convertCompliment();
		
		addNumbers();

	}

	private int[] convertArrayZero(int[] x) {
		int i = 0;
		while (i < x.length) {
			x[i++] = 0;
		}
		return x;
	}

	private void setArrays() {
		this.sum = convertArrayZero(sum);
		this.cOut = convertArrayZero(cOut);
	}

	private void convertCompliment() {

		if (decimal1 < 0) {
			Compliment compliment = new Compliment();
			Converter16 converter = new Converter16();
			int[] temp = converter.getBinary(decimal1);
			this.binary1 = compliment.getTwoCompliment(temp);
		}

		if (decimal2 < 0) {
			Compliment compliment = new Compliment();
			Converter16 converter = new Converter16();
			int[] temp2 = converter.getBinary(decimal2);
			this.binary2 = compliment.getTwoCompliment(temp2);
		}
		

		if (decimal1 > 0) {
			Converter16 converter = new Converter16();
			this.binary1 = converter.getBinary(decimal1);
		}

		if (decimal2 > 0) {
			Converter16 converter = new Converter16();
			this.binary2 = converter.getBinary(decimal2);
		}

	}

	private void addNumbers() {
		int i = binary1.length-1;
		int temp = 0;
		
		while(i>=0) {
			if(i == binary1.length-1) {
				temp = binary1[i] + binary2[i];

			}
			else {
				temp = binary1[i] + binary2[i] + cOut[i+1];
			}
			
			
			if(temp == 3) {
				sum[i] = 1;
				cOut[i] = 1;
			} 
			else if(temp == 2) {
				cOut[i] = 1;
			}
			else if(temp == 1) {
				sum[i] = 1;
			}
			
			i--;
		}
		
		if(decimal1 + decimal2 < 0) {
			Compliment compliment = new Compliment();
			sum = compliment.getTwoCompliment(sum);
		}
			
		
	}
	
	public int[] getBinary1() {
		Converter16 converter = new Converter16();
		return converter.getBinary(decimal1);
	}
	
	public int[] getBinary2() {
		Converter16 converter = new Converter16();
		return converter.getBinary(decimal2);
	}
	
	public int[] getSum() {
		return sum;
	}
	
	public int checkOverFlow() {
		if ((cOut[0] + cOut[1]) == 1 || decimal1 > 32767 || decimal1 < -32767 || decimal2 < -32767 || decimal2 > 32767) {
			return 1;
		}
		
		return 0;
	}
	
	public int getDecimal1() {
		return decimal1;
	}
	
	public int getDecimal2() {
		return decimal2;
	}

}