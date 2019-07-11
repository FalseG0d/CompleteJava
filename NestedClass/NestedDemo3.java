class NestedDemo3
{
int x=10;
static int y=20;
class Inner
	{
	void show()
		{
		System.out.println(x);
		System.out.println(y);
		}
	}
public static void main(String s[])
	{
	NestedDemo3 o=new NestedDemo3();
	System.out.println(o.x);
	NestedDemo3.Inner i=o.new Inner();
	i.show();
	}
}