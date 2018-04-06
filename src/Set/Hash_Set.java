package Set;
import java.util.*;
public class Hash_Set {
	public static void main(String args[])
	{
		HashSet h=new HashSet();
		h.add("M");
		h.add("N");
		h.add("*");
		h.add(null);
		h.add(10);
		System.out.println(h.add("M"));
		System.out.println(h );
	}
}
