class Thread1 extends Thread
{
Thread1(String s)
	{
	super(s);
	}
public void run()
	{
	for(int i=0;i<10;i++)
		{
		System.out.println(getName());
		try
			{
			Thread.sleep(100);
			}catch(ArithmeticException e)
		{System.out.println(e);}
		catch(InterruptedException e)
		{System.out.println(e);}
		}
	}
}
class Thread2 extends Thread
{
Thread2(String s)
	{
	super(s);
	}
public void run()
	{
	for(int i=0;i<10;i++)
		{
		System.out.println(getName());
		try
			{Thread.sleep(100);}
		catch(InterruptedException e)
		{System.out.println(e);}
		}
	}
}
class Thread3 extends Thread
{
Thread3(String s)
	{
	super(s);
	}
public void run()
	{
	for(int i=0;i<10;i++)
		{
		System.out.println(getName());
		try
			{Thread.sleep(100);}
		catch(InterruptedException e)
		{System.out.println(e);}
		}	}
}
class RunThread
{
public static void main(String s[])
	{
	Thread1 t1=new Thread1("1");
	Thread2 t2=new Thread2("2");
	Thread3 t3=new Thread3("3");
	t1.start();
	t2.start();
	t3.start();
	for(int i=0;i<10;i++)
		{
		System.out.println(Thread.currentThread().getName());
		try
			{Thread.sleep(100);}catch(InterruptedException e){}
		}	}
}