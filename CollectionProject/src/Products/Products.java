package Products;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

interface addProduct
{
	public void addProduct();
}
public class Products implements addProduct
{
  public String pname;
  public int tot,rid;
  public int pid[]=new int[5];
  public int prices[]=new int[4];
  Scanner h=new Scanner(System.in);
  public static HashSet<String> hs=new HashSet<>();
  public static ArrayList<Integer> as=new ArrayList<>();
  
  public void addProduct()
  {
	  for(int i=0;i<2;i++)
	  {
	  System.out.println("Enter the ProductName:");
	  pname=h.next();
	  System.out.println("Enter the ProductId:");
	  pid[i]=h.nextInt();
	  
	 
	  System.out.println("Enter the ProductPrices:");
	  prices[i]=h.nextInt();
	  tot=prices[i]+prices[i];
	  
	   hs.add(pname);
	   as.add(pid[i]);
	   
	   
	  }
	   as.add(tot);
	   System.out.println("Your Name:"+hs);
	   System.out.println("Your Productid and prices"+as);
	   
  }
  public void stock()throws ArrayIndexOutOfBoundsException
  {
	  System.out.println("Are u sure delete the products");
	  
	  for(int i=0;i<1;i++)
	  {
	  pid[i]=h.nextInt();
	  
	  System.out.println("Remove elements"+as.remove(pid[i]));
	  
	  System.out.println("total stock"+as.size()); 
	  }
  }
}