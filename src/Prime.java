
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=6;
		//Assume number is prime by default
		boolean isPrime = true;
		
		//Need to check whether number is divisible by between numbers like 2,3,4.
		//we will check upto 4, so value of i should be less than number. so we will take i<number
		for(int i=2;i<number;i++)
		{
			//check it is divisible by those numbers 2,3,4. If it is divisible then set isPrime = false 
			if(number%i==0)
			{
				isPrime = false;
				break;
			}
		}
		//I am printing here default value. If it is prime
		System.out.println("Is "+number+" a prime number:"+isPrime);
		
	}
	
	}
