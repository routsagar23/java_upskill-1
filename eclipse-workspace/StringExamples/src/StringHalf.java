import java.util.Scanner;

public class StringHalf {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		if(s.length()%2==0)
		{
			for (int i = 0; i < s.length()/2; i++)
			{
				System.out.print(s.charAt(i));
			}
		}
		else
		{
			System.out.println("null");
		}

	}

}
//input is catdog
