package inheritance;

public class Main {

	public static void main(String[] args) {
 
		Person p = new Person("Ken", "Male", 16);
		Toddler t = new Toddler ("Josh", "Female", 16, "Valorant");
		Kid k = new Kid ("James", "Male", 16, "Mobile Legends", 11);
		
		/*p.name = "Ken";
		p.sex = "Male";
		p.age = 16;
		
		t.name = "Josh";
		t.sex = "Female";
		t.age = 16;
		t.favoriteGame();
		
		k.name = "James";
		k.sex = "Male";
		k.age = 16;
		k.favoriteGame();
		k.gradeLevel(); */
		
		
	    p.checkStatus();
	    String line = ("------------------------------------");
		System.out.println(line);
		t.checkStatus();
		t.favoriteGame();
		System.out.println(line);
		k.checkStatus();
		k.favoriteGame();
		k.gradeLevel();
		System.out.println(line);
	    
	    
	
		
		
	}

}
