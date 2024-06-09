import java.util.*;
class Eachstringreverse
{
public static void main(String args[])
	{
		String a[]={"sachin is best batsman","dhoni","kapil","rahul","dravid"};
		String s1="";
	

		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			s1=a[i];
			
			for(j=s1.length()-1;j>=0;j--)
				System.out.print(s1.charAt(j));
			System.out.println("");
		}
			

	}
}