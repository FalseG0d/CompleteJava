class HandledException6
{
public static void main(String s[])
	{
	try
	{
	int x=10/s.length;
	System.out.println(x);

	int x1[]=new int[s.length];
	System.out.println(x1[10]);

	}catch(ArrayIndexOutOfBoundsException|ArithmeticException e)
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