import java.io.*;
import java.net.*;
public class Myserver
{
ServerSocket ss;
Socket s;
DataInputStream dis;
DataOutputStream dos;
public Myserver()
	{
	try
		{
		System.out.println("Server Started");
		ss=new ServerSocket(10);
		s=ss.accept();
		System.out.println(s);
		S.out.println("Connected");
		dis=new DataInputStream(s.getInputStream());
		dos=new DataOutputStream(s.getOutputStream());
		serverChat();
		}catch(Exception e){System.out.println(e);}
	}
public static void main(String s[])	
	{
	new Myserver();
	}
public void serverChat()throws Exception
	{
	String str;
	do
		{
		str=dis.read()UTF();
		System.out.println("ClientMessage:"+str);
		dos.writeUTF("Echo"+str);
		dos.flush();
		}while(!str.equals("stop"));
	}
}
