class ExceptionThroughCallingChain
{
void show()
	{
	int x=10/0;
	}
void display()
	{
	show();
	}
void xyz()
	{
	display();
	}
public static void main(String s[])
	{
	ExceptionThroughCallingChain t=new ExceptionThroughCallingChain();
	try
		{
		t.xyz();
		}catch(ArithmeticException e)
			{
			System.out.println(e);
			}
	}
}