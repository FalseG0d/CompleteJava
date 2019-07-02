import java.io.BufferedInputStream;
import java.io.FileInputStream;
class BStream
{
public static void main(String s[])throws IOException
	{
	String srcFile="Apoorv.txt";
	try(BufferedInputStream bis=new BufferedInputStream(srcFile))
		{
		byte byteData;
		while((byteData=(byte)bis.read())!=-1)
			{
			System.out.print((char)byteData);
			}
		}catch(Exception e){e.printStackTrace();}
	}
}