package mypackage3;

public class implementationClass extends class1 implements interface1
{
	public  void area(int r) 
	 {
		 System.out.println(pie*r*r);
		 
	 }
public static void main(String args[])
{
	implementationClass ic1=new implementationClass();
	
	ic1.calArea();
	ic1.area(10);
}
}
