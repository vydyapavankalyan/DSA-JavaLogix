import java.lang.*;
import java.util.*;
class AnonymousInner
{
	public static void main(String args[])
	{
		Thread t1=new Thread(new Runnable()
		{
			public void run()
			{
				for(int i=1;i<10;i++)
					System.out.println(i);
			}
		});
		t1.start();
	}
}