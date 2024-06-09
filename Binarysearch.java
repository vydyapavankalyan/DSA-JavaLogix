import java.util.*;
class Binarysearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]=new int[20];

		int i,n,keyelement;

		System.out.println("enter the size of array a");
		n=sc.nextInt();

		System.out.println("enter the elements of array a");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();

		System.out.println("enter the keyelement need to search");
		keyelement=sc.nextInt();

		sort(a,n); //calling method1 
		for(i=0;i<n;i++)
			System.out.print(a[i]+" ");
		binarysearch(a,n,keyelement); //calling method2
	}
		static void sort(int a[],int n) //called method1
		{
		    	int i,j,temp;
			for(i=0;i<n;i++)
			{
				for(j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];	
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
		}
		static void binarysearch(int a[],int n,int keyelement)
		{
			int low,high,mid,i,found=0;

			low=0;
			high=n-1;

			for(i=0;i<n;i++)
			{
				mid=(low+high)/2;
				if(keyelement==a[mid])
				{
					found=1;
					break;
				}
				else if(keyelement>a[mid])
					low=mid+1;
				else
					high=mid-1;
			}
			if(found==1)
				System.out.println("keyelement found");
			else
				System.out.println("no such element in array");
		}
}
	