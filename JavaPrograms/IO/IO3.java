import java.io.*;
class IO3
{
public static void main(String str[])throws IOException
	{
	DataInputStream din=new DataInputStream(System.in);
	FileOutputStream fout=new FileOutputStream("Apoorv.txt");
	PrintStream ps=new PrintStream(fout);
	String s="";
	while(!s.equals(""))
		{
		s=din.readLine();
		ps.println(s);
		}
	din.close();
	fout.close();
	}
}