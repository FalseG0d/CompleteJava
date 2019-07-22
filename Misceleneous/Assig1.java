import java.util.*;
public class Assig1
{
public static void main(String s[])
	{
	int z[];
	System.out.println("Enter the size of Array1");
	int x=new Scanner(System.in).nextInt();
	z=new int[x];
	System.out.println("Enter the Array1");
	for(int i=0;i<x;i++)
		{z[i]=new Scanner(System.in).nextInt();}

	System.out.println("Enter the size of Array2");
	int y=new Scanner(System.in).nextInt();
	char ch[];
	ch=new char[y];
	
	for(int i=0;i<y;i++)
		{
		Scanner sc=new Scanner(System.in);	
		ch[i]=sc.next().charAt(0);
		}
	for(int i=0;i<x;i++)
	System.out.print(z[i]);
	System.out.println("\n");
	System.out.println(ch);
	}
}