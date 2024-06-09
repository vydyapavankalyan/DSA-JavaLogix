import java.io.*;
import java.util.*;
class Bytestreamwriting
{
	public static void main(String args[]) throws IOException
	{
		FileOutputStream fos=null;

		try
		{
			fos=new FileOutputStream("E:sample30.txt");
			String s="happy coding";
			byte b[]=s.getBytes();
			fos.write(b);
			
		}
		
		finally
		{
			if(fos!=null)
				fos.close();
		}
	}
}