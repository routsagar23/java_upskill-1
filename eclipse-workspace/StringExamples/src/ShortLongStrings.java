import java.util.Scanner;

public class ShortLongStrings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		StringBuffer sb= new StringBuffer(s);
		StringBuffer sb1= new StringBuffer(s1);
		if(s.length()>s1.length())
		{
			sb1.append(sb);
			sb1.append(s1);
			System.out.println(sb1);
		}
		else
		{
			sb.append(sb1);
			sb.append(s);
			System.out.println(sb);
			
		}

	}

}
