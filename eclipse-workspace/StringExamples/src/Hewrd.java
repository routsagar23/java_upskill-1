


import java.util.Scanner;

public class Hewrd {

	public static void main(String[] args)throws Exception
	{
		
		int count=0;
		String n = "";
		int no = 0;
		String zk="";
		String kk="";
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
	
		
	
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]==s.charAt(i)&&arr[j]!=' ')
				{
				
					count++;
					zk=""+arr[j];
						
				}
			}
			
			//System.out.println(s.charAt(i)+"= "+count);
				
				if(count==1)
				{
					kk=kk+zk;
				}
			
				count=0;
				
				
			}
		
		
		/*to find the digits*/
		
		for (int i = 0; i < s.length(); i++) 
		{
			for (int j = 0; j < kk.length(); j++)
			{
				if(s.charAt(i)==' ')
				{
					
					n=n+no;
					no=0;
					break;// if no break then it will not check another condition so we need to come out of the loop
					
					
					
				}
				if(s.charAt(i)==kk.charAt(j))
				{
				
					no++;
				}
				
			}
			
		}
		n=n+no;
		
			System.out.println(kk+":"+n);
			
			

	}

}
	/*ip is hello world, ops is hewrd:23
	 * 2nd ip is you are your maker op is mk:0002*/
	
