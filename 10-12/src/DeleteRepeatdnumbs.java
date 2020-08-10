import java.util.*;
class solun
{

	public void solve(String n)
	{
		int count=1;
		
		
		char arr[]=n.toCharArray();
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					
					count++;
				}
			}
		}
		
		if(count>1&&count<arr.length)
		{
		System.out.println("The solution is:"+(arr.length-count));
		}
		if(count>=arr.length)
		{
			System.out.println(count);
			System.out.println("The solution is:"+0);
		}
		if(count==1)
		{
			System.out.println("The solution is:"+arr.length);
		}
		
	}
	
}
public class DeleteRepeatdnumbs
{
	
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter no");
	String n=sc.next();
	solun s= new solun();
	s.solve(n);
	
}
}
