
public class Sample
{
	
  void get(int s,String name)
  {
	  System.out.println("Method-1");
	  System.out.println("Value is:\n"+s+""+name);
  }
  void get1()
  {
	  System.out.println("Method-2");
  }
}
class MainClass
{
  public static void main(String as[])
  {
	  Sample g1=new Sample();
	  g1.get(100,"niit");
	  g1.get1();
	  System.out.println("Its Main Method...");
	  //return 0;
	
  }
}
