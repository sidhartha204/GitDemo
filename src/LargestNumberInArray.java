
public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,560,204,700,4,8,1000};
		
		//First assume 0th index is max number
		int maxNumber = arr[0];
		for(int i=0; i<arr.length;i++)
		{
			//For minimum number 
			/*
			 * if(arr[i]<minNumber) { minNumber = arr[i]; }
			 */
			if(arr[i]>maxNumber)
			{
				maxNumber = arr[i];
			}
		}
		System.out.println("Maximum number in Array is:" + maxNumber);
		
		
	}
	
	

}
