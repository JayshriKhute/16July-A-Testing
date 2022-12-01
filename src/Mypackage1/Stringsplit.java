package Mypackage1;

public class Stringsplit 
{
	public static void main(String args[])
	{
		String s1="My1Name1is1Jayshree";
		String a[]=s1.split("1");
		String s2="abcde";
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.concat(s2));
	}

}
