import java.util.*;
class Columnsort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int a[][]=new int[10][10];
		int i,j,k,row,col,temp;


		System.out.println("enter the order of two dimensional array a");
		row=sc.nextInt();
		col=sc.nextInt();

		System.out.println("enter the elements of two dimensional array a");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for(j=0;j<col;j++)
		{
			for(i=0;i<row;i++)
			{
				for(k=i+1;k<row;k++)
				{
					if(a[i][j]>a[k][j])
					{
						temp=a[i][j];	
						a[i][j]=a[k][j];
						a[k][j]=temp;
					}
				}
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
	