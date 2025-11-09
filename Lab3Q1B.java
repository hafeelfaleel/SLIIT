import java.util.Scanner;

public class Lab3Q1B{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the price of 1kg of rice: ");
		
		double priceperkg = input.nextDouble();
		
		Scanner add = new Scanner(System.in);
		
		System.out.print("Enter the number of kilograms you want to buy: ");
		
		double noofkg = add.nextDouble();
		
		double sum = priceperkg * noofkg;
		
		double discount = sum * 90 / 100 ;
		
		System.out.println("The total amount with 10% discount is: " + discount);
		
		
		
	}
}