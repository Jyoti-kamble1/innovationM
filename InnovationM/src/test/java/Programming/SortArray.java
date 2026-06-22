package Programming;

import java.util.Arrays;

/*
 * Input  :   [1,2,0,1,0,2]            
 * Output  :  [0,0,1,1,2,2]
 */
public class SortArray {

	public static void main(String[] args) 
	{
		int [] a1= {1,2,0,1,0,2};
		Arrays.sort(a1);
		System.out.println(Arrays.toString(a1));
	}

}
