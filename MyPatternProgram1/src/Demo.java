import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo 
{

	public static void main(String[] args)
	{
		/*String s1="azar";
	    Pattern p1=Pattern.compile(s1);
	    String s2=p1.pattern();
	    System.out.println("Check"+s2);*/
		
		Pattern p2=Pattern.compile(",");//(":");(".")
		String[] split=p2.split("one,two,three",2);
		for(String elm:split)
		{
			System.out.println(""+elm);
		}

	}

}
