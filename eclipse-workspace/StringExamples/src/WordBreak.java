import java.util.Scanner;

public class WordBreak {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter string");
		String s=sc.nextLine();
		
		String arr[] =s.split(" ");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
