package Constructors;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Product p  = new Product();
		  Product p1 = new Product();
		  Product p2 = new Product();
		  Product p3 = new Product(); */
		
		/*Person per  = new Person();
		  Person per1 = new Person();
		  Person per2 = new Person();
		  Person per3 = new Person(); */
		
		/*Product p =  new Product("Lemon ", 150.0f);
		  Product p1 = new Product("Orange ", 100.0f);
		  Product p2 = new Product("Apple ", 50.0f); */
		
		/*Person p = new Person("Kenron", "Calvin", 'M', 16);
		Person p1 = new Person("Zharinna", "Grace", 'F', 15);
		System.out.println(p.firstname);
		System.out.println(p1.firstname); */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Name : ");
		String name = s.nextLine();
		System.out.print("Price : ");
		float price = s.nextFloat();
		
		
		Product p = new Product(name, price);
		
		
		
	 }

}
