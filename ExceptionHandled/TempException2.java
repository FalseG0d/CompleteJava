class TempException2
{
public static void main(String s[])
	{
	try
		{
		int x=10/s.length;
		System.out.println(x);
		}catch(ArithmeticException e)
			{System.out.println(e);}
	}
}