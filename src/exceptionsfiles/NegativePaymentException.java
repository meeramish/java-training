package exceptionsfiles;

public class NegativePaymentException extends Exception {
	// define class variable
	double payment;
	
	//Constructor that takes the value that would take the exception
	public NegativePaymentException(double payment) {
	this.payment=payment;
}
	//3. Override the toString method () to include the specific exception method
	public String toString() {
		return "Error: cannot take negative amount";
	}
}

