import java.io.*;
import java.net.*;
class UDPClient
{
public static void main(String arg[])throws Exception
	{
	DatagramSocket ds=new DatagramSocket();
	String s="India is a good country";
	byte b[]=s.getBytes();
	InetAddress i=InetAddress.getLocalHost();
	DatagramPacket dp=new DatagramPacket(b,b.length,i,8);
	ds.send(dp);
	}
}