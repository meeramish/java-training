package basics;

public class SalaryCalculator {
	public static void main(String[]args) {
		
	
//Let's create a variable to define our career
	String career;
	
	//Define variable
	career="Software Developer";
	
	
//computer our annual salary
	double rate= 34.55;
	int hoursPerWeek= 30;
	int weeksPerYear=40;
	double salary= rate*hoursPerWeek*weeksPerYear;
	System.out.println("My annual salary is $"+ salary + " as a "+ career);

}
} 