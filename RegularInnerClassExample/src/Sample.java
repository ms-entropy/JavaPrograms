
public class Sample 
{

	private String username="admin";
    private String pass="admin";		
	
    
    void ss()
    {
    	System.out.println(""+username+""+pass);
    }
    
    /*class Inner
    {
    	
    	public void validate()
    	{
    		System.out.println(""+username+""+pass);
    	}
    }*/
    
    
	public static void main(String[] args) 
	{
		Sample obj=new Sample();
		//Sample.Inner cobj=obj.new Inner();
        //cobj.validate();
		obj.ss();
	}

}
