import java.util.Scanner;

public class Sample
{
	
  int n,rev=0;
  Scanner d=new Scanner(System.in);
  void input()
  {
	  System.out.println("Enter the n value is:\n");
	  n=d.nextInt();//n=123
  }
  void display()
  {
	  while(n!=0)
	  {
		  rev=rev*10;
		  rev=rev+n%10;
		  n=n/10;
		  System.out.println("Inside loop:\n"+rev);
	  }
	  System.out.println("Total Revers Number is:\n"+rev);
  }
}

class Demo
{

	public static void main(String[] args) 
	{
      Sample f=new Sample();
      f.input();
      f.display();

	}

}
