import java.util.*;
class Divisibleby5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		if(n%5==0)
			System.out.println(n+"is divisible by 5");
		else
			System.out.println(n+"is not divisible by 5");
	}
}
