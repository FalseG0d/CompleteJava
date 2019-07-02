public class Format
{
public static void main(String s[])
	{
	float floatVar=2.4f;
	int intVar=10;
	String stringVar="India";
	String sf=String.format("FloatVar=%f\nIntVar=%d\nStringVar=%s",floatVar,intVar,stringVar);
	System.out.println(sf);
	}
}