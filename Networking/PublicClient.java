import java.io.*;
import java.net.*;
class PublicClient
{
Socket s;
DataInputStream dis;
DataOutputStream dos;
PublicClient()
	{
	try
		{
		s=new Socket("127.0.0.1",10);
		dis=new DataInputStream(s.getInputStream());
		dos=new DataOutputStream(s.getOutputStream());
		clientChat();
		}catch(Exception e)
			{System.out.println(e);}
	}
public void clientChat()throws IOException
	{
	My m=new My(dis);
	Thread t1=new Thread(m);
	t1.start();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s1;
	do
		{
		s1=br.readLine();
		dos.writeUTF(s1);
		dos.flush();
		}while(!s1.equals("stop"));
	}
public static void main(String s[])
	{new PublicClient();}
}
class My implements Runnable
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
DataInputStream dis;
My(DataInputStream dis)
	{
	this.dis=dis;
	}
public void run()
	{
	String s2="",name="";
	try
		{
		name=br.readLine();
		}catch(IOException e)
			{System.out.println(e);}
	do
		{
		try	
			{
			s2=dis.readUTF();
			System.out.println(name+":"+s2);
			}catch(Exception e)
				{System.out.println(e);}
		}while(!s2.equals("stop"));
	}
}