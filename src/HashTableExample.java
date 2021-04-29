import java.util.HashMap;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		//Assign key and value 
		hm.put(123, "hey");
		hm.put(234, "Sid");
		hm.put(null, null);
		System.out.println(hm);
		//To get key value
		//System.out.println(hm.get(234));
		//To remove key
		//System.out.println(hm.remove(123));
		//System.out.println(hm);
		hm.size();
	}

}
