import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;


public class Demo 
{
	
  HashSet<String> list=new HashSet<>();
	
	//TreeSet<String> list=new TreeSet<>();
  
//ArrayList<String>list=new ArrayList<>();
  
//collection concepts
	//TreeSet list=new TreeSet();
	
  void g1()
  {
	  
	  list.add("hh");
	  list.add("jj");
	  list.add("kk");
	  list.add("mm");
	  list.add("bb");
	  
	  //ListIterator<String> m=list.listIterator();
	  Iterator<String>m=list.iterator();
	  
	  while(m.hasNext())
	  {
		 System.out.println("Value is:\n"+m.next());
		  //System.out.println("Value is:\n"+m.previous());
	  }
	  
	  System.out.println("Before Removing Data:"+list.size());
	  System.out.println("Data Remove:"+list.remove("a3"));
	  System.out.println("After Removing Data"+list.size());
	  System.out.println("Searching.."+list.contains("a3"));
	  System.out.println(" Arrayclass:"+list.getClass());
	  
	  
	  
  }
 
}
class Foo
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Demo k=new Demo();
		k.g1();

	}

}
