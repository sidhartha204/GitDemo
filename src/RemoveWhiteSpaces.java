
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method-1: Using Replace All method
		String s ="Sidhartha Kumar";
		String s1= s.replaceAll(" ", "");
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer(s);
		s2.append("A.S"+ " " +s);
		System.out.println(s2);
		
		// Method-2: Convert to character array,find length and use for loop
		String s3= "Sidhartha Kumar";
		char[] chars = s3.toCharArray();
		int length = chars.length;
		String s4 ="";
	    for(int i=0; i<length;i++)
	    {
	    	if(chars[i]!=' ')
	    	{
	    		//Appending to new string
	    		s4=s4+chars[i];
	    	}
	    }
		System.out.println(s4);
	}

}
