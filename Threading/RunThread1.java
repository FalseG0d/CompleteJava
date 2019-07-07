class Thread1 implements Runnable
{
int x;
public void run()
	{
	for(int i=0;i<10;i++)
		{
		try
			{
			System.out.println(Thread.currentThread().getName()+" "+x);
			Thread.sleep(100);
			}catch(InterruptedException e)
				{System.out.println(e);}
		}
	}
}
class RunThread1
{
public static void main(String s[])
	{
	Thread1 t1=new Thread1();
	Thread tt1=new Thread(t1,"Threadtt1");
	Thread tt2=new Thread(t1,"Threadtt2");
	tt1.start();
	tt2.start();
	}
}
class RunThread2
{
public static void main(String s[])
	{
	
	Thread1 t1=new Thread1();
	Thread tt1=new Thread(t1,"Threadtt1");
	Thread tt2=new Thread(t1,"Threadtt2");
	t1.x=10;
	tt1.start();
	t1.x=20;
	tt2.start();
	}
}