import java.util.Scanner;

public class LargestPalindrome 
{
	
	public static void main(String[] args) 
	{
		int count=0;
		int a=0;
		int b=0;
		int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.next();
		for (char i='a';i<='z';i++)
		{
			for (int j = 0; j < s.length(); j++) 
			{
				if (s.charAt(j)==i)
				{
					count++;
				}
			}
			
			if(count!=0)
			{
				System.out.println(i+":"+count);
				
				if(count%2==0)
				{
					a++;
				}
				if(count==1)
				{
					b++;
				}
			}
			count=0;
		}
	
		if(b>0)
		{
			if(b==s.length())
			{
				c=-1;
			}
			else
			{
				c=(a*2)+1;
			}
		}
		System.out.println("largest palindrome is:"+c);
	}
}
/*1st test case is: madam op is 5
 * 2nd is template op is 5
 * 3rd is sagrt op is -1*/
