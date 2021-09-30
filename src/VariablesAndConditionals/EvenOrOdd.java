/*3. Store a number in a variable called num and write an if statement: 
If num is odd, display "Cool"
If num is even and between 2-5, display "Not Cool"
If num is even and between 6-20, display "Cool"
If num is even and greater than 20, display "Not Cool*/


package VariablesAndConditionals;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		int num = 15;
		
		if(num%2==0)
		{
			if(num>=2 && num<=5)
			{
				System.out.println("Not Cool");
			}
			else if(num>=6 && num<=20)
			{
				System.out.println("Cool");
			}
			else {
				System.out.println("Not Cool");
			}
		}
		
		else {
			System.out.println("Cool");
		}

	}

}
