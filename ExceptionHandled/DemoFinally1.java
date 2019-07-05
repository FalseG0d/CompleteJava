class DemoFinally1
{
static int show()
	{
	try
		{
		return 20;
		}catch(Exception e)
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