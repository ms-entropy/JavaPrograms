import java.util.Scanner;

public class Demo
{

  int i,n;
  int a[]=new int[5];//array declartion
  Scanner f1=new Scanner(System.in);
  void input()
  {
	  System.out.println("Enter the value is:");
	  n=f1.nextInt();
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("Enter the Array value is:\n");
		  a[i]=f1.nextInt();
		  //System.out.println(a[i]);
	  }
	  
  }
  void dis()
  {
	  for(i=0;i<=n;i++)
	  {
		  System.out.println(a[i]);
	  }
  }
}

class Sample
{
  public static void main(String as[])
  {
	  Demo g1=new Demo();
	  g1.input();
	  g1.dis();
  }
}