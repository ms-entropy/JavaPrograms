import java.util.ArrayList;

public class ListExample2 
{
	

	public static void main(String[] args) 
	{
		ArrayList h=new ArrayList();
		h.add("azar");
		h.add("niit");
		
		h.add(101);
		h.add(102);
		
		for(Object elm:h)
		{
			if(elm instanceof String)
			{
				String str=(String)elm;
				System.out.println(str);
			}
			else if(elm instanceof Integer)
			{
				System.out.println(elm);
			}
			//System.out.println(elm);
		}

	}

}
