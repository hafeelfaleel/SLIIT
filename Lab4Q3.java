import java.util.Scanner;

public class Lab4Q3 {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		
	double number;
	
	String message;
	
		
	System.out.println("Enter a number : ");
	
		number = input.nextDouble();
		
	
	message = (number > 0) ? "The number is : Positive" : (number < 0) ? "The number is: Negative" : "The number is: Zero";
	
	
	System.out.println(message);
	
	
	}
}