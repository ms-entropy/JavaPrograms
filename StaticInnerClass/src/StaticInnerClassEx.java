
public class StaticInnerClassEx 
{

	
	private static String fieldToValidate;
	    static class ValidateCreditCards
	    {
	        void validate() 
	       {
	        	System.out.println("validateCreditCards");
	        }
	    }

	    static class ValidateDebitCards
	    {
	            void validate() 
	            {
	            	 System.out.println("validateDebitCards");
	            }
	    }
	        static class ValidateNetBankingAccount
	       {
	            void validate() 
	            {
	               System.out.println("validatenetbanking");
	            }

	       }
	        
	        public static void main(String as[])
	        {
	        	StaticInnerClassEx.ValidateNetBankingAccount valid=new StaticInnerClassEx.ValidateNetBankingAccount();
	        	valid.validate();
	        	
	        	StaticInnerClassEx.ValidateCreditCards valid1=new StaticInnerClassEx.ValidateCreditCards();
	        	valid1.validate();
	        	
	        }
	        
}


