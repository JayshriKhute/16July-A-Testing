package mypackage3;

public class democlass1 implements i1,i2

{
	public void a1()
	{
		System.out.println(a);
	}
	public void b1()
	{
		System.out.println(b);
	}
	public void a2( int a)
	{
		System.out.println(a);
	}
	public void b2(int b)
	{
		System.out.println(b);
	}
public static void main(String []args)
{
	democlass1 d1=new democlass1();
	d1.a1();
	d1.b1();
	d1.a2(10);
	d1.b2(20);
}
}
