import java.util.*;
class Digit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;

		System.out.println("enter the character");
		ch=sc.next().charAt(0);

		if(ch>='0' && ch<='9')
			System.out.println("digit");
		else
			System.out.println("not a digit");
	}
}