package basics;

public class Weather {
public static void main(String[]args) {
	//This program will tell us what to wear according to weather(temperature)
	int temperature=35;
	String sunCondition="Overcast";
	
	if(temperature>80 && sunCondition!="Sunny") {
		System.out.println("Wear loose cotton clothes.");
		
	}else if(temperature>60 || sunCondition=="Sunny") {
		System.out.println("Wear what is comfortable.");
	} else {
		System.out.println("Wear jackets");
	}
}
}
