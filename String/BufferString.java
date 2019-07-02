class BufferString
{
public static void main(String s[])
	{
	StringBuffer sb=new StringBuffer("Apoorv");
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	sb.append("Hi");
	sb.append("Hello");
	System.out.println(sb);
	}
}