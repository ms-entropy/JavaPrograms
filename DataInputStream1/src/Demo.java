import java.io.DataInputStream;
import java.io.IOException;

public class Demo
{
	int a;
	float f1;
	String name;
	DataInputStream f=new DataInputStream(System.in);
  void g1() throws NumberFormatException, IOException
  {
	  System.out.println("Enter the value is:\n");
	  a=Integer.parseInt(f.readLine());
	  f1=Float.parseFloat(f.readLine());
	  name=f.readLine();
  }
  void ds()
  {
	  System.out.println("Result is%d\n"+a+""+f1+""+name);
  }
}
class Demo1
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
	  Demo g=new Demo();
	  g.g1();
	  g.ds();

	}

}