
public class Sample 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String s1="niit";
		
		String s2="niits";
		
		StringBuilder sb=new StringBuilder("hello");
		
		//String s2=new String("wel");
		
		/*if(s1.equals(s2))
		{
		
		System.out.println(s1+""+s2);
		}
		else
		{
		System.out.println("NotEqual");	
		}*/
		
		System.out.println("CompareTo"+s1.compareTo(s2));
		
		System.out.println("UpperCase"+s1.toUpperCase());
		
		System.out.println(sb.length());
		
		
				

	}

}