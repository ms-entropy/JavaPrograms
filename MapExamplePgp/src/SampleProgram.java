import java.util.HashMap;
import java.util.Map;

public class SampleProgram 
{
	
   Map<Integer,String>j1=new HashMap<>();	
   void g1()
   {
	   j1.put(101,"s1");
	   j1.put(102,"s2");
	   j1.put(104,"s2");
	   j1.put(105,"s3");
   }
   void g2()
   {
	   for(Map.Entry k:j1.entrySet())
	   {
	   System.out.println("Display of"+k.getKey()+"\n"+k.getValue());
	   }
	   System.out.println("Searching of"+j1.containsKey(101));
	   System.out.println("Remove of"+j1.remove(102));
	   System.out.println("Check of"+j1.containsKey(102));
	   System.out.println("Size of"+j1.size());
	   System.out.println("index of"+j1.get(103));
   }

}
class Hoo
{
	
	public static void main(String[] args) 
	{
		SampleProgram k=new SampleProgram();
		k.g1();
		k.g2();

	}

}
