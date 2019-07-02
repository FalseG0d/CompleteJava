class TempString
{
final int x;
private TempString(int x)
	{this.x=x;}
public static TempString getInstance()
	{
	return new TempString(10);
	}
void show()
	{System.out.println(x);}
}
class DemoString
{
public static void main(String s[])
	{
	TempString t=TempString.getInstance();
	t.show();
	}
}