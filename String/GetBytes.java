class GetBytes
{
public static void main(String s[])
	{
	String s1="Welcome to tutorial of java";
	try
		{
		byte b[]=s1.getBytes();
		for(int i=0;i<b.length;i++)
			{System.out.print(b[i]+" ");}
		}catch(Exception e)
			{System.out.println(e);}
	}
}