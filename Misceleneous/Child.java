abstract class Base
{
int x,y;
void show()
{
System.out.println(x);
System.out.println(y);
}
abstract void display();
}
class Child extends Base
{
public void display()
{
System.out.println("Display");
}
public static void main(String s[])
{
Base c=new Child();
c.display();
}
}