import java.util.*;
class Characterrepeat
{
	public static void main(String args[])
	{
		String s="abc3d2ef";
		String s1="";

		int i,j;
		char ch1,ch2;

		for(i=0;i<s.length();i++)
		{
			ch1=s.charAt(i);
			if(i+1<s.length())
			{
			ch2=s.charAt(i+1);

			if(ch2>='0' && ch2<='9')
			{
				for(j=0;j<ch2-48;j++)
				   System.out.print(ch1);
				i++;
			}
			else
				System.out.print(ch1);
			}
			else
				System.out.print(ch1);
		}
	}
}