package Mypackage2;

public class armstrong 
{
 public static void main(String[] args)
{
	int n=153,sum=0;
	int num=n;
	while(n!=0)
	{
		int rem=n%10;
		sum=sum+(rem*rem*rem);
		n=n/10;
	}
	if(n==sum)
		System.out.println(num +" is an armstrong number");
	else
		System.out.println(num +" is not an armstrong number");
}
}
