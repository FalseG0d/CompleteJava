class CustomException
{
int age;
void get(int age)
	{
	if(age<18)
		{
		try{throw new ArithmeticException();}
		catch(ArithmeticException e)
			{System.out.println(e);}
		}
	else 
		this.age=age;
	}
public String toString()
	{
	return "Hello";
	}
public static void main(String s[])
	{
	CustomException t=new CustomException();
	t.get(10);
	}
}