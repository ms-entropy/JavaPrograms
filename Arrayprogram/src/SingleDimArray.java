import java.util.Scanner;

public class SingleDimArray 
{
  int p[]=new int[20];
  Scanner g=new Scanner(System.in);
  int n,i;
  void g1()
  {
	  System.out.println("Enter the n value is:\n");
	  n=g.nextInt();
  }
  void g2()
  {
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("Enter the array value is:\n");
		  p[i]=g.nextInt();
		  //System.out.println("Result is:\n"+p[i]);
	  }
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("Result is:\n"+p[i]);
	  }
  }
}
class Sample
{
	public static void main(String[] args) 
	{
		SingleDimArray g=new SingleDimArray();
		g.g1();
		g.g2();

	}

}