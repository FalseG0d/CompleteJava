import java.util.Scanner;

public class Main {

	
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException{
		// Write your code here
		
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
      	
		for(int i=0;i<t;i++)
			{
			int temp;
			int n=s.nextInt();
			int n1=s.nextInt();
			int a[]=new int[n];
			for(int j=0;j<n;j++)
				a[j]=s.nextInt();
			for(int j=0;j<n;j++)
				{
				for(int k=0;k<j-k-1;k++)
					{
					if(a[k]>a[k+1])
						{
						temp=a[k];
						a[k]=a[k+1];
						a[k+1]=temp;
						}
					}
				}
			System.out.println(a[n-n1]);
			}
        }		
	}

