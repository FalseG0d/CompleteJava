import java.util.*;
class Assig2
{
public static void main(String s[])
	{
	int z1[];
	System.out.println("Enter the size");
	int x1=new Scanner(System.in).nextInt();
	z1=new int[x1];
	for(int i=0;i<x1;i++)
		{z1[i]=new Scanner(System.in).nextInt();}

	int z2[];
	System.out.println("Enter the size");
	int x2=new Scanner(System.in).nextInt();
	z2=new int[x2];
	for(int i=0;i<x2;i++)
		{z2[i]=new Scanner(System.in).nextInt();}

	int size=x1;
	for(int i=0;i<x1;i++)
		{
		for(int j=0;j<x2;j++)
			{
			if(z1[i]==z2[j])
				{
				break;
				}
			else if(j==(x2-1))
				size++;
			}
		}
	
	System.out.println(size);
	/*int z[]=new int[size];
	for(int i=0;i<size;i++)
		{
		for(int j=0;j<x1;j++)
			{
			for(int k=0;k<x2;k++)
				{
				
			if(z1[j]==z2[k])
				{
				z[i]=z1[j];
				System.out.println("Assigning "+z1[j]);
				break;
				}
			else if(k==(x2-1))
				{
				z[i]=z2[k];
				System.out.println("Assigning "+z2[k]);
				}

				}
			}
		}
	System.out.println("The Array is");
	for(int i=0;i<size;i++)
			System.out.print(z[i]+" ");*/
	}
}