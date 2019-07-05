class Throwable extends Object
{
String s;
public String toString()
	{return s;}
}
class Exception extends Throwable
{
Exception(String s)
	{
	this.s=s;
	}
}
class AgeException extends Exception
{
String s;
AgeException(String s)
	{
	this.s=s;
	}
public String toString()
	{return s;}
}
class CustomException1
{
public static void main(String s)
	{
	int age=10;
	try
		{
		if(age<18)
			throw new AgeException("Invalid Age");
		}catch(Exception e)
			{System.out.println(e);}
	}
}