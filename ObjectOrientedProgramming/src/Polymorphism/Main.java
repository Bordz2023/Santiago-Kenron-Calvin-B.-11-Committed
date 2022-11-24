package Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Enemy we = new WeakEnemy();
		Enemy se = new StrongEnemy();
		
		se.showStats();
		se.dialog();
		
		we.showStats();
		we.dialog();
		
	}

}
