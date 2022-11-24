package ArrayOfObjects;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("How Many Students To Be Registered?");
		int size = s.nextInt();
		s.nextLine();
		
		Student students[] = new Student[size];
		
		for(int i = 0; i < students.length;i++) {
			
			String firstName, lastName, course;
			int year;
			char section;
			
			System.out.println("Student #" + (i+1));
			System.out.println();
			
			System.out.println("First Name : ");
			firstName =	s.nextLine();
			
			System.out.println("Last Name  : ");
			lastName =	s.nextLine();
			
			System.out.println("Course     : ");
			course =	s.nextLine();
			
			
			System.out.println("Year       : ");
			year = s.nextInt();
			s.nextLine();
			
			
			System.out.println("Section    : ");
			section = s.nextLine().charAt(0);
			
			students[i] = new Student(firstName, lastName, course, year, section);
			
		}
		
		for(Student stud:students) {
			stud.introduceSelf();
		}

	}

}
