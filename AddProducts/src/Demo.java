import java.util.Scanner;

public class Demo
{
	String custname,addr,category,p1,p2,p3;
	int prdprice,tot,dis,pr1,pr2,pr3,ts;
	int ch;
	Scanner g=new Scanner(System.in);
    void addCustomer()
	{
		//System.out.println("Enter the Customer Details:\n");
		System.out.println("Enter the Customer Name:\n");
		custname=g.next();
		System.out.println("Enter the Address:\n");
		addr=g.next();
		System.out.println("Enter the ProductCategory:\n");
		category=g.next();
		System.out.println("Enter the Product-1:\n");
		p1=g.next();
		System.out.println("Enter the Product-2:\n");
		p2=g.next();
		System.out.println("Enter the Product-3:\n");
		p3=g.next();
		choice();
		
		
	}
	void addProducts()
	{
		
		System.out.println("Enter the ProductPrice-1:\n");
		pr1=g.nextInt();
		System.out.println("Enter the ProductPrice-2:\n");
		pr2=g.nextInt();
		System.out.println("Enter the ProductPrice-3:\n");
		pr3=g.nextInt();
		
		tot=pr1+pr2+pr3;
		if(tot>1000)
		{
			System.out.println("Enter the discount Amount is 200:\n");
			dis=g.nextInt();
			if(dis==200)
			{
				ts=tot-dis;
				System.out.println("Your Discout of the Products is:\n"+ts);
			}
			else
			{
				//ts=dis;
				System.out.println("You have No Discout of the Products is:\n"+tot);
			}
		}
		else
		{
			System.out.println("You are Not Elig for Discout...");
		}
		choice();
	}
	void display()
	{
		System.out.println("******************************");
		System.out.println("Customer Name is :"+custname);
		System.out.println("ProductName-1 is :"+p1+"ProductName-2 is :"+p1+"ProductName-3 is :"+p3);
		System.out.println("TotalPrices is :"+tot);
		System.out.println("TotalDiscount is :"+ts);
		
	}
	void choice()
	{
		System.out.println("Enter the choices:\n");
		System.out.println("1.AddCustomerDetails");
		System.out.println("2.AddProductsDetails");
		System.out.println("3.DisplayDetails");
		System.out.println("4.Exit");
		ch=g.nextInt();
		switch(ch)
		{
		case 1:
			addCustomer();
			break;
		case 2:
			addProducts();
			break;
		case 3:
			display();
			break;
		default:
			System.out.println("Enter the correct choice...");
			break;
			
		}

	}
}
class Foo
{
	public static void main(String[] args) 
	{
		
		Demo j=new Demo();
		
		j.choice();
		
		
	}

	
	

}
