package Mypackage2;
//import java.lang.Math;
public class prime
{
 public static void main(String[] args)
{
	 int no=5,i;
	 boolean flag=false;
	 
	 for(i=2;i<=no/2;i++)
	 {
		 if(no%i==0)
		 {
			 flag=true;
		     break;
		 }
		
			 
	 }

	 if(flag==false)
	 {
		 System.out.println(no + " is a prime number");
	 }
	 else
	 {
		 System.out.println(no + " is not a prime number");
	 }
	
	 System.out.println(Math.sqrt(16));
	 System.out.println(Math.sqrt(4));
	 
	
}
}


