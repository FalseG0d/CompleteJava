import java.io.*;
class DataStream
{
public static void main(String str[])throws IOException
	{
	FileOutputStream fos=new FileOutputStream("Apporv",true);
	DataOutputStream dos=new DataOutputStream(fos);
	dos.writeInt(11);
	dos.writeLong(11L);
	dos.writeBoolean(false);
	dos.close();
	FileInputStream fis=new FileInputStream("Apporv");
	DataInputStream dis=new DataInputStream(fis);
	System.out.println(dis.readInt());
	System.out.println(dis.readLong());
	System.out.println(dis.readBoolean());
	dis.close();
	}
}