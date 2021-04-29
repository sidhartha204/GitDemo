import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method-1: Brute Force
		int[] a = {3,6,7,3,4,4};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j] && i!=j)
				{
					System.out.println(a[j]+" ");
				}
			}
		}
		
		//Method-2: HashSet
		int[] b= {3,6,7,3,4,4};
		Set<Integer> s = new HashSet<>();
		for(int no:b)
		{
			if(s.add(no)==false)
			{
				System.out.println(no);
			}
		}
	}

}
