package LESSONS;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {

Scanner s = new Scanner(System.in);
		
		int lives = 3;
		String answer;
		
		while(lives > 0) {
			 System.out.println("Who created JAVA?");
			 System.out.print("Answer :");
			 answer = s.nextLine();
			 
			 
		if(answer.equalsIgnoreCase("James Gosling")) break;
		else lives --;	  
		}
		if(lives > 0) System.out.println("Correct");
		else System.out.println("Wrong Answer, Please Try Again");
	}

}
