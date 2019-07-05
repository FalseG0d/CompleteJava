class TryReturn
{
int check(char ch)
	{
	try
		{return 'x';}
	catch(Exception e)
		{return 10;}
	}
public static void main(String s[])
	{
	int x=new TryReturn().check();
	}
}