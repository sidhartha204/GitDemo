import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add("Hey");
		al.add(2);
		al.remove(0);
		System.out.println(al.get(0));
		System.out.println(al.contains(2));
		if(al.contains("Hello"))
		{
			System.out.println("yes yes ur there");
		}
		else
		{
			System.out.println("Hey ur not there");
		}
		System.out.println(al);
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("hey");
		//a.add(2);
		// Add element to any position
		a.add(0, "yes");
		System.out.println(a);
		// If you want to know in which index "yes" is present
		System.out.println(a.indexOf("hey"));
		//It will array is empty
		if(a.isEmpty());
		{
			System.out.println("True");
		}
		
		System.out.println(a.size());
		a.add("jhg");
		System.out.println(a.size());
		
		
	}

}
