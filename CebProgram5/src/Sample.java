import java.util.Scanner;

public class Sample 
{

	String name;
	Scanner g=new Scanner(System.in);
	void get()
	{
		System.out.println("Enter the String value is:\n");
		name=g.next();
		switch(name)
		{
		case "niit":
			System.out.println("Your Enter Niit");
			break;
		case "csc":
			System.out.println("Your Enter the Csc");
			break;
		default:
			System.out.println("Please enter correct value ...");
			//break;
		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Sample h=new Sample();
		h.get();
				

	}

}
