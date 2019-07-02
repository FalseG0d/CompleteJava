import java.io.*;
import java.util.*;
class IO2
{
public static void main(String str[])throws IOException
	{
	FileOutputStream fos=new FileOutputStream("Apoorv.txt",true);
	FileInputStream fis=new FileInputStream("Apoorv.txt");
	PrintStream ps=new PrintStream(fos);
	ps.print("Hi things have changed again");
	String s=new Scanner(fis).nextLine();
	System.err.println(s);
	}
}
class Ps
{
public static void main(String str[])throws IOException
	{
	FileOutputStream fout=new FileOutputStream("Apoorv.txt",true);
	PrintStream ps=new PrintStream(fout),ps1;
	ps1=System.out;
	System.out.println("Before");
	ps.print("Before");
	ps=System.out;
	ps.println("Before");
	ps=new PrintStream(fout);
	System.setOut(ps);
	System.setErr(ps);
	System.out.print("After");
	System.err.print("After");
	System.setOut(ps1);
	System.setErr(ps1);
	}
}