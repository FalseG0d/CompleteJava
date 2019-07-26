class Classininterface implements My1
{
public static void main(String s[])
	{
	Classininterface ci=new Classininterface();
	ci.xyz();
	//ci.show();
	Inner i=new Inner();
	i.display();
	}
}
interface My1
{
default void xyz()
	{
	class Local
		{
		void Localdisplay()
			{System.out.println("Local class in Interface");}
		
		}
	Local i=new Local();
		i.LocalDisplay();
		
	}
My z=new My()
	{
	public void show()
		{System.out.println("Anonymous");}
	};
class Inner
	{
	void display()
		{System.out.println("Static nested class");}
		
	}

}
class Temp extends My1.Inner
{
public static void main(String s[])
	{
	new Temp().display();
	}
	
}
interface My
{void show();}