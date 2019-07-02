import java.io.*;
class MyFileWriter
{
public static void main(String s1[])throws IOException
	{
	FileOutputStream f1=new FileOutputStream(("Apoorv.txt"),true);//write mode
	//FileOutputStream f2=new FileOutputStream("Apoorv.txt",true);//append mode
	String s="Hi this is Apoorv";
	byte ch[]=s.getBytes();
	for(int i=0;i<ch.length;i++)
		f1.write(ch[i]);
	f1.close();
	System.out.println("Success");
	}
}
class MyFileWriter1
{
public static void main(String s1[])throws IOException
	{
	ByteArrayOutputStream bout=new ByteArrayOutputStream();
	String s="Hi this is Apoorv";
	byte b[]=s.getBytes();
	bout.write(b);
	bout.writeTo(new FileOutputStream("Apoorv.txt",true));
	}
}