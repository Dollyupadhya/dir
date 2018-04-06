package List;
import java.util.*;
public class Vector_demo {
	public static void main(String args[])
	{
		Vector al=new Vector();
		System.out.println(al.capacity());
		for(int i=1;i<=10;i++)
		{
			al.addElement(i);
		}
		Enumeration e=al.elements();
		while(e.hasMoreElements())
		{
			Integer i=(Integer)e.nextElement();
			if(i%2==0)
				System.out.println(i);
		}
	/*	System.out.println(al.capacity());
		al.addElement("S");
		System.out.println(al.capacity());
		System.out.println(al);*/
		}
}
