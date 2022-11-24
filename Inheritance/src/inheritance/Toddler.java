package inheritance;

public class Toddler extends Person {

	String favoriteGame;
	
	Toddler(String name, String sex, int age, String favoriteGame) {
		
		
		super(name, sex, age);
		this.favoriteGame = favoriteGame;
		
	}
	
	void drink() {   //or (name + "Is Drinking Milk")
		System.out.println("Drinking Milk");
	}
	
	void favoriteGame(){
		super.checkStatus();
		System.out.println("Favorite Game : " + favoriteGame);
	}
	
}

