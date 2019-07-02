import java.io.*;
class MyFileReader
{
public static void main(String s[])throws IOException
	{
	FileInputStream f1=new FileInputStream("Apoorv.txt");
	int i=0;
	while((i=f1.read())!=-1)
		{System.out.print((char)i);}
	f1.close();
	}
}
class MyFileReader1
{
public static void main(String s[])throws IOException
	{
	FileInputStream f1=new FileInputStream("Apoorv.txt");	
	byte b[]=new byte[f1.available()];
	f1.read(b);
	String s1=new String(b);
	System.out.print(s1);
	}
}