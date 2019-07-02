public class CompareToIgnoreCase
{
public static void main(String s[])
	{
	String s1="String are immutable";
	String s2="String are immutable";
	String s3="String are not immutable";
	int result=s1.compareTo(s2);
	System.out.println("Compare to "+result);
	result=s2.compareTo(s3);
	System.out.println("Compare to "+result);
	}
}