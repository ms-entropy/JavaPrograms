
public class Sample
{
    int a=10;//class or instance variables
    void get1()
	{
		float f1=100.5f;
		System.out.println("Method-1"+a);
		System.out.println("Local varibles:"+f1);
	}
	void get2()
	{
		System.out.println("Method-2"+a);
	}
}
class Demo
{
	public static void main(String as[]) 
	{
		
		System.out.println("MainMethod");
        Sample d1=new Sample();//object Creation
        d1.get1();//access the methods
        d1.get2();
	}

}