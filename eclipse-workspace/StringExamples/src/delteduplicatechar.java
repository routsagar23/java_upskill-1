
import java.util.Scanner;

public class delteduplicatechar {

	public static void main(String[] args)
	{
		int n = 0;
		int count=0;
		char z = 0;
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		StringBuffer sb= new StringBuffer(s);
		char arr[]=s.toCharArray();
		for(char i='a';i<='z';i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==i)
				{
					
					count++;
					
				
					
					
				}
			}
			
		
		
		if(count!=0)
		{
			System.out.println(i+"= "+count);
		
			
			count=0;
		}
		}
		//System.out.println(n);
		System.out.println(sb);

	}

}
