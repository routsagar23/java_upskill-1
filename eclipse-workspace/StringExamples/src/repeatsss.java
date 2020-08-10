import java.util.Scanner;

public class repeatsss {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		System.out.println("enter no of times");
		int n=sc.nextInt();
		StringBuffer sb= new StringBuffer(s);
		sb.append(s1);
		for (int i = 0; i < n;i++)
		{
			System.out.print(sb);
		}
		

	}

}
