
package ObjectMethods;

public class Student {

	String firstname, lastname, year, strand, section;
	float midtermGrade, finalGrade;
	
	Student(String firstname,
			String lastname,
			String year, 
			String strand, 
			String section, 
			float midtermGrade,
			float finalGrade) {
	    
		this.firstname = firstname;
		this.lastname = lastname;
		this.year = year;
		this.strand = strand;
		this.section = section;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
		
	}
	
	void introduceSelf() {
		System.out.println("Full Name : " + firstname + " " + lastname);
		System.out.println("Year      : " + year);
		System.out.println("strand    : " + strand);
		System.out.println("section   : " + section);
		
	}
	
	void EvaluateGrade() {
		float average = (midtermGrade + finalGrade) / 2;
		System.out.println("Full Name : " + firstname + " " + lastname);
		System.out.println("Average   : " + average);
		
		String remark = "";
		
		if(average > 100) remark = "Invalid Grade";
		else if (average >= 98) remark = "With Highest Honor";
		else if (average >= 95) remark = "With High Honor";
		else if (average >= 90) remark = "With Honor";
		else if (average >= 75) remark = "Passed";
		else remark = "Failed";
			
		System.out.println("Remarks   : " + remark);
	}
}

		
