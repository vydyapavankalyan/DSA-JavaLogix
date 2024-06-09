import java.io.*;
import java.util.*;
class BufferedReaderdemo
{
	public static void main(String args[]) throws Exception
	{
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fr=new FileReader("E:sample1.txt");
			br=new BufferedReader(fr);
		
			String s;
			
			while((s=br.readLine())!=null)
				System.out.println(str);	

		}
		finally
		{
			if(br!=null)
			br.close();
			if(fr!=null)
			fr.close();
		}
	}
}