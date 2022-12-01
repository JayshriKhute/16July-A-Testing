package Mypackage2;

public class reverse 
{
 public static void main(String args[])
 {
   int num=2345;
   int rem,rev=0;
   int n=num;
   while(num!=0)
   {
	   rem=num%10;
	   rev=rev*10+rem;
	   num=num/10;
   }
   System.out.println("The reverse of "+n+" is "+rev);
 }
}
