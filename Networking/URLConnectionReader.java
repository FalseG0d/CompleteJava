import java.io.*;
import java.net.*;
class URLConnectionReader
{
static String inputLine="";
public static void main(String s[])throws Exception
	{
	URL google=new URL("https://www.google.com/");
	URLConnection yc=google.openConnection();
	BufferedReader in=new BufferedReader(new InputStreamReader(yc.getInputStream()));
	while(inputLine!=null)
		{
		inputLine=in.readLine();
		System.out.print(inputLine);
		}
	in.close();
	}
}