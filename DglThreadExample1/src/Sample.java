
public class Sample extends Thread
{
  public void run()
   {
	  try
	  {
	   System.out.println("welcome thread In");	  
	   Thread.sleep(15000);
	   System.out.println("welcome thread Out");
	  }
	  catch(InterruptedException r)
	  {
		  
	  }
   }
	
}
class Demo
{
	

	public static void main(String[] args) 
	{
		
		Sample t1=new Sample();
		t1.start();
		
		System.out.println("MainMethod");

	}

}