class HandleException5
{
public static void main(String s[])
	{
	try
	{
	int x=10/s.length;
	System.out.println(x);
	int x1[]=new int[s.length];
	System.out.println(x1[10]);
	}catch(Throwable e)
		{
		if(e instanceof ArithmeticException)
			System.out.println(e);
		
		else if(e instanceof ArrayIndexOutOfBoundsException)
			System.out.println(e);
		}
	System.out.println("This will not be printed");
	}
}