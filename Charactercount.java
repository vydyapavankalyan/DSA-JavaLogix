import java.util.*;
class Charactercount
{
	public static void main(String args[])
	{
		String s="aaabbbcccaaa@@@%%%%ddddeeeefffqqqqqq";
		int a[]=new int[128];
		int i;

		for(i=0;i<s.length();i++)
			a[(int)s.charAt(i)]++;
		
		for(i=0;i<128;i++)
		{
			if(a[i]!=0)
				System.out.println((char)i+"   "+a[i]);
		}
		
	}
}