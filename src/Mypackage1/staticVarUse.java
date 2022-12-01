package Mypackage1;

public class staticVarUse 
{
	
	static int m;
	int n;
	
	staticVarUse(int a,int b)
	{
		m=a;
		n=b;
	}
	
	public void showStatic() 
	{
		System.out.println("static variable:"+m);
		System.out.println("Non static variable:"+n);
		
	}
public static void main(String[] args) 
{
	staticVarUse s1=new staticVarUse(100,200);
	s1.showStatic();
	staticVarUse s2=new staticVarUse(10,20);
	s2.showStatic();
	staticVarUse s3=new staticVarUse(1000,2000);
	s3.showStatic();
	
}
}
