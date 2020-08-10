import java.util.*;
public class EasyNumber
{
	
	public static void main(String[] args)throws Exception
	{
		int c=0;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter no");
		String no=sc.next();

		System.out.print("Number is :"+no);
		char arr[]=no.toCharArray();
		
		for (int i =5; i<arr.length-1; i++)
		{
			if(arr[i]==arr[i+1]+1)
			{
				c++;
			}
			
		}
		if(c>=4)
			System.out.println("\t"+"easy to learn");
		else
			System.out.println("\t"+"hard");

		
		

		

	
}
}