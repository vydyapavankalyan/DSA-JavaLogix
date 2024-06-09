import java.util.*;
class Anonymousdemo
{
	public static void main(String args[])
	{
		
		A a=new A()
		{
			public void show()
			{
				System.out.println("This is my show");
			}
		};
		a.show();
	}
}	
	