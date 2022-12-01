package Mypackage2;

public class palindrome
{
public static void main(String[] args) 
{
	int n=1221;
	int num=n;
	int rem,rev=0;
	
	while(n!=0)
	{
		rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(rev==num)
		System.out.println(num+ " is a palindrome number");
	else
		System.out.println(num+ " is not a palindrome number");

}
}
