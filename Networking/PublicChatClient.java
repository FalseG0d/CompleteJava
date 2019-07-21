import java.io.*;
import java.net.*;
class MyClient
{
Socket s;
DataInputStream dis;
DataOutputStream dos;
MyClient()
	{
	try
		{
		s=new Socket("127.0.0.1",10);
		dis=new DataInputStream(s.getInputStream());
		dos=new DataOutputStream(s.getOutputStream());
		clientChat();		
		}catch(Exception e){}
	}
void clientChat()throws Exception
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
	{new MyClient();}
}
class My implements Runnable
{
DataInputStream dis;
My(DataInputStream dis)
	{
	this.dis=dis;
	}
public void run()
	{
	String s2="";
	do	
		{
		try	
			{
			s2=dis.readUTF();
			System.out.println(s2);
			}catch(Exception e){System.out.println(e);}
		}while(!s2.equals("stop"));
	}
}