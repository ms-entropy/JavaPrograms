
abstract class S1
{
	int p=10;
	public void g1()
	{
		System.out.println("Welcome to Normal Method..");
	}
	abstract public void g2();
}

class D extends S1
{

	@Override
	public void g2()
	{ 
		
		System.out.println("Welcome to Abstract Method is...");
		
		
		
	}
	
}



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		S1 g=new D();//Base class ref to Dervied Class
		
		//D s=new D();
		
		g.g1();
		g.g2();
				

	}

}