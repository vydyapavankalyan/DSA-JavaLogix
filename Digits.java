import java.util.*;
class Digits
{
	public static void main(String args[])
	{

		char a[]={'s','a','t','y','a','@','1','2','3'};

		int i;

		for(i=0;i<a.length;i++)
		{
			if(a[i]>='0' && a[i]<='9')
				System.out.print(a[i]+"  ");
		}
	}
}