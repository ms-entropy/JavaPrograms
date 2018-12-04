
public class SampleApp extends Thread
{
  public void run()
   {
	  try
	  {
	  System.out.println("YourThreadName is:\n"+Thread.currentThread().getName());
	  System.out.println("YourThreadPrioty is:\n"+Thread.currentThread().getPriority());
	   for(int i=0;i<=5;i++)
	   {
		   Thread.sleep(5000);
		   System.out.println(i);
	   }
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
		SampleApp t1=new SampleApp();
		SampleApp t2=new SampleApp();
		t1.start();
		t2.start();
		t1.setName("Azar");
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);

	}

}
