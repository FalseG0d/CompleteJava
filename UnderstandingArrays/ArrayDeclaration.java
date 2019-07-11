import java.util.Scanner;
class ArrayDeclaration
{
public static void main(String s[])
	{
	int a[][]=new int[3][];
	System.out.println("Enter the first number");
	int x=new Scanner(System.in).nextInt();
	a[0]=new int[x];
	System.out.println("Enter the third number");
	x=new Scanner(System.in).nextInt();
	a[2]=new int[x];
	System.out.println("Enter the second number");
	x=new Scanner(System.in).nextInt();
	a[1]=new int[x];
	for(int i=0;i<3;i++)
		{
		for(int j=0;j<a[i].length;j++)
		System.out.print(a[i][j]);
		System.out.println("");
		}
	}
}