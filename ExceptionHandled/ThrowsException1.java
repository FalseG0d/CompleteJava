import java.io.IOException;
import java.io.DataInputStream;
class Div
{
int div(int x,int y)throws ArithmeticException
	{
	return x/y;
	}
}
class ThrowsException1
{
public static void main(String s[])
	{
	int a=readInt();
	int b=readInt();
	Div d=new Div();
	int z=d.div(a,b);
	System.out.println(z);
	}
}