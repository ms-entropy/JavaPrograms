package interfaceprogram1;

interface Sample
{
	
	//int a;
	void get1();
}
interface Sample1 extends Sample
{
	void get2();
}
class D implements Sample1
{
	public void get1()
	{
		System.out.println("welcome");
	}
	public void get2()
	{
		System.out.println("welcome to niit");
	}
}


public class Demo {

	public static void main(String[] args) 
	{
	    D h=new D();
	    h.get1();
        h.get2();
	}

}
