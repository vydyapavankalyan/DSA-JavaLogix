import java.util.*;
class Countofadss
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s;
		int i,al=0,d=0,ss=0;
		char ch;

		System.out.println("enter the string");
		s=sc.next();

		for(i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
				al++;
			else if(ch>='0' && ch<='9')
				d++;
			else
				ss++;
		}
		System.out.println("number of alphabets="+al);
		System.out.println("number of digits="+d);
		System.out.println("number of special symbols="+ss);

	}
}