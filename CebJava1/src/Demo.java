

import java.lang.*;//Default api
public class Demo
{
	int b=200;//class or instance varible
	void input()
	{
		int a=100;//local varible
		System.out.println("Method-111111"+a+""+b);
	}
	void input2()
	{
		System.out.println("Method-22222"+b);
	}
	
}

class Foo
{
	public static void main(String[] args) 
	{
		
		
	  System.out.println("MainBlock");//display the data in console

	  Demo g1=new Demo();
	  g1.input();
	  g1.input2();
	  
	}

}
