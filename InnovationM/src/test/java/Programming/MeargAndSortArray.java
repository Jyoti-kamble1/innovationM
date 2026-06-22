package Programming;
import java.util.Arrays;
/*
 Input  : arr = [1,4,7,8]          arr2 =[2,3,5]            
 Output : arr = [1,2,3,4]          arr2[5,7,8]	
 */
public class MeargAndSortArray {

	public static void main(String[] args) 
	{
		int[] a= {1,4,7,8};
		int[] b= {2,3,5};
		
		int m[]= new int[a.length+b.length];
		
		for(int i=0;i<m.length;i++)
		{
			if(i<a.length)
			{
			m[i]=a[i];
			}else
			{
				m[i]=b[i-a.length];
			}
				
		}
		Arrays.sort(m);
		for(int j=0;j<m.length;j++)
		{
			if(j<a.length)
			{
				a[j]=m[j];
			}else
			{
				b[j-a.length]=m[j];
			}
		}
		System.out.println(Arrays.toString(m));
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));		
	}
}
