package LESSONS;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Genmath : ");
		float genmathGrade = s.nextFloat();
		System.out.print("Science : ");
		float scienceGrade = s.nextFloat();
		System.out.print("Perdev : ");
		float perdevGrade = s.nextFloat();
		System.out.print("Ict : ");
		float ictGrade = s.nextFloat();
		
		float average = (genmathGrade + scienceGrade + perdevGrade + ictGrade) /4;
		
		System.out.println();
		System.out.println("Average : " + average);
		
		if      (average > 100) System.out.println("Invalid Grade");
		else if (average >= 98) System.out.println("With Highest Honor");
		else if (average >= 95) System.out.println("With High Honor");
		else if (average >= 90) System.out.println("With Honor");
		else if (average >= 75) System.out.println("Passed");
		else                    System.out.println("Failed");
	}

}
