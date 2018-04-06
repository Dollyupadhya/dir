
package List;
import java.util.*;
public class Array_list {
public static void main(String args[])
{
	ArrayList al=new ArrayList();
	al.add("A");
	al.add("1");
	al.add("null");
	al.add("A");
	System.out.println(al);
	System.out.println("----");
	al.remove(2);
	System.out.println(al);
	System.out.println("-----");
	al.add(2,"m");
	System.out.println(al);
	System.out.println("-----");
	al.add("N");
	System.out.println(al);
	
	}
}
