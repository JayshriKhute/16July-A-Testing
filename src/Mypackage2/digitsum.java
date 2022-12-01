package Mypackage2;

import java.util.Scanner;

public class digitsum 
{
  public static void main(String[] args)
  {
	Scanner scan=new Scanner(System.in);
	int rem,sum=0;
	System.out.println("Enter number:");
	int n=scan.nextInt();
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	System.out.println("Sum of digits="+sum);
  }
}
