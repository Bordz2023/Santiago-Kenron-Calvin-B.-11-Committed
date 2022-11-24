package LESSONS;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String[] usernames = {"Kenron","Cyrus","Joeceff","James"};
		String[] passwords = {"kenron","cyrus","joeceff","james"};
		
		System.out.print("Username :");
		String username = s.nextLine();
		
		System.out.print("Password :");
		String password = s.nextLine();
		
		boolean isExist = false;
		
		
		for(int i = 0; i < usernames.length;i++) {
			
			if(username.equals(usernames[i]) && password.equals(passwords[i])){			
				isExist = true;
				break;
			}
			
		}
		if(isExist) System.out.println("Welcome, " + username);
		else System.out.println("Account Not Found");


	}

}
