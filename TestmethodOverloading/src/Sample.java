
public class Sample
{

	
	int z1;
	float y1;
	
	void get1(int a1,int f1)
	{
		z1=a1+f1;
		System.out.println(""+a1+""+f1);
	
	}
    void get1(int a1,double g1)
	{
    	y1=(float) (a1+g1);
    	System.out.println(""+a1+""+z1);
	}
	
}
class Sample4
{
	public static void main(String[] args) 
	{
		Sample d1=new Sample();
		d1.get1(1,7);
		d1.get1(20,30.5);

	}

}
