import java.io.*;
import java.util.*;
class Employee implements Cloneable
{
	int empno;
	String name;
	float salary;
	String designation;
	int SSN;
	Employee(int empno,String name,float salary,String designation,int SSN)
	{
		this.empno=empno;		
		this.name=name;
		this.salary=salary;
		this.designation=designation;	
		this.SSN=SSN;
	}
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}

class Clonabledemo
{
	public static void main(String args[]) throws Exception
	{
		try
		{
		Employee e=new Employee(1234,"sachin",45000.56f,"manager",45666);

		Employee e1=(Employee)e.clone();

		System.out.println(e1.empno+" "+e1.name+"  "+e1.salary+" "+e1.designation+"  "+e1.SSN);

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
}		

		
			