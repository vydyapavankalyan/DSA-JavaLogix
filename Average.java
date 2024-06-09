import java.util.*;
class Average
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int limit,num,i,count=0;
		float sum=0.0f,avg;

		System.out.println("enter the limit");
		limit=sc.nextInt();

		for(i=1;i<=limit;i++)
		{
			System.out.println("enter the number");
			num=sc.nextInt();

			if(num==0)
			   break;
			else
			{
				sum=sum+num;
				count++;
			}
		}
		avg=sum/count;

		System.out.println("average="+avg);
	}
}