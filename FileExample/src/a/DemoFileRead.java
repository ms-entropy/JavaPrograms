package a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileRead
{
	
   void display()throws IOException
   {
	   try
	   {
	    FileInputStream fis=new FileInputStream("D:\\sample.txt");
	    FileOutputStream fos=new FileOutputStream("F:\\check.txt");
	    int u;
	    while((u=fis.read())!=-1)//-1EOF
	    {
	    	System.out.print((char)u);//typcasting
	    	fos.write(u);
	    }
	   }
	   catch(FileNotFoundException t)
	   {
		   System.out.print(t);
	   }
   }
	
	public static void main(String[] args) throws IOException 
	{
		DemoFileRead h=new DemoFileRead();
		h.display();

	}

}
