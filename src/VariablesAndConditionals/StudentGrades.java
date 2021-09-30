package VariablesAndConditionals;

public class StudentGrades {

	public static void main(String[] args) {
		
		int grade = 91;
		
		if(grade>=90 && grade<=100)
		{
			System.out.println("You get an A");
		}
		else if(grade>=80 && grade<90)
		{
			System.out.println("You get a B");
		}
		else if(grade>=70 && grade<80)
		{
			System.out.println("You get a C");
		}
		else if(grade>=55 && grade<70)
		{
			System.out.println("You get a D");
		}
		else {
			System.out.println("You get a F");
		}

	}

}
