import java.util.*;

public class Sample 
{
  int a;
  float f1;
  double d1;
  String name;
  Scanner scan=new Scanner(System.in);
  void get1()
  {
	  System.out.println("Enter the value is:\n");
	  a=scan.nextInt();
	  f1=scan.nextFloat();
	  d1=scan.nextDouble();
	  name=scan.next();
  }
  void get2()
  {
	  System.out.println("Integer"+a);
	  System.out.println("Float"+f1);
	  System.out.println("Double"+d1+"StringValue is"+name);
  }
}
class Demo
{
	public static void main(String[] args) 
	{
		Sample d1=new Sample();
		d1.get1();
		d1.get2();

	}

}
