abstract class Foo
{
  abstract void get1();	

   public Foo()
  {
	  System.out.println("welcome to Cons...");
  }
}
class Sample extends Foo
{

	@Override
	void get1() 
	{
		System.out.println("Welcome NormalMethod");
		
	}
	
}

public class Demo 
{

	public static void main(String[] args) 
	{
		
     //Foo g=new Foo();
      //Foo g1=new Sample();
		Sample g1=new Sample();
        g1.get1();
      // Foo g=new Sample();
        //new Foo();
      
      
	}

}
