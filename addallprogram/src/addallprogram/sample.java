package addallprogram;

import java.util.ArrayList;
import java.util.ListIterator;

public class sample 
{
	ArrayList<Integer>j1=new ArrayList<>();
	void get()
	{
	j1.add(1);
	j1.add(2);
	j1.add(3);
	j1.add(4);
	
	ListIterator<Integer>j2=j1.listIterator();
	while(j2.hasNext())
	{
		System.out.println("first list is\n"+j2.next());
	}
	}
	ArrayList<Integer>j3=new ArrayList<>();
	void put()
	{
	j3.add(5);
	j3.add(9);
	j3.add(8);
	j3.add(4);
	 
	ListIterator<Integer>j4=j3.listIterator();
	while(j4.hasNext())
	{
		System.out.println("second list is\n"+j4.next());
	}
	
	System.out.println("add list is\n"+j1.addAll(j3));
}
}	
class foo
{
	public static void main(String[] args)
	{
		sample s=new sample();
		s.get();
		s.put();
	}

}