import java.util.*;
class Student
{
	int rollno;	
	String name;
      Student(int rno,String nm)
	{
		rollno=rno;
		name=nm;
	}
}
class Arrayofobjects
{
	public static void main(String args[])
	{
		Student a[]=new Student[5]; //array of type student

		a[0]=new Student(1,"sachin");
		a[1]=new Student(2,"kapil");
		a[2]=new Student(3,"sehwag");
		a[3]=new Student(4,"dhoni");
		a[4]=new Student(5,"rohit");

		int i;

		for(i=0;i<a.length;i++)
			System.out.println(a[i].rollno+"   "+a[i].name);
	}

}	

		
