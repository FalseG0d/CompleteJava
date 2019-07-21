import java.io.*;
import java.net.*;
import java.util.*;
class PublicServer
{
ArrayList al=new ArrayList();
ServerSocket ss;
Socket s;
PublicServer()
	{
	try
		{
		ss=new ServerSocket(10);
		while(true)
			{
			s=ss.accept();
			System.out.println("Client Connected");
			al.add(s);
			Runnable r=new MyThread(s,al);
			Thread t=new Thread(r);
			t.start();
			}
		}catch(Exception e)
			{}
	}
public static void main(String s[])	
		{
		new PublicServer();
		}
	
}
class MyThread implements Runnable
{
Socket s;
ArrayList al;
MyThread(Socket s,ArrayList al)
	{
	this.s=s;
	this.al=al;
	}
public void run()
	{
	String s1="";
	try
		{
		DataInputStream dis=new DataInputStream(s.getInputStream());
		do
			{
			s1=dis.readUTF();
			System.out.println(s1);
			if(!s1.equals("stop"))
				{
				tellEveryOne(s1);
				}
			else 
				{
				DataOutputStream dos=new DataOutputStream(s.getOutputStream());
				dos.writeUTF(s1);
				dos.flush();
				al.remove(s);
				}
			}while(!s1.equals("stop"));
		}catch(Exception e)
		{}
	}
public void tellEveryOne(String s1)
	{
	Iterator i=al.iterator();
	while(i.hasNext())
		{
		try
			{
			Socket sc=(Socket)i.next();
			DataOutputStream dos=new DataOutputStream(sc.getOutputStream());
			dos.writeUTF(s1);
			dos.flush();
			System.out.println("Client:");
			}catch(Exception e)
			{}
		}
	}
}