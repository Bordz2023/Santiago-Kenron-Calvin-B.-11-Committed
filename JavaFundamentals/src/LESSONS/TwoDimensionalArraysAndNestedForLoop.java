package LESSONS;

public class TwoDimensionalArraysAndNestedForLoop {

	public static void main(String[] args) {
		
		String users[][] = {
				{"Kenron", "Kenron123"},
				{"Zharinna", "Zharinna123"},
				{"James", "James123	", "Nice"},
				{"Joeceff", "Joecedff123", "Good", "15"}
		};

		for(String user[]:users) {
			
		for(String info:user) {
			System.out.println(info);
		}
		    System.out.println();
	    }
	}
}


