package OverloadingConstructors;

public class Employee {

	 String firstName, lastName;
	 String title, address, sex;
	 int age;
	
	Employee(String string, String string2, String string3, String string4){
		firstName = "N/A";
		lastName = "N/A";
		title = "N/A";
		address = "N/A";
		sex = "N/A";
		age = 0;
	}
	Employee(String firstName, String lastName, String title){
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		address = "N/A";
		sex = "N/A";
		age = 0;
		
	}


}
	
	
 

