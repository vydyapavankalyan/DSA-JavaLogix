import java.util.*;
class Arraysprograms
{
	public static void main(String args[])
	{
		//int a[]={2,3,1,7,5,9,11,21,13};

		//char a[]={'z','e','a','p','u','s'};
		
		//String a[]={"sachin","rahul","kapil","dhoni"};
		
		//System.out.println(Arrays.toString(a));

		//Arrays.sort(a);

		//System.out.println(Arrays.toString(a));

	       //Arrays.sort(a,2,6);
	
		//System.out.println(Arrays.toString(a));

		int b[]={1,5,8,12,16,19,24,29,31,35};


		System.out.println(Arrays.toString(b));

		System.out.println(Arrays.binarySearch(b,-5));

		System.out.println(Arrays.binarySearch(b,4,9,36));

		char c[]={'x','p','z','s'};


		System.out.println(Arrays.binarySearch(c,'z'));

		
		System.out.println(Arrays.binarySearch(c,'b'));

		String s[]={"sachin","rahul","kapil"};

		System.out.println(Arrays.binarySearch(s,"dhoni"));


		int d[]=new int[5];

		//System.out.println(Arrays.toString(d));

		//Arrays.fill(d,6);

		//System.out.println(Arrays.toString(d));

		Arrays.fill(d,2,4,6);

		System.out.println(Arrays.toString(d));

		int x[]={1,2,4,5,8,9,10};
		int y[]={1,2,4,5,8,9,11};

		System.out.println(Arrays.equals(x,y));

		System.out.println(Arrays.mismatch(x,y));

		int z[]=new int[5];

		System.out.println(Arrays.toString(z));

		System.out.println(Arrays.toString(Arrays.copyOf(z,10)));

		System.out.println(Arrays.toString(Arrays.copyOfRange(z,4,6)));

		Object o=new Object();

		Object o1=new Object();

		

		System.out.println(o.hashCode());

		System.out.println(o1.hashCode());


		int p[]=new int[]{1,2,3,4,5};

		int q[]=new int[]{1,2,3,6,5};

		

		System.out.println(Arrays.hashCode(p));
		System.out.println(Arrays.hashCode(q));


				
	}
}