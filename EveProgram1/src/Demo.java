
public class Demo 
{
    int sal=4000;//class or instance variable
	void g1(int a)
	{
		System.out.println("welcome"+a);
	}
	void g2(String u,float f1)//argument passing
	{
		System.out.println("welcome niit"+u+""+f1);
		System.out.println("float value is"+f1+""+sal);
	}
	void g3()
	{
		int age=100;//local variable
		System.out.println("salary is:"+sal+""+age);
		
	}
	
	
	public static void main(String[] args)
	{
		
		Demo g=new Demo();//object creation
		g.g1(100);
		g.g2("azar",3.4f);
		g.g3();


	}

}
