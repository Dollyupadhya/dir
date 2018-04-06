package List;
import java.util.*;
public class Linked_List {
	public static void main(String args[])
	{
		LinkedList al=new LinkedList();
		al.add("A");
		al.add("1");
		al.add("null");
		al.add("A");
		System.out.println(al);
		System.out.println("----");
		al.set(0,"s/w");
		System.out.println(al);
		System.out.println("----");
		al.remove(2);
		System.out.println(al);
		System.out.println("-----");
		al.add(2,"m");
		System.out.println(al);
		System.out.println("-----");
		al.addFirst("N");
		System.out.println(al);
		System.out.println("------");
		al.removeLast();
		System.out.println(al);
		
		}

}
