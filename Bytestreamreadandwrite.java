import java.io.*;
import java.util.*;
class Bytestreamreadandwrite
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=null;
		FileOutputStream fos=null;

		try
		{
			fis=new FileInputStream("E:sample30.txt");
			fos=new FileOutputStream("E:sample31.txt",true);
			int i;
			while((i=fis.read())!=-1)
				fos.write((char)i);
			String s="welcome to java full stack";
			byte b[]=s.getBytes();
			fos.write(b);
			
		}
		
		finally
		{
			if(fis!=null)
				fis.close();
			if(fos!=null)
				fos.close();
		}
	}
}