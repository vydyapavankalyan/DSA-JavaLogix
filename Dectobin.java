import java.util.*;
class Dectobin
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		int bnum=0,dnum,rem,base=1;

		System.out.println("enter the decimal number");
		dnum=sc.nextInt();

		while(dnum>0)
		{
			rem=dnum%2;
			bnum=bnum+rem*base;
			dnum=dnum/2;
			base=base*10;
		}
		System.out.println("Binary equivalent of decimal="+bnum);
	}
}