import java.util.Scanner;

public class Foo1 
{

	int a;
	float f1;
	String name;
	
	Scanner g=new Scanner(System.in);
	
	void g1()
	{
		System.out.println("Enter the value is:");
		a=g.nextInt();
		f1=g.nextFloat();
		name=g.next();
		
	}
	void input()
	{
		System.out.println("Integer value is:"+a);
		System.out.println("Float value is:"+f1);
		System.out.println("String is"+name);
	}
	
	public static void main(String[] args) 
	{
		Foo1 j1=new Foo1();
		j1.g1();
		j1.input();

	}

}
