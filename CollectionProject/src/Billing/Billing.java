package Billing;
import Customer.Customer;
import Products.Products;
public class Billing 
{
  public void billing()
  {
	  System.out.println("BillingCustomerName"+Customer.hs);
	  System.out.println("BillingCusomerDetails"+Customer.as);
	  System.out.println("ProductDetails"+Products.hs);
	  System.out.println("ProductTotals"+Products.as);
	 
  }
}
