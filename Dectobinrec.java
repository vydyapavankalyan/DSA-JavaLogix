import java.util.*;
class Dectobinrec
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,result;
		System.out.println("enter the value of n");
		n=sc.nextInt();

		result=dec_to_bin(n); //calling method
		System.out.println("decimal to binary="+result);
		

	}

	static int dec_to_bin(int n)  //called method
	{
			if(n==0)
			   return 0;
			else
			   return(n%2 + 10*dec_to_bin(n/2));
	}
		
}