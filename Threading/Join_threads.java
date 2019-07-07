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
	System.out.println(currentThread().getName());
	}
public static void main(String s[])
	{
	Sync_Thread t1=new Sync_Thread("Thread1");
	Sync_Thread t2=new Sync_Thread("Thread2");
	Sync_Thread t3=new Sync_Thread("Thread3");
	}
}