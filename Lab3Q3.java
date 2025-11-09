import java.util.Scanner;

public class  Lab3Q3{
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Rupee amount: ");
		
		int amount = input.nextInt();
		
		int Count5000 = amount / 5000;
		
		amount = amount % 5000;
		
		System.out.println("5000 Notes - " + Count5000);
		
		int Count1000 = amount / 1000;
		
		amount = amount % 1000;
		
		System.out.println("1000 Notes - " + Count1000);
		
		int Count500 = amount / 500;
		
	    amount = amount % 500;
		
		System.out.println("500 Notes - " + Count500);
		
		int Count200 = amount / 200;
		
		amount = amount % 200;
		
		System.out.println("200 Notes - " + Count200);
		
		int Count100 = amount / 100;
		
		amount = amount % 100;
		
		System.out.println("100 Notes - " + Count100);
		
		int Count50 = amount / 50;
		
		amount = amount % 50;
		
		System.out.println("50 Notes - " + Count50);
		
		int Count20 = amount / 20;
		
		amount = amount % 20;		
		
		System.out.println("20 Notes - " + Count20);
		
		int Count10 = amount / 10;
		
		amount = amount % 10;
		
		System.out.println("10 Coins - " + Count10);
		
		int Count05 = amount / 5;
		
		amount = amount % 5;
		
		System.out.println("05 Coins - " + Count05);
		
		int Count02 = amount / 2;
		
		amount = amount % 2;
		
		System.out.println("02 Coins - " + Count02);
		
		int Count01 = amount / 1;
		
		amount = amount % 1;
		
		System.out.println("01 Coins - " + Count01);
		
	}


}