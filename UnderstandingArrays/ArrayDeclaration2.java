import java.util.Scanner;
class ArrayDeclaration2
{
public static void main(String s[])
	{
	int a[][]=new int[][]{{1,2,3},{3,4,5,6,7},{5,6,7,9}};
	for(int i=0;i<3;i++)
		{
		for(int j=0;j<a[i].length;j++)
		System.out.print(a[i][j]);
		System.out.println("");
		}
	}
}