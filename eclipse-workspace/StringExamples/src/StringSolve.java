import java.util.Scanner;

public class StringSolve
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		int count=0;
		int large=0;
		String arr[]=s.split(" ");
		if(arr[0].length()!=arr[1].length()) //for two unequal no of charactr in strings
		{
		for (int i = 0; i < arr.length-1; i++) 
		{
			for (int j = 0; j < arr[i].length()-1; j++) 
			{
				if(arr[i].charAt(j)!='a'&&arr[i].charAt(j)!='e'&&arr[i].charAt(j)!='i'&&arr[i].charAt(j)!='o'&&arr[i].charAt(j)!='u')
				{
					if(arr[0].charAt(j)==arr[1].charAt(j))
					{
						count++;
						if(large<count)
						{
							large=count;
						}
						System.out.println(arr[0].charAt(j));
						System.out.println(arr[1].charAt(j));
					}
				}
				
			}
		}
		}
		else
		{
			
			for (int i = 0; i < arr.length-1; i++) 
			{
				for (int j = 0; j < arr[i].length(); j++) 
				{
					if(arr[i].charAt(j)!='a'&&arr[i].charAt(j)!='e'&&arr[i].charAt(j)!='i'&&arr[i].charAt(j)!='o'&&arr[i].charAt(j)!='u')
					{
						if(arr[0].charAt(j)==arr[1].charAt(j))
						{
							count++;
							if(large<count)
							{
								large=count;
							}
							System.out.println(arr[0].charAt(j));
							System.out.println(arr[1].charAt(j));
						}
					}
					
				}
			
			}
		}
		System.out.println(large);
	}
}
//ip is singh king....singhiighgg kingiighgg