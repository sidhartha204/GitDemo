
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method-1: Convert string into character array,know the length of it and use for loop
		
	    String s ="SIDHARTHA";
	    char[] chars= s.toCharArray();
	    int length = chars.length;
	    for(int i=length-1;i>=0;i--)
	    {
	    	System.out.print(chars[i]);
	    }
	    
	    // Method-2: Using string Buffer
	    StringBuffer s1 = new StringBuffer();
	    s1.append(s);
	    s1.reverse();
	    System.out.print("Reverse String using Buffer:"+s1);
	    System.out.print("\n");
	    
	    // Method-3: Using string Builder
	    StringBuilder s2 = new StringBuilder();
	    s2.append(s);
	    s2.reverse();
	    System.out.print("Reverse String using Builder:"+s2);
	}

}
