package Polymorphism;

public class WeakEnemy extends Enemy {

	WeakEnemy(){
		name = "Zharinna";
		hp = 10;
	}
	
	void dialog() {
		System.out.println(name + "I'am Weak");
	}
}
