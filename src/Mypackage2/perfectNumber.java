package Mypackage2;

import java.util.Scanner;

public class perfectNumber
{
  public static void main(String args[])
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter  a number:");
	  int no=scan.nextInt();
	  int sum=0;
	  for(int i=1;i<=no/2;i++)
	  {
		  if(no%i==0)
		  sum=sum+i;
	  }
	  if(sum==no)
	  {
		  System.out.println(no+" is a perfect number");
	  }
	  else
	  {
		  System.out.println(no+" is not a perfect number");
	  }
  }
}
