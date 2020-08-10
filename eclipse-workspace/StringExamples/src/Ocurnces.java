import java.util.Scanner;

public class Ocurnces {

	public static void main(String[] args)
	{
		int n = 0;
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
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
		
			/*if(count>=2)
			{
				System.out.println("not unique");
				
			}*/
			count=0;
		}
		}
		//System.out.println(n);
		
		

	}

}
