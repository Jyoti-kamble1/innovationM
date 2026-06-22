package Programming;
/*
i/p=aaabbccdaabb
I/p=a3b2c2da2b2
 */
public class StringCompress {

	public static void main(String[] args) 
	{
		String s="aaabbccdaabb";
		int count =1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				System.out.print(s.charAt(i)+""+count);
			}
		}
	}
}