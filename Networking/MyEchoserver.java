import java.io.*;
import java.net.*;
class MyServer
{
ServerSocket ss;
Socket s;
DataInputStream dis;
DataOutputStream dos;
public MyServer()
	{
	try
		{
		System.out.println("Server Started");
		ss=new ServerSocket(10);
		s=ss.accept();
		System.out.println(s);
		System.out.println("Connected");
		dis=new DataInputStream(s.getInputStream());
		dos=new DataOutputStream(s.getOutputStream());
		serverChat();
		}catch(Exception e){System.out.println(e);}
	}
public static void main(String s[])throws Exception
	{
	new MyServer();
	}
public void serverChat()throws Exception
	{
	String str;
	do
		{
		str=dis.readUTF();
		System.out.println("Client:"+str);
		dos.writeUTF("Echo"+str);
		dos.flush();
		}while(!str.equals("stop"));
	}
}