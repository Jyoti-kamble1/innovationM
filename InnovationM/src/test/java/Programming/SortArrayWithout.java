package Programming;

import java.util.Arrays;

public class SortArrayWithout {
	/*
	 * Input  :   [1,2,0,1,0,2]            
	 * Output  :  [0,0,1,1,2,2]
	 */
	public static void main(String[] args) 
	{
		int [] a1= {1,2,0,1,0,2};

		for(int i=0;i<a1.length-1;i++)
		{
			for(int j=0;j<(a1.length-1)-i;j++)
			{
				int temp=0;
				if(a1[j]>a1[j+1])
				{
					temp=a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a1));

	}
}
