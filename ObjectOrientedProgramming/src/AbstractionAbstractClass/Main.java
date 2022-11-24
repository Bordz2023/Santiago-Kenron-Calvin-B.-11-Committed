package AbstractionAbstractClass;

public class Main {

	public static void main(String[] args) {
		
		Animal d = new Dog();
		Animal c = new Cat();
		
		d.setName("Hershey");
		c.setName("Masha");
		
		d.showName();
		c.showName();

	}

}
