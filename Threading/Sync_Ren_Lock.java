import java.util.concurrent.locks.ReentrantLock;
class Sync_Ren_Lock extends Thread
{
ReentrantLock rl=new ReentrantLock();
Sync_Ren_Lock(String s)
	{
	super(s);
	}
public void run()
	{
	System.out.println("Initiating Thread "+Thread.currentThread().getName());
	rl.lock();
	try
		{
		Thread.sleep(1000);
		}catch(Exception e){}
	System.out.println("Entered Lock");
	rl.unlock();
	System.out.println("Thread death "+Thread.currentThread().getName());
	}
public static void main(String s[])
	{
	Sync_Ren_Lock t1=new Sync_Ren_Lock("Thread1");
	Sync_Ren_Lock t2=new Sync_Ren_Lock("Thread2");
	Sync_Ren_Lock t3=new Sync_Ren_Lock("Thread3");
	t1.start();
	t2.start();
	t3.start();
	}
}