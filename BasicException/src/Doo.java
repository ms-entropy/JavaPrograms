

import java.util.InputMismatchException;
import java.util.Scanner;

public class Doo 
{

	Scanner g=new Scanner(System.in);
	int a;
	void get1()
	{
		try
		{
		System.out.println("Enter the value is:\n");
		a=g.nextInt();
		
		
		}
		catch(InputMismatchException t)
		{
			System.out.println(t);
		}
		finally
		{
		System.out.println("Your Input value:"+a);
		}
		
	}
	
	
	public static void main(String[] args)
	{
		Doo h=new Doo();
		h.get1();

	}

}
