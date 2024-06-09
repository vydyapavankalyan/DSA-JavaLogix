import java.util.*;
class Caseconversion
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;

		System.out.println("enter the character");
		ch=sc.next().charAt(0);

		if(ch>='a'&&ch<='z')
			ch=(char)(ch-32);
		
		else
			ch=(char)(ch+32);
		System.out.println(ch);
	}
}