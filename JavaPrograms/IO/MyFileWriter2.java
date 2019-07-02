import java.io.*;
class MyByteWriter
{
public static void main(String s[])throws IOExceptions
[
ByteArrayOutputStream bout=new ByteArrayOutputStream();
String s="Hi this is Apoorv";
byte b[]=s.getBytes();
for(int i=0;i<s.length();i++)
	{
	bout.write(b[i]);
	}
bout.writeTo("Apoorv.txt");
b=bout.toByteArray();
ByteArrayInputStream bin=new ByteArrayInputStream(b);
int i=0;
while((i=bin.read())!=-1)
	System.out.print((char)i);
}
}