package basics;

public class NumbersCalc {

	public static void main(String[]args) {
		int numA=10;
		int numB= 25;
		addingNumbers(numA, numB);
		int product=multiplyNumbers(numA, numB);
		System.out.println(product);
	}
	
	public static void addingNumbers(int numberA, int numberB) {
		int sum= numberA+numberB;
		System.out.println("Sum of "+numberA+" and "+numberB+" is "+ sum);
	}
	public static int multiplyNumbers(int valueA, int valueB) {
		int product= valueA*valueB;
		addingNumbers(product, product*3);
		return product;
		
	}
}
