import java.util.Scanner;

public class Lab3Q1A{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		
		double price1kg = input.nextDouble();
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		
		Scanner add = new Scanner(System.in);
		
		double noofkg = add.nextDouble();
		
		Scanner addd = new Scanner(System.in);
		
		double sum = price1kg * noofkg;
		
		System.out.println("The total amount is: " + sum);
	}
}