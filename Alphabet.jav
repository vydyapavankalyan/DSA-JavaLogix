import java.util.*;
class Alphabet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		char ch;

		System.out.println("enter the character");
		ch=sc.next().charAt(0);

		if((ch>='a' && ch<='z)||(ch>='A' && ch<='Z'))
			System.out.println("aplhabet");
		else
			System.out.println("not an alphabet");
	}
}