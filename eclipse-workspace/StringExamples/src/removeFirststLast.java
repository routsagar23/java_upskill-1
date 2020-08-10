import java.util.Scanner;

public class removeFirststLast {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		if(s.length()>2)
		{
			for (int i = 1; i < s.length()-1; i++) 
			{
				System.out.print(s.charAt(i));
				
			}
		}
		else
		{
			System.out.println(s);
		}

	}

}
