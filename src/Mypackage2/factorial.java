package Mypackage2;

public class factorial
{
	public static void main(String[] a)
	{
		int number=3;
		int n=number;
		int fact=1;
		
		while(number!=0)
		{
			fact=fact*number;
		
			number--;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	
	}

}
