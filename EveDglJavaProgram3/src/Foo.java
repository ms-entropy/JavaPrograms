import java.io.DataInputStream;
import java.io.IOException;

public class Foo 
{
	int a;
	float f1;
	String name;
	char ds;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws NumberFormatException, IOException
	{
		System.out.println("Enter the value is:");
		a=Integer.parseInt(dis.readLine());
		f1=Float.parseFloat(dis.readLine());
		name=dis.readLine();
		ds=dis.readLine().charAt(0);
		
	}
	void process()
	{
		System.out.println("Integervalue is:\n"+a);
		System.out.println("FloatValue is:\n"+f1);
		System.out.println("String is:\n"+name);
		System.out.println("Charater is:\n"+ds);
		
	}
}
class Sample
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		Foo h=new Foo();
		h.input();
		h.process();

	}

}
