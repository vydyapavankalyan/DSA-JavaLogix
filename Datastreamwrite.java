import java.io.*;
import java.util.*;
class Datastreamwrite
{
	public static void main(String args[]) throws Exception
	{
		FileOutputStream fos=null;
		DataOutputStream dos=null;

		try
		{
			fos=new FileOutputStream("E:sample200.txt");
			dos=new DataOutputStream(fos);

			dos.writeInt(12345);
			dos.writeUTF("sachin"); //Unicode Transformation format
			dos.writeUTF("manager");
			dos.writeFloat(56000.45f);
			
		}
		finally
		{
			if(dos!=null)
			   dos.close();
			if(fos!=null)
				fos.close();
		}
			
	}
}