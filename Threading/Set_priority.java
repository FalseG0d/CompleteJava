class Set_priority
{
public static void main(String s[])
	{
	System.out.println(Thread.currentThread().getPriority());
	Thread.currentThread().setPriority(10);
	System.out.println(Thread.currentThread().getPriority());
	Thread t1=new Thread("thread1");
	System.out.println(t1.getPriority());
	t1.setPriority(5);
	System.out.println(t1.getPriority());
	}
}