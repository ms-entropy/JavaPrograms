import java.util.HashSet;

public class Sample
{

	
	void get1()
	{
		HashSet list=new HashSet();
		
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a1");
		
		System.out.println(""+list);
		System.out.println("Size "+list.size());
		System.out.println("Searching"+list.contains("a5"));
	}
	
	public static void main(String[] args) 
	{
		
    Sample g=new Sample();
    g.get1();
	}

}
