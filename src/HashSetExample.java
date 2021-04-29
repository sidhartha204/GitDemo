import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		hs.add("hello");
		hs.add("hello");
		hs.add(3);
		hs.add(1.24);
		hs.remove(3);
		hs.size();
		System.out.println(hs.contains("Hello"));
		System.out.println(hs);
		
		HashSet<String> h = new HashSet<String>();
		h.add("hey");
		h.add("Omg really");
		h.contains("hey");
		h.isEmpty();
		//h.add(2);
		
		Iterator<String> it = h.iterator();
		System.out.println(it.next());
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
