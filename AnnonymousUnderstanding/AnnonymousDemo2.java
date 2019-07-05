class AnnonymousDemo2
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
		new My()
			{
			public void show()
				{
				System.out.println(x);
				System.out.println(y);
				}
			}
		);
	}
}
interface My
{
void show();
}