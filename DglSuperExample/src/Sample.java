
public class Sample 
{
	  int k1=10;
	void get1()
	{
		System.out.println("Base class value is:\n"+k1);
	}
}
class D extends Sample
{
	
	void get2()
	{
	    //final int  k1=20;
		
	    k1++;
		
		System.out.println("Base class value is:\n"+super.k1);
	}
}

class Demo
{

	public static void main(String[] args) 
	{
	   D g1=new D();
	   D g2=new D();
	   g1.get1();
	   g2.get2();

	}

}