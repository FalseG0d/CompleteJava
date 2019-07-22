//import java.lang.Math;
class Assig_array
{
static int asum(int a[][])
	{
	int flag=1;
	int s=0,s1=0;
	for(int i=0;i<a.length-1;i++)
		{
		for(int j=0;j<a[i].length;j++)
			{
			s=s+a[i][j];
			s1=s1+a[i+1][j];
			}
		if(s>s1)
			flag=0;
		s=0;
		s1=0;
		}
	
	return flag;		
	}
static int a_sum(int a[][])
	{
	int flag=1;
	int s=0,s1=0;
	for(int i=0;i<a.length-1;i++)
		{
		for(int j=0;j<a[i].length;j++)
			{
			s=s+a[j][i];
			s1=s1+a[j][i+1];
			}
		if(s>s1)
			flag=0;
		s=0;
		s1=0;
		}
	
	return flag;		
	}
int max(int a[])
	{
	int max=a[0];
	for(int i=0;i<a.length;i++)
		{
		if(a[i]>max)
			max=a[i];			
		}
	return max;
	}
int min(int a[])
	{
	int min=a[0];
	for(int i=0;i<a.length;i++)
		{
		if(a[i]<min)
			min=a[i];			
		}
	return min;
	}
int min1(int a[][])
	{
	int min=a[0][0];
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
			{
			if(a[i][j]<min)
			min=a[i][j];
			}
		}
	return min;
	}
int max1(int a[][])
	{
	int max=a[0][0];
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
			{
			if(a[i][j]>max)
			max=a[i][j];
			}
		}
	return max;
	}
static int[] sort(int a[])
	{
	int temp;
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length-1-i;j++)	
			{
			if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
	return a; 	
	}
int[] mergesort(int a[],int b[])
	{
	int c[]=new int[a.length+b.length];
	for(int i=0;i<a.length;i++)
		c[i]=a[i];
	for(int i=a.length;i<a.length+b.length;i++)
		c[i]=b[i-a.length];
	c=sort(c);
	return c;
	}
void matrix_add(int a[][],int b[][])
	{
	if((a.length==b.length)&&(a[0].length==b[0].length))
		{
		for(int i=0;i<a.length;i++)
			{
			for(int j=0;j<a[i].length;j++)
				a[i][j]=a[i][j]+b[i][j];
			}
		}
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+ "\t");
		System.out.println("");
		}
	
	}

void sort1(int a[][])
	{
	
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+"\t");
		System.out.println("");
		}
		
	int temp;
	
	while(asum(a)==0)
	//for(int i1=0;i1<20;i1++)
	{
	for(int i=0;i<a.length;i++)
		{
		for(int k=0;k<a.length-1;k++)
			{
			if(a[k][i]>a[k+1][i])
				{
				temp=a[k][i];
				a[k][i]=a[k+1][i];
				a[k+1][i]=temp;
				System.out.println("Exchange complete");
				}
			}
		}
	}
	
	//for(int i1=0;i1<20;i1++)
	while(a_sum(a)==0)
	{
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length-1;j++)
			{
			if(a[i][j]>a[i][j+1])
				{
				temp=a[i][j];
				a[i][j]=a[i][j+1];
				a[i][j+1]=temp;
				System.out.println("Exchange complete");
				}
			}
			
		}
	}
	System.out.println("\n");
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
			System.out.print(a[i][j]+"\t");
		System.out.println("");
		}
	}
void shift(int a[])
	{
	int temp;
	
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length-i-1;j++)
			{
			
			if((a[j]<a[j+1])&&(a[j]<=0))
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			else if((a[j]>a[j+1])&&(a[j]>0))
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			
			}
		}
	
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	}
String num_to_word(int x,int i)
{
if((i!=1)&&(i!=4))
	{
	if(x==1)
		return "one";
	else if(x==2)
		return "two";
	else if(x==3)
		return "three";
	else if(x==4)
		return "four";
	else if(x==5)
		return "five";
	else if(x==6)
		return "six";
	else if(x==7)
		return "seven";
	else if(x==8)
		return "eight";
	else if(x==9)
		return "nine";
	else 
		return "";
	}
else 
	{
	if(x==2)
		return "twenty";
	else if(x==3)
		return "thirty";
	else if(x==4)
		return "fourty";
	else if(x==5)
		return "fifty";
	else if(x==6)
		return "sixty";
	else if(x==7)
		return "seventy";
	else if(x==8)
		return "eighty";
	else if(x==9)
		return "ninety";
	else if(x==1)
		return "ten and";
	else 
		return "";
	}
//return "";
}
void num_to_word_ext(int i,int x)
{
if(i==0)
	System.out.print(" ");
else if(i==1)
	System.out.print(" ");
else if(i==2)
	System.out.print(" Hundred ");
else if(i==3)
	System.out.print(" Thousand ");
else if(i==4)
	{
	//System.out.print(num_to_word(x,1));
	//System.out.println("Thousand");
	}
}
void numtoword(int a)
{
	
int x=0,i=0,y;

while(a>0)
	{
	x=x*10;
	x=x+a%10;
	a=a/10;
	i++;
	}
	
while(x>0)
	{
	y=x%10;
	i--;
	System.out.print(num_to_word(y,i)+" ");
	num_to_word_ext(i,y);
	x=x/10;
	}
}
void freq_count(int a[])
{
int temp,freq=0;
	for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length-1-i;j++)	
			{
			if(a[j]<a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}

for(int i=0;i<a.length;i++)
	{
	temp=a[i];
	for(int j=i;j<a.length;j++)
		{
		if(a[j]==temp)
			{
			freq++;
			}
		}
	System.out.println(temp+"\t"+freq);
	if(freq>1)
		i=i+freq;
	freq=0;
	}
}
void long_seq(int a[])
	{
	int r[]=new int[a.length];
	int k=0;
	a=sort(a);
	for(int i=0;i<a.length;i++)
		{
		r[k]=a[i];
		for(int j=i;j<a.length-2;j++)
			{
			if((a[j+1]==a[j]+1)&&(k<a.length-1))
				{
				r[k+1]=a[j+1];
				k++;
				if(k==a.length-1)
					{
					break;
					}
				}
		
			else
				{
				i=k;
				k=0;
				break;
				}
			}
		}
	for(int i=0;i<=k;i++)
			System.out.print(r[i]+" ");
	}
public static void main(String s[])
	{
	int a[]={-5,-5,-5,-2,-1,5,3,3,1,0},c[]={49,3,200,2,4,70,5};
	int b[][]={{3,2,1},{9,8,7},{6,5,4}},d[][]={{1,2,3},{4,5,6},{7,8,9}};
	Assig_array p=new Assig_array();
	/*System.out.println(p.max(a));
	System.out.println(p.min(a));
	System.out.println(p.max1(b));
	System.out.println(p.min1(b));
	a=(p.sort(a));
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	System.out.println("");
	a=p.mergesort(a,c);
	
	//System.out.println(" ");
	
	for(int i=0;i<a.length;i++)
		System.out.print(a[i]+" ");
	System.out.println(" ");
	p.matrix_add(b,d);
	p.numtoword(12345);*/
	p.long_seq(c);
	}
}