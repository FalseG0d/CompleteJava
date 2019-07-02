public class CopyValueOf
{
public static void main(String s[])
	{
	char[] s1={'h','e','l','l','o'};
	String s2="";
	System.out.println(s2.copyValueOf(s1));
	System.out.println(s2.copyValueOf(s1,0,4));
	}
}