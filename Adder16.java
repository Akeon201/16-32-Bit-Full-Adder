import adder.SixteenAdder;

public class Adder16 {

	public static void main(String[] args) {
	
		SixteenAdder adder = new SixteenAdder(50, 500);
		
		System.out.println("First Number in Decimal: " + adder.getDecimal1());
		System.out.println("Second Number in Decimal: " + adder.getDecimal2() + "\n");
		
		System.out.print("First Number in Binary: ");
		for(int x: adder.getBinary1())
			System.out.print(x);
		System.out.print("\nSecond Number in Binary: ");
		for(int x: adder.getBinary2())
			System.out.print(x);
		
		System.out.println("\n\nSum in Decimal: " + (adder.getDecimal1() + adder.getDecimal2()));
		System.out.print("Sum in Binary: ");
		for(int x: adder.getSum())
			System.out.print(x);
		
		System.out.println("\n\nOverFlow: " + adder.checkOverFlow());
		
		System.out.println("\n\n------------------------------------------------\n\n");

		adder = new SixteenAdder(-1227, 9537);
		
		System.out.println("First Number in Decimal: " + adder.getDecimal1());
		System.out.println("Second Number in Decimal: " + adder.getDecimal2() + "\n");
		
		System.out.print("First Number in Binary: ");
		for(int x: adder.getBinary1())
			System.out.print(x);
		System.out.print("\nSecond Number in Binary: ");
		for(int x: adder.getBinary2())
			System.out.print(x);
		
		System.out.println("\n\nSum in Decimal: " + (adder.getDecimal1() + adder.getDecimal2()));
		System.out.print("Sum in Binary: ");
		for(int x: adder.getSum())
			System.out.print(x);
		
		System.out.println("\n\nOverFlow: " + adder.checkOverFlow());
		
		
		System.out.println("\n\n------------------------------------------------\n\n");

		adder = new SixteenAdder(32760, 127);
		
		System.out.println("First Number in Decimal: " + adder.getDecimal1());
		System.out.println("Second Number in Decimal: " + adder.getDecimal2() + "\n");
		
		System.out.print("First Number in Binary: ");
		for(int x: adder.getBinary1())
			System.out.print(x);
		System.out.print("\nSecond Number in Binary: ");
		for(int x: adder.getBinary2())
			System.out.print(x);
		
		System.out.println("\n\nSum in Decimal: " + (adder.getDecimal1() + adder.getDecimal2()));
		System.out.print("Sum in Binary: ");
		for(int x: adder.getSum())
			System.out.print(x);
		
		System.out.println("\n\nOverFlow: " + adder.checkOverFlow());
		
		System.out.println("\n\n------------------------------------------------\n\n");

		adder = new SixteenAdder(-760, 127);
		
		System.out.println("First Number in Decimal: " + adder.getDecimal1());
		System.out.println("Second Number in Decimal: " + adder.getDecimal2() + "\n");
		
		System.out.print("First Number in Binary: ");
		for(int x: adder.getBinary1())
			System.out.print(x);
		System.out.print("\nSecond Number in Binary: ");
		for(int x: adder.getBinary2())
			System.out.print(x);
		
		System.out.println("\n\nSum in Decimal: " + (adder.getDecimal1() + adder.getDecimal2()));
		System.out.print("Sum in Binary: ");
		for(int x: adder.getSum())
			System.out.print(x);
		
		System.out.println("\n\nOverFlow: " + adder.checkOverFlow());
		
		
	}

}
