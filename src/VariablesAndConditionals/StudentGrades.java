/* 1.  Write an if/else statement for the following requirements:
If student gets 90 or higher: console log  A
If students get 80 or above: console log B
If students get 70 or above: console log C
If students get 55 or above: console log D
Any grade lower than 55 is F */

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
