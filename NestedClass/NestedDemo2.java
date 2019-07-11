class NestedDemo2
{
static int x=10,y=20;
static class Inner
	{
	static int x=1,y=2;
	static void show()
		{
		System.out.println(x+"\n"+y);
		}
	}
public static void main(String s[])
	{
	Inner i=new Inner();
	i.show();
	}
}
class NestedDemo
{
public static void main(String s[])
	{
	NestedDemo2.Inner.show();
	}
}