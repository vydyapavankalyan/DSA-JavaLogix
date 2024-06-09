import java.io.*;
import java.util.*;
class Characterstreamdemo
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=null;
		FileWriter fw=null;
		try
		{
			fr=new FileReader("E:sample1.txt");
			fw=new FileWriter("E:sample75.txt");
		
			int i;
			while((i=fr.read())!=-1)
				fw.write((char)i);
		}
		finally
		{
			fr.close();
			fw.close();
		}
	}
}