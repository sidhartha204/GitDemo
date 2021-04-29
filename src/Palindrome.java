
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "MADAAM";
		int i=0, j=s.length()-1;
		
		while(i<j)
		{
			//If both i and j positions not matching then we do this
			if(s.charAt(i)!=s.charAt(j))
			{
				System.out.println("Not a Palindrome");
				System.exit(0);
			}
			//If both positions matching then we do this
			i++;
			j--;
		}
		System.out.println("It is Palindrome");
	}

}
