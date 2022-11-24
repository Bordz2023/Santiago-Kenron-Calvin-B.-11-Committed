package LESSONS;

public class Arrays {

	public static void main(String[] args) {

		 String name[] = {"ken", "rei", "cyrus", "james"};
		    String email[] = {"ken@gmail.com","rei@gmail.com","cyrus@gmail.com", "james@gmail.com"};
		    String password[] = {"haha", "haha2", "haha3", "haha4"};
		    int index = 0;
		    
		    System.out.println("Name     :" + name[index]);
		    System.out.println("Email    :" + email[index]);
		    System.out.println("Password :" + password[index]);
		    
		    int i = 0;
		    System.out.println("");
		    while(i < 4)  {
		    	
		    	
		    System.out.println(name[i] + "\t\t" + email[i] + "\t\t" + password[i]);
		    System.out.println("-----------------------------------------------------------");
		    i++;
		    }

  
	}
	
}
