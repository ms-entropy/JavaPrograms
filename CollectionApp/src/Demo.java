import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo 
{
	
 TreeSet<String> h1=new TreeSet<>();
  void g1()
  {
    h1.add("a1");
    h1.add("a2");
    h1.add("a3");
    
    Iterator h2=h1.iterator();
    
    while(h2.hasNext())
    {
    	 System.out.print(""+h2.next());
    }
    
   
  }
	
}
class Foo
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Demo g=new Demo();
		g.g1();

	}

}
