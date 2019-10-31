package exceptionsfiles;

import java.util.Scanner;

public class PaymentApp {
public static void main(String[]args) {
	double payment=0;
	boolean positivePymt= true;
	//1.Ask the user for input
	
	
	
	do {
		//1.Ask the user for input
		System.out.print("Enter Amount:");
		
		//2. Get the amount and test the value	
	Scanner in= new Scanner(System.in);
	try {
		payment= in.nextDouble();
		if(payment<0) {
			throw new NegativePaymentException();
		}else {
			positivePymt=true;
		}
	}catch(NegativePaymentException e) {
			System.out.println(e.toString());
			positivePymt= false;
		}
	}while(!positivePymt);
	System.out.println("Thank you for your payment of $"+ payment);
}
}
