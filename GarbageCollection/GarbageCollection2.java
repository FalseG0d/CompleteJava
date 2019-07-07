class Demo
{
int x=10;
int y=20;
public void finalize()throws Throwable
	{
	System.out.println("Object ended");
	}
}
class GarbageCollection2
{
public static void main(String s[])
	{
	show();
	}
static void show()
	{
	Demo d=new Demo();
	display();
	}
static void display()
	{
	Demo d=new Demo();
	}
}