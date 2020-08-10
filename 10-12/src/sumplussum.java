import java.util.Scanner;

public class sumplussum
{
	public static void main(String[] args)
	{
		new sumplussum().add();
	}

	private void add()
	{
		Scanner sc= new Scanner(System.in);
		int sum=0;
		int dg=0;
		int finalsum=0;
	String n=sc.next();
	char arr[]=n.toCharArray();
	
	for (int i = 0; i < arr.length; i++)
	{
		sum=sum+Character.getNumericValue(arr[i]);
		
	}
	if(sum>9)
	{
		while(sum>0)
		{
			dg=sum%10;
			finalsum=finalsum+dg;
			sum=sum/10;
		}
		
		System.out.println(finalsum);
	}
	
	
	System.out.println(sum);
			
		
	}
}
