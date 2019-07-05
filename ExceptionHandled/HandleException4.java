class HandleException4
{
public static void main(String s[])
	{
	try
	{
	int x=10/s.length;
	System.out.println(x);
	}catch(ArithmeticException e)
		{
		System.out.println(e);
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
	try
	{
	int x1[]=new int[s.length];
	System.out.println(x1[10]);
	}catch(ArrayIndexOutOfBoundsException e)
		{
		System.out.println(e);
		}
	catch(Throwable e)
		{
		System.out.println(e);
		}
	System.out.println("This will not be printed");
	}
}