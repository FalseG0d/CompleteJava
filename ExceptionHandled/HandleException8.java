class Temp implements AutoCloseable
{
public void close()
	{
	System.out.println("Closed");
	}
}
class HandleException8
{
public static void main(String s[])
	{
	try(Temp t=new Temp())
		{
		int x=10/0;
		System.out.println("Opened");
		}catch(Exception e)
		{System.out.println("Catch");}
	}
}