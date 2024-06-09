import java.util.*;
class Divisibleby23
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		if(n%2==0 && n%3==0)
			System.out.println(n+"is divisible by 2 and 3");
		else
			System.out.println(n+"is not divisible by 2 and 3 ");
	}
}
