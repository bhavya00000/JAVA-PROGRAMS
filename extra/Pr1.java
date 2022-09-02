import java.io.*;
public class Pr1
{
	public static void main(String args[])
	{
	try
	{
	InputStreamReader i=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(i);
	System.out.println("Enter the first number:");
	String s1=br.readLine();
	int a=Integer.parseInt(s1);
	System.out.println("Enter the second number:");
	String s2=br.readLine();
	int b=Integer.parseInt(s2);
	int c=a+b;
	System.out.println("Addition Result:"+c);

	}
	catch(Exception e)
	{
	System.out.println("Exception:"+e);
	}
	}
}