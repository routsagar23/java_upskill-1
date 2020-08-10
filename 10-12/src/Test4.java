import java.util.Scanner;

public class Test4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		int no=sc.nextInt();
		new Test4().methd(no);
		//System.out.println("the count is:"+x);
	}

	private void methd(int no) 
	{
		int flag=0;
	for(int i=2;i<no/2;i++)
	{
		if(no%i==0)
		{
			flag=1;
			break;
		}
		

	}
	if(flag==1)
	{
		System.out.println("not prime");
		
	}
	else 
	{
		System.out.println("prime");
	}
		
	}
}
