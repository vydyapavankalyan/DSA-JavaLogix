import java.util.*;
class ADAM
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,temp,sqr,sqr1,rev=0,rev1=0,rem;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		sqr=n*n;

		temp=n;
		while(temp>0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		
		sqr1=rev*rev;

		while(sqr1>0)
		{
			rem=sqr1%10;
			rev1=rev1*10+rem;
			sqr1=sqr1/10;
		}

		if(sqr==rev1)
			System.out.println(n+"is ADAM number");
		else
			System.out.println(n+"is not a ADAM number");
			
	}
}