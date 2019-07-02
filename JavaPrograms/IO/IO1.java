import java.io.*;
import java.util.*;
class MyFileWriter
{
public static void main(String str[])throws IOException
	{
	String s;
	FileOutputStream fw=new FileOutputStream("Apoorv.txt",true);
	do
	{
	s=new Scanner(System.in).nextLine();
	byte ch[]=s.getBytes();
	if(!s.equals("stop"))
	{
	for(int i=0;i<ch.length;i++)
		fw.write(ch[i]);
	}
	}while(!s.equals("stop"));
	fw.close();
	System.out.println("Success");
	}
}
class MyFileReader
{
public static void main(String s[])throws IOException
	{
	FileInputStream fr=new FileInputStream(new File("C:\\Java_packages\\Apoorv.txt"));
	int i=0;
	while((i=fr.read())!=-1)
		{
		System.out.print((char)i);
		}
	fr.close();
	}
}
class MyFileReader1
{
public static void main(String str[])throws IOException
	{
	FileInputStream fr=new FileInputStream("Apoorv.txt");
	byte b[]=new byte[fr.available()];
	fr.read(b);
	String s=new String(b);
	System.out.println(s);
	}
}