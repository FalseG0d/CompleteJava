import java.util.*;
import java.io.*;
class CI
{
static float pow(float f,float t)
	{
	float temp=f;
	for(int i=0;i<t;i++)
		f=f*temp;
	return f;
	}

public static void main(String s[])
	{
	PrintStream pln=System.out;
	float a,p,r,t,c;
	System.out.println("Enter the values\nResult");
	Scanner sc=new Scanner(System.in);
	p=sc.nextFloat();
	r=sc.nextFloat();
	t=sc.nextFloat();
	a=p*(pow((1+r/100),t));
	c=a-p;
	System.out.println(c);
	pln.println("Apoorv");
	}
}