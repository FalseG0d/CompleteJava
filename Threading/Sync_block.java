class Sync_block extends Thread
{
int x,y;
Sync_block(String s)
	{
	super(s);
	}
void in(Thread o)
	{
	System.out.println("Running thread"+Thread.currentThread().getName());
	synchronized(o)
		{
		try
		{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.println("Running thread"+Thread.currentThread().getName());
		}
	}
public void run()
	{
	System.out.println("Running thread");
	in(Thread.currentThread());
	}
public static void main(String s[])
	{
	System.out.println("Running Main");
	Sync_block t1=new Sync_block("Thread1");
	Sync_block t2=new Sync_block("Thread2");
	Sync_block t3=new Sync_block("Thread3");
	t1.start();
	t2.start();
	t3.start();
	}
}