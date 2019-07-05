interface My
{
void show();
}
class AnnonymousDemo
{
int x=10,y=20;
My display()
	{
	return new My()
	{
	public void show()
		{
		System.out.println(x);
		System.out.println(y);
		}
	};
	}
public static void main(String s[])
	{
	AnnonymousDemo o=new AnnonymousDemo();
	My m=o.display();
	m.show();
	}
}