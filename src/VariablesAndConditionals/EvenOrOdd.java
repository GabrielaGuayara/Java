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
