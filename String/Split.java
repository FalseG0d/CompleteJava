class Split
{
public static void main(String arg[])
	{
	String str="Welcome to string tutorials";
	String s[]=str.split("-",2);
	//for(int i=0;i<s.length;i++)
		System.out.println(s[0]);
	s=str.split("-",3);
	for(int i=0;i<s.length;i++)
		{System.out.println(s[i]);}
	s=str.split("-",0);
	for(int i=0;i<s.length;i++)
		{System.out.println(s[i]);}
	s=str.split("-");
	for(int i=0;i<s.length;i++)
		{System.out.println(s[i]);}
	}
}