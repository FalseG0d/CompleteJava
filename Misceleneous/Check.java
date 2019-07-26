class A
{
int a=10;
}
class B extends A
{
int a=100;
}
class C extends B
{
int a=1000;
void show()
{
System.out.println("A:"+((A)this).a);
System.out.println("B:"+((B)this).a);
System.out.println("C:"+((C)this).a);
}
public static void main(String s[])
	{
	C obj=new C();
	obj.show();
	}
}