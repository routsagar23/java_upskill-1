import java.util.Scanner;

public class CharacterBreak {
static Scanner sc= new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("enter string");
		String s=sc.nextLine();
		
		String arr[] =s.split(" ");//not needed
		for (int i = 0; i <s.length(); i++)
		{
			System.out.println(s.charAt(i));
		}
		
		

	}

}
