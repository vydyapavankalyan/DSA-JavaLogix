import java.io.*;
import java.util.*;
class Bytestream
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis=null;

		try
		{
			fis=new FileInputStream("E:sample1.txt");
			int ch;
			while((ch=fis.read())!=-1)
				System.out.print((char)ch);
		}
		finally
		{
			if(fis!=null)
				fis.close();
		}
	}
}