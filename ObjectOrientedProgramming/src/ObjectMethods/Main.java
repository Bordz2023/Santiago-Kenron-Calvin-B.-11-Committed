package ObjectMethods;
public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("ken", "hshs", "1", "ICT", "Committed", 95.5f, 97.26f);
		Student s1 = new Student("rei", "hshs", "1", "ICT", "Committed", 94.5f, 95.26f);
		
		s.introduceSelf();
		
		System.out.println("------------------------------------");
		
		s1.introduceSelf();
		
		System.out.println("------------------------------------");
        
		s.EvaluateGrade();
		
		System.out.println("------------------------------------");
		
		s1.EvaluateGrade();
		
	 }

}
