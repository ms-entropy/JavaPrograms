import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample
{
	
   String u="azar";
   
   void writeData() throws IOException,FileNotFoundException
   {
	 FileOutputStream fos=new FileOutputStream("D:\\p1.txt");
	 byte d[]=u.getBytes();
	 fos.write(d);
	 System.out.println("Inserted..");
	 
   }
}
class Demo
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		Sample f1=new Sample();
		f1.writeData();

	}

}
