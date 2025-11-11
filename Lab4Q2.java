import java.util.Scanner;

public class Lab4Q2 {
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
	double exammarks, labsubmark, exampercent, labsubpercent, result;
		
		
	System.out.println("Please enter exam marks (out of 100) : ");
	
        exammarks = input.nextDouble();
		
		
		if (exammarks < 0 || exammarks > 100) {
			
			System.out.println("Invalid input for exam marks. Terminating program. ");
			
		
			return;
		}
			
		
	System.out.println("Please enter lab submission marks (out of 100) : ");
		
		labsubmark = input.nextDouble();
		

		if (labsubmark < 0 || labsubmark > 100) {
			
			System.out.println("Invalid input for lab submission marks. Terminating program. ");
			
		
			return;
		}
		
		
	System.out.println("Please enter the percentage given for the exam : ");

		exampercent = input.nextDouble();
		
		
		if (exampercent < 0 || exampercent > 100) {
			
			System.out.println("Invalid input for exam percentage. Terminating program. ");
			
		
			return;
		}
		
	System.out.println("Please enter the percentage given for the lab submission : ");
	
		labsubpercent = input.nextDouble();
		
		
		if (labsubpercent < 0 || labsubpercent > 100) {
			
			System.out.println("Invalid input for lab submission percentage. Terminating program. ");
		
		
			return;
			
		}
		
				if (exampercent + labsubpercent != 100) {
					
					System.out.println("The percentages must add up to 100. Terminating program. ");
					
				
					return;
					
				}
				
		result = (exammarks * exampercent / 100) + (labsubmark * labsubpercent / 100);
	
	
	System.out.println(" Final Exam Mark is : " + result);
	
			
			
			
	}
}