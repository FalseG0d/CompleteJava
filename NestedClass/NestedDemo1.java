class NestedDemo1
{
static int x=10,y=20;
static class Inner
	{
	int x=1,y=2;
	void show()
		{
		System.out.printf(x+"\n"+y);
		}
	public static void main(String s[])
		{
		Inner i=new Inner();
		i.show();
		}
	}
public static void main(String s[])
	{
	Inner i=new Inner();
	i.show();
	}
}