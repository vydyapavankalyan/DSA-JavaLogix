import java.util.*;
class Armstrongnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int n,rem,sum=0,x,y,temp1,temp2,count=0;

		System.out.println("enter the value of n");
		n=sc.nextInt();

		temp1=n;
		while(temp1>0)
		{
			temp1=temp1/10;
			count++;
		}
		temp2=n;
		while(temp2>0)
		{
			rem=temp2%10;
			x=1;y=count;
			while(y>0)
			{
				x=x*rem;		
				y--;
			}
			sum=sum+x;
			temp2=temp2/10;
		}
		if(n==sum)
			System.out.println(n+"is an armstrong number");
		else
			System.out.println(n+"is not an armstrong number");
	}
}