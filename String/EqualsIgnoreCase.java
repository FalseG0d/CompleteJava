public class EqualsIgnoreCase
{
public static void main(String s[])
	{
	String s1=new String("This is really not immutable");
	String s3=new String("This is really not immutable");
	String s4=new String("THIS IS REALLY NOT IMMUTABLE");
	System.out.println(s1.equals(s3));
	System.out.println(s1.equalsIgnoreCase(s4));	
	}
}