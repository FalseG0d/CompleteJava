import java.io.*;
class IO4
{
public static void main(String str[])throws IOException
	{
	InputStreamReader ir=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(ir);
	FileWriter fw=new FileWriter("Apoorv.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter pw=new PrintWriter(fw);
	String s="";
	while(!s.equals(""))
		{
		s=br.readLine();
		pw.write(s);
		pw.write(" ");
		pw.flush();
		}
	}
}