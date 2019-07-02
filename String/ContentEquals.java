class ContentEquals
{
public static void main(String s[])
	{
	String s1="Not immutable";
	String s2="Strings are immutable";
	StringBuffer s3=new StringBuffer("Not immutable");
	System.out.println(s1.contentEquals(s3));
	System.out.println(s2.contentEquals(s3));
	}
}