class Assig4
{
int n=5;
int a[]={1,1,1,1,1};
int sum()
	{
	int s=0;
	for(int i=0;i<n;i++)
		s=s+a[i];
	return s;
	}
public static void main(String s[])
	{
	Assig4 A=new Assig4();
	int flag=0,n=0;
	int s1=A.sum();
	while(s1!=0)
		{
		flag=0;
		for(int i=0;i<n;i++)
			{
			if((A.a[i])%2!=0)
				{
				A.a[i]--;
				n++;
				}
			else 
				{
				flag=1;
				//a[i]=a[i]/2;
				}
			}
		if(flag==0)
			{
			for(int j=0;j<n;j++)
				A.a[j]=A.a[j]/2;
			n++;
			}
		s1=A.sum();
		}
	System.out.println(n);
	}
}