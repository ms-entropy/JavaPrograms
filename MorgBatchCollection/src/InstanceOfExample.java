import java.util.ArrayList;

public class InstanceOfExample 
{

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add(101);
		
		for(Object elm:list)
		{
			if(elm instanceof String)
			{
				String t1=(String)elm;
				System.out.println("String Type data is:\n"+t1);
			}
			else if(elm instanceof Integer)
			{
				Integer t2=(Integer)elm;
				System.out.println("Integer Type elements:\n"+elm);
			}
		}

	}

}