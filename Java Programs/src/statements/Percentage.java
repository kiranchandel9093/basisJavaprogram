package statements;

public class Percentage {

	public static void main(String[] args) {
		String grade = null;
		double marks = 499;
		double perc = (marks/500)*100;
		if (perc > 85)
		
			grade = "A++" ;
		
		else if ((perc > 75) && (perc < 85))
			
			grade = "A+" ;
		else if ((perc > 60) && (perc < 85))
			
			grade = "A" ;
		
		else if ((perc > 40) && (perc < 85))
			grade = "B" ;
		
		else  
			
		grade = "F" ;
		
		{
			System.out.println("percentage of student is: " + perc);
			System.out.println("garde of student is: " + grade);
		
		
		}
		
		
	}

}
