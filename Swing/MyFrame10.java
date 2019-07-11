class Static_Outer
{
int x=10;
static int y=20;
static class Inner
	{
	static void show()
		{
			int x=80;
		System.out.println("X is"+x);
		System.out.println("Y is"+y);
		}
	public static void main(String s[])
	{
	Inner i=new Inner();
	i.show();
	}
	}
public static void main(String s[])
	{
	System.out.println("Y is"+y);
	Inner i=new Inner();
	i.show();
	System.out.println(i);
	}
}
class Static_Nested_Temp extends Static_Outer
{
public static void main(String s[])
	{
	Inner.show();
	}
}