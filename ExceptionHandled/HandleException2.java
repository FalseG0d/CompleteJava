class HandleException2
{
public static void main(String s[])
	{
	try
	{
	int x=10/0;
	System.out.println(x);
	}catch(ArithmeticException e)
		{
		System.out.println(e);
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
	System.out.println("This will not be printed");
	}
}