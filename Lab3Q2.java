import java.util.Scanner;

public class Lab3Q2{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the monthly salary:");
		
		double monthlysalary = input.nextDouble();
		
		Scanner add = new Scanner(System.in);
		
		System.out.print("Enter the number of OT hours: ");
		
		double noofothrs = add.nextDouble();
		
		Scanner addd = new Scanner(System.in);
		
		System.out.print("Enter the OT hourly rate: ");
		
		double othrlyrate = add.nextDouble();
		
		double sum = noofothrs * othrlyrate ;
		
		double finalsum = monthlysalary + sum ;
		
		System.out.println("The total salary including OT is: " + finalsum );
	}
}