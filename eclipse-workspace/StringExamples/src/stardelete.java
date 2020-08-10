import java.util.Scanner;

public class stardelete {

	public static void main(String[] args)
	{
		int c=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		for (int i = 0; i < s.length(); i++)
		{
			if(c==0)
			{
			if(s.charAt(i)=='*')
			{
				
				
				if(s.charAt(i+1)=='*')
				{
					sb.delete(i+1, i+2);
					
				}
				sb.delete(i-1,i+2);
				
				System.out.println(sb);
				c=1;
				
				
				
			}
			}
			
			
		}

	}

}
//input is::: ab*cd & 2nd testcase is ab**cd output will be same in both case
