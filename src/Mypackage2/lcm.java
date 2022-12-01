package Mypackage2;

public class lcm
{
  public static void main(String []args)
  {
	  int b=75,a=50;
	  int m=a,n=b;
	  while(a!=b)
	  {
		  if(a>b)
			  a-=b;
			  else
			if(b>a)	  
			  b-=a;
	  }
	  int gcd=a;
	  System.out.println("Greatest Common devisor of "+m+" and "+n+" is "+gcd);
	  int l_c_m=(m*n)/gcd;
	  System.out.println("Least Common Multiple of "+m+" and "+n+" is "+l_c_m);
	  
  }
}
