import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Foo 
{
	float f1;
  HashSet<String>g1=new HashSet<>();
  Scanner g=new Scanner(System.in);
  void get1()
  {
	  g1.add("a1");
	  g1.add("a2");
	  g1.add("a3");
	  System.out.println("Value is:\n"+g1);
	  System.out.println("Value is:\n"+g1.size());
	  System.out.println("Class Name is:\n"+getClass());
	  System.out.println("Remove data is:\n"+g1.remove("a2"));
	  System.out.println("Value is:\n"+g1.size());
	  System.out.println("Search data is:\n"+g1.contains("a2"));
	  Iterator<String> h=g1.iterator();
	  while(h.hasNext())
	  {
		  System.out.println(""+h.next());
	  }
//	  System.out.println("Enter the value is:\n");
//	  f1=g.nextFloat();
//	  System.out.println("Float value is:\n"+f1);
	  
	  
  }
  void get2(float f2)
  {
	  
  }
}
class Demo
{
	public static void main(String[] args) 
	{
		Foo g=new Foo();
		g.get1();
		g.get2(4.5f);

	}

}
