import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // This one also right syntax
		HashMap<Integer,String> hm1 = new HashMap();
		//use this one more
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		//Assign key and value 
		hm.put(123, "hey");
		hm.put(234, "Sid");
		hm.put(null, null);
		hm.put(567, null);
		hm.put(890, null);
		System.out.println(hm);
		//To get key value
		//System.out.println(hm.get(234));
		//To remove key
		//System.out.println(hm.remove(123));
		//System.out.println(hm);
		hm.size();
		//for storing values in set indexes
		Set s = hm.entrySet();
		//Now using iterator interface move to each index and grab the value
		Iterator it = s.iterator();
		it.next();
		while(it.hasNext())
		{
			//If you want to seperate both key and value then cast Map.Entry class with it.next()
			//Here it will show error cannot cast from string to Map entry.
			//So remove <String> from Iterator 
		    Map.Entry mp = (Map.Entry)it.next();
		    mp.getKey();
		    mp.getValue();
		    System.out.println(mp.getKey());
		    System.out.println(mp.getValue());
		   
		}
	}

}
