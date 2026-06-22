package Programming;
import java.util.Arrays;
public class SortArray012 {
	public static void main(String[] args) 
	{	       
		int[] a = {1, 2, 0, 1, 0, 2};
		int low = 0;
		int mid = 0;
		int high = a.length - 1;

		while (mid <= high) 
		{
			switch (a[mid]) {
			case 0:
				int temp = a[low];
				a[low] = a[mid];
				a[mid] = temp;
				low++;
				mid++;
				break;

			case 1:
				mid++;
				break;

			case 2:
				temp = a[mid];
				a[mid] = a[high];
				a[high] = temp;
				high--;
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
