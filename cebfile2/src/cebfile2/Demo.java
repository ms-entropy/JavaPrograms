package cebfile2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo extends Thread
{
  public void run()
  {
	  try
	  {
	   String name;
	   Scanner a=new Scanner(System.in);
	   FileOutputStream fos=new FileOutputStream("F:\\abc1.txt");
	   System.out.println("enter ur name");
	   name=a.next();
	   byte b[]=name.getBytes();
	   fos.write(b);
	 
	  System.out.println("Inserted..Watinggg Reading");
	  
	   
	  Thread.sleep(30000);
	  
	  FileInputStream fis=new FileInputStream("F:\\abc1.txt");
	  int i;
	  while((i=fis.read())!=-1)
	  {
		  System.out.print((char)i);
	  }
	  
	  }
	  catch(Exception t)
	  {
		  
	  }
  }
}

class Sample
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
	  
		Demo f1=new Demo();
		f1.start();

	}

}
