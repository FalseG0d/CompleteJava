class Assig3
{
public static void main(String s[])
	{
	int a[]={0,1,1,0,1,2,2,0,1};
	char b[]={'a','b','c','d','e','f','g','h','i'};
	char c[]=new char[9];
	for(int i=0;i<9;i++)
		{
		if(i%2!=0)
			{c[i/3+3*a[i]]=b[i];}
		else if((i%2==0)&&(i<=4))
			{c[i/2+3*a[i]]=b[i];}
		else if((i%2==0)&&(i>4))
			{c[i/2+3*a[i]-1]=b[i];}
		}
	for(int i=0;i<9;i++)
		{System.out.print(c[i]+" ");}
	}
}