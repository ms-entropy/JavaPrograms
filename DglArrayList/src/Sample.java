import java.util.ArrayList;
import java.util.ListIterator;

public class Sample 
{

	ArrayList<String>list=new ArrayList<>();
	void get1()
	{
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a4");
		
		ListIterator<String>j1=list.listIterator();
		
		while(j1.hasNext())
			
		{
			
			System.out.println("List value is:\n"+j1.next());
			System.out.println("List value is:\n"+j1.nextIndex());
		}
         while(j1.hasPrevious())
			
		{
			
			
			System.out.println("List value is:\n"+j1.previous());
			System.out.println("List value is:\n"+j1.previousIndex());
		}
		
		
		
	}
	
	public static void main(String[] args) 
	{
		Sample g1=new Sample();
		g1.get1();

	}

}