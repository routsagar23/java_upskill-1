import java.util.Scanner;

public class WordRepeatatn {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		String s1="";
		if(s.length()<2)
		{
			System.out.println(s);
		}
		else
		{
			System.out.println("enter no of times");
			int n=sc.nextInt();
			for(int i=0;i<2;i++)
			{
				s1=s1+s.charAt(i);
				
			}
			for(int j=0;j<n;j++)
			System.out.print(s1);
		}
		

	}

}
