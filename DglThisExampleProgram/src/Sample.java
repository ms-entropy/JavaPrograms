
public class Sample
{
	
  int k1,k2;
  void get1(int k1,int k2)
  {
	  this.k1=k1;
	  this.k2=k2;
	  System.out.println("Get-1 function is:"+k1+""+k2);
  }
  void get2()
  {
	  
	  System.out.println("Get-2 function is:"+k1+""+k2);
  }
  
}
class Demo
{
	public static void main(String[] args)
	{
		Sample g1=new Sample();
		g1.get1(100,200);
		g1.get2();

	}

}
