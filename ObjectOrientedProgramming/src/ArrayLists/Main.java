package ArrayLists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Ken", "Ict"));
		students.add(new Student("James", "Ict"));
		students.add(new Student("Rei", "Ict"));
		
		for(int i = 0; i < students.size();i++) {
			students.get(i).introduce();
		}
		
		
	}

}
