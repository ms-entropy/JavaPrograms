import java.io.DataInputStream;
import java.io.IOException;

public class Demo
{
  int a;
  float f1;
  String name;
  DataInputStream g=new DataInputStream(System.in);
  void f1() throws NumberFormatException, IOException
  {
	  System.out.println("Enter the value is:\n");
	  a=Integer.parseInt(g.readLine());
	  f1=Float.parseFloat(g.readLine());
	  name=g.readLine();
  }
  void dis()
  {
	  System.out.println("Your data is:\n"+a+""+f1+""+name);
  }
}
class Demo1
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		Demo g=new Demo();
		g.f1();
		g.dis();

	}

}