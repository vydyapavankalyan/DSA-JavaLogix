import java.util.*;
class Anagram
{
public static void main(String args[])
	{
		String str1="mary";
		String str2="army";

		int l1,l2,i,j,flag=0;

		char temp;

		l1=str1.length();
		l2=str2.length();

		if(l1==l2)
		{
			System.out.println("anagram is possible");
			
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();

			for(i=0;i<ch1.length;i++)	
			{
				for(j=i+1;j<ch1.length;j++)
				{
					if(ch1[i]>ch1[j])
					{
						temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
					if(ch2[i]>ch2[j])
					{	
						temp=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp;
					}
				}
			}
			for(i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println("Anagram");
			else
				System.out.println("Not an anagram");
		}
		else
			System.out.println("Anagram is not possible");
		
	}
}