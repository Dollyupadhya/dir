package Set;
import java.util.*;
public class Tree_Set {
	public static void main(String args[])
	{
		TreeSet t=new TreeSet();
		t.add("A");
		t.add("B");
		t.add("L");
		t.add("q");
		System.out.println(t);
		//t.add(new Integer(10));//ClassCastException
		//t.add(null);//NullPointerException
		TreeSet t1=new TreeSet();
		t1.add(new StringBuffer("A"));
		t1.add(new StringBuffer("Z"));
		t1.add(new StringBuffer("L"));
		t1.add(new StringBuffer("q"));
		System.out.println(t1);
	}
}
