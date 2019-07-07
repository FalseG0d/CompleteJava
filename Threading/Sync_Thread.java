class Sync_Thread extends Thread
{
Sync_Thread(String s)
	{
	super(s);
	start();
	}
public void run()
	{
	show();
	}
static synchronized void show()
	{
	for(int i=0;i<5;i++)
		{
		System.out.println(currentThread().getName());
		try
			{
			currentThread().sleep(1000);
			}catch(Exception e){}
		}
	}
public static void main(String s[])
	{
	Sync_Thread t1=new Sync_Thread("Thread1");
	Sync_Thread t2=new Sync_Thread("Thread2");
	Sync_Thread t3=new Sync_Thread("Thread3");
	}
}