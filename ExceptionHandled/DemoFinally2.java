class DemoFinally2
{
static int show()
	{
	try
		{
		int x=10/0;
		return x;
		}catch(ArithmeticException e)
			{
			return 30;
			}
		finally
			{
			return 40;
			}
	}
public static void main(String s[])
	{
	int z=show();
	System.out.println(z);
	}
}