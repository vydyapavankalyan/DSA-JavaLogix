import java.io.*;
import java.util.*;
class Employee implements Serializable
{
	int empno;
	String name;
	float salary;
	String designation;
	transient int SSN;
	Employee(int empno,String name,float salary,String designation,int SSN)
	{
		this.empno=empno;		
		this.name=name;
		this.salary=salary;
		this.designation=designation;	
		this.SSN=SSN;
	}
}

class Deserializationdemo
{
	public static void main(String args[]) throws Exception
	{
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;

		try
		{
			fis=new FileInputStream("E:employ.ser");
			ois=new ObjectInputStream(fis);

			Employee e= (Employee)ois.readObject();
			System.out.println(e.empno+" "+e.name+"   "+e.salary+" "+e.designation+"  "+e.SSN);
			
		}
		finally
		{
			if(ois!=null)
				ois.close();
			if(fis!=null)
				fis.close();
		}
	}
	
}		

		
			