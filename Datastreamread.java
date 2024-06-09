import java.io.*;
import java.util.*;
class Datastreamread
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis=null;
		DataInputStream dis=null;

		try
		{
			fis=new FileInputStream("E:sample200.txt");
			dis=new DataInputStream(fis);

			int empno=dis.readInt();
			String name=dis.readUTF(); //dis.readChar(); dis.writeChar();
			float salary=dis.readFloat(); 
	
			String designation=dis.readUTF();
			
			System.out.println(empno+" "+name+" "+designation+"  "+salary);	

			//dis.readBoolean(); //dis.writeBoolean();	
		}
		finally
		{
			if(dis!=null)
			   dis.close();
			if(fis!=null)
				fis.close();
		}
			
	}
}