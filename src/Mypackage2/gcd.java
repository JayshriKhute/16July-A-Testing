package Mypackage2;

public class gcd 
{
 public static void main(String []args)
 {
	 int a=11,b=7;
	 int m=a,n=b;
	 while(a!=b)
	 {
		 if(a>b)
			 a-=b;
		 else
			 b-=a;
	 }
	 System.out.println("GCD of "+m+" and "+n+" is "+a);
 }
}
