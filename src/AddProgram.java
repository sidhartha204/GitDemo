
public class AddProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		int c = sumMethod(a, b);
		int maxNumber = square(a,b);
		
		System.out.println(c);
		System.out.println(maxNumber);
	}
	
	public static int sumMethod(int number1, int number2)
	{
		return number1+number2;
	}
	
	public static int square(int x, int y)
	{
		double square =Math.sqrt(49);
		int max = Math.max(10, 20);
		
		System.out.println(square);
		return max;
	}
}
