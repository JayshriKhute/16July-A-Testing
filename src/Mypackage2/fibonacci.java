package Mypackage2;

public class fibonacci
{
  public static void main(String args[])
  {
	  int a=0,b=1,c;
	  int n=20;
	              
	  for(int i=0;i<n;i++)
	  {
		  System.out.print(a+"     "); 
		  
		  c=a+b;                  
		  
		  a=b;                    
		  b=c; 
		 
	  }
  }
  
}
//0