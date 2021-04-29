
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=8;
		int first=1, second=1, third;
		
		//we take from i=3 bcz already we take 2 values first and second
		for(int i=3;i<=number;i++)
		{
			third=first+second;
			System.out.println(third);
			first=second;
			second=third;
			
		}
	}

}
