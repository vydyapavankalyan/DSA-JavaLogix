import java.util.*;
class Countofads
{
	public static void main(String args[])
	{

		char a[]={'A','s','a','t','y','a','@','1','2','3','#'};

		int i,al=0,d=0,ss=0;

		for(i=0;i<a.length;i++)
		{
			if((a[i]>='a' && a[i]<='z')||(a[i]>='A' && a[i]<='Z'))
				al++;
			else if(a[i]>='0' && a[i]<='9')
				d++;
			else
				ss++;
		}
		System.out.println("number of alphabets="+al);
		System.out.println("number of digits="+d);
		System.out.println("number of special symbols="+ss);
	}
}