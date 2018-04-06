package List;
import java.util.*;
public class StackDemo {
	public static void main(String args[])
	{
		Stack al=new Stack();
		al.push("A");
		al.push("Z");
		al.push("w");
		System.out.println(al);
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(al.search("g"));
		System.out.println(al.search("A"));
		}
}
