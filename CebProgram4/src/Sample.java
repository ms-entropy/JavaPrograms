import java.util.Scanner;

public class Sample 
{

	int a,i,n;
	Scanner f1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the number is:\n");
		//a=f1.nextInt();//to read input from the user
		n=f1.nextInt();
		
	}
	void cal()
	{
		for(i=0;i<=n;i++)
		{
		if(i%2==0)
		{
			
			System.out.println("Even"+i);
		}
		else
		{
			System.out.println("Odd"+i);
		}
		}
	}
	public static void main(String[] args) 
	{
	
       Sample g=new Sample();
       g.input();
       g.cal();
	}

}
