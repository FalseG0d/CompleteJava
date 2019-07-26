class c_chain
{
c_chain()
	{
	this(10);
	System.out.println("Default");
	}
c_chain(int x)
	{
	this(10,20);
	System.out.println("Parameterized");
	}
c_chain(int x,int y)
	{
	//this(10);
	System.out.println("Copy");
	}
public static void main(String s[])
	{
	c_chain c=new c_chain();
	}
}