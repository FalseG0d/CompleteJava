interface My
{
default void xyz()
	{
	class Local
		{
		void localDisplay()
			{
			System.out.println("Local class in Display");
			Local i=new Local();
			i.localDisplay();
			}
		
		}
	}
My1 z=new My1()
			{
			public void show()
				{
				System.out.println("Annonymous");
				}
			};
class Inner
			{
			void display()
				{
				
					System.out.println("Static nested class");
				
				}
			}
}
class Temp extends My.Inner
{
public static void main(String s[])
	{
	new Temp().display();
	}
}
interface My1
{
void show();
}
class ClassInInterface implements My
{
public static void main(String s[])
	{
	ClassInInterface ci=new ClassInInterface();
	ci.xyz();
	ci.z.show();
	Inner i=new Inner();
	i.display();
	}
}