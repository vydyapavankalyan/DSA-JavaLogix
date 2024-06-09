import java.util.*;
class ArrayListDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);

		/*int source,replace;
		System.out.println("enter the source element");
		source=sc.nextInt();

		if(l.contains(source))
		{
			System.out.println("enter the replace element");
			replace=sc.nextInt();

			int x=l.indexOf(source);

			l.set(x,replace);

			System.out.println(l);
		}
		else
			System.out.println("no source element exists"); */

		/*for(Integer x:l)
			System.out.print(x+" "); */

		/*for(int i=l.size()-1;i>=0;i--)
			System.out.print(l.get(i)+" "); */

		List<Integer> l2=new ArrayList<Integer>();

		l2.add(60);
		l2.add(70);
		l2.add(80);
		l2.add(90);
		l2.add(100);

		l.addAll(l2);

		System.out.print(l+" ");

		
		
		
	
	
		
	}
}

		