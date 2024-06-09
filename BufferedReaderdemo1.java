import java.io.*;
import java.util.*;
class BufferedReaderdemo1
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=null;
		FileWriter fw=null;
		BufferedWriter bw=null;
		try
		{
			fr=new FileReader("E:sample1.txt");
			fw=new FileWriter("E:sample76.txt");
			bw=new BufferedWriter(fw);
		
			String s;
			
			int i;
			while((i=fr.read())!=-1)
			{
				fw.write((char)i);
				bw.write((char)i);
			}
	

		}
		finally
		{
			if(bw!=null)
			bw.close();
			if(fr!=null)
			fr.close();
			if(fw!=null)
			fw.close();
		}
	}
}