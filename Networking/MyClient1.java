import java.io.*;
import java.net.*;
class MyClient1
{
Socket s;
DataInputStream dis;
DataOutputStream dos;
public MyClient1()
	{
	try
		{
		s=new Socket("127.0.0.1",10);
		System.out.println(s);
		dis=new DataInputStream(s.getInputStream());
		dos=new DataOutputStream(s.getOutputStream());
		clientChat();
		}catch(Exception e)
			{
			System.out.println(e);
			}
	}
public void clientChat()throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String s1;
	do
		{
		s1=br.readLine();
		dos.writeUTF(s1);
		dos.flush();
		System.out.println("ServerMessage:"+dis.readUTF());
		}while(!s1.equals("stop"));
	}
public static void main(String s[])
	{
	new MyClient1();
	}
}