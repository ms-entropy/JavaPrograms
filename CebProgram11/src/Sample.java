
public class Sample
{
	
	Sample()
	{
		System.out.println("welcome to default cons...");
	}
	Sample(String name)
	{
		System.out.println(name);
	}
	void get()
	{
		System.out.println("Normal function..");
	}
	
	
	

	public static void main(String[] args) 
	{
	  Sample f=new Sample();
	  f.get();
		new Sample("niit");

	}

}