package List;
import java.util.*;
public class List_Iterator {
	public static void main(String args[])
	{
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
ListIterator itr=l.listIterator();
while(itr.hasNext())
{
	String s=(String)itr.next();
	if(s.equals("B"))
		itr.remove();
	else if(s.equals("C"))
		itr.add("T");
	else if(s.equals("D"))
		itr.set("H");
	}
System.out.println(l);

}
	}
