class Thread1 implements Runnable
{
public void run()
	{
	for(int i=0;i<5;i++)
		{
		System.out.println(Thread.currentThread().getName());
		try
			{
			Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	
}
class Run_multi_thread_Runnable
{
public static void main(String s[])
	{
	Thread1 t1=new Thread1();
	Thread tt1=new Thread(t1,"Thread");
	tt1.start();
	Thread tt2=new Thread(t1,"Thread1");
	tt2.start();
	}
}