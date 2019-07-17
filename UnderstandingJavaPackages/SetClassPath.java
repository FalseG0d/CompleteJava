class SetClassPath
{
public static void main(String s[])
	{
	String cp=System.getProperty("java.class.path");
	System.out.println(cp);
	System.setProperty("java.class.path","C:");
	cp=System.getProperty("java.class.path");
	System.out.println(cp);
	}
}