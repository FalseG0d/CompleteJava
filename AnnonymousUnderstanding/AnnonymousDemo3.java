class AnnonymousDemo3
{
static int x=10;
static int y=20;
void display(My m)
	{
	m.show();
	}
public static void main(String s[])
	{
	AnnonymousDemo2 o=new AnnonymousDemo2();
	o.display(
		new Temp()
		);
	}
}
interface My
{
void show();
}
class Temp implements My
{
public void show()
	{
	System.out.println("Show");	
	}
}