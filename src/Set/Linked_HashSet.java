package Set;
import java.util.*;
public class Linked_HashSet {
	public static void main(String args[])
	{
		LinkedHashSet h=new LinkedHashSet();
		h.add("M");
		h.add("N");
		h.add("*");
		h.add(null);
		h.add(10);
		System.out.println(h.add("M"));
		System.out.println(h );
	}
}
