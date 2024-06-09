import java.util.*;
class Bintodecrec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,result;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		result=bin_to_dec(n); //calling method
		System.out.println("binary to decimal="+result);
		

	}

	static int bin_to_dec(int n)  //called method
	{
			if(n==0)
			   return 0;
			else
			   return(n%10 + 2*bin_to_dec(n/10));
	}
		
}