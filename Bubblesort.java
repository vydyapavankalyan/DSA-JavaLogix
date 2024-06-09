import java.util.*;
class Bubblesort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[20];

		int i,n;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the elements of array a");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		bubble_sort(a,n);
	}
	static void bubble_sort(int a[],int n)
	{
		int i,j,temp,p;

		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			for(p=0;p<n;p++)
				System.out.print(a[p]+" ");
			System.out.println("");
		}
	}

		
}
	