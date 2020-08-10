import java.util.Scanner;

public class Stringadd
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the 1st no");
		String s1=sc.nextLine();
		System.out.println("enter the 2nd no");
		String s2=sc.nextLine();
		int s3=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(s3);
		
	}

}
