import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sample 
{
    String uname;
    Scanner g=new Scanner(System.in);
	void g1()
	{
	   try
	   {
	   int a=100/0;
	   
	   }
	   catch(ArithmeticException t)
	   {
		   System.out.println("please enter number"+t);
	   }
	   System.out.println("Enter the value is:\n");
	   uname=g.next();
	   System.out.println("Your name is:\n"+uname);
	   

	}
	void g2()throws NullPointerException
	{
		
			String a=null;
			
			System.out.println(a.length());
		
	}
	/*void g3()
	{
		try
		{
			try
			{
				
			}
			catch()
			{
				
			}
			try
			{
				
			}
			catch()
			{
				
			}
		}
		catch(Exception t)
		{
			
		}
	}*/
	
	public static void main(String[] args) throws NullPointerException
	{
		Sample g=new Sample();
		g.g1();
		g.g2();

	}

}
