import java.io.*;
class MyFileReader1
{
public static void main(String s[])throws IOException
	{
	FileInputStream fr=new FileInputStream("e:\\Apoorv.txt"); 
	byte b[]=new byte[fr.available()];
	fr.read(b);
	String str=new String(b);
	System.out.println(str);
	}
}