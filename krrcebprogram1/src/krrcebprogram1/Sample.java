package krrcebprogram1;

import java.util.Scanner;

public class Sample 
{

	int a;
	float f1;
	String name;
	Scanner g=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is:");
		a=g.nextInt();
		f1=g.nextFloat();
		name=g.next();
		System.out.println("Your value is:"+a+""+f1+""+name);
	}
	
	public static void main(String[] args)
	{
	  Sample j1=new Sample();
	  j1.input();

	}

}