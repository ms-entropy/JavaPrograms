import java.util.HashSet;

public class Demo 
{
  HashSet g1=new HashSet();	
  void get1()
  {
	  g1.add("a1");
	  g1.add("a2");
	  g1.add("a3");
	  
	  System.out.println("List is:\n"+g1);
	  System.out.println("Before remove:\n"+g1.size());
	  System.out.println("Remove:\n"+g1.remove("a1"));
	  System.out.println("After Remove:\n"+g1.size());
	  System.out.println("search:\n"+g1.contains("a1"));
	  System.out.println("ClassName:\n"+g1.getClass());
	  
  }
}
class Sample
{
	public static void main(String[] args)
	{
		Demo g=new Demo();
		g.get1();

	}

}
