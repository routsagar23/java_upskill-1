import java.util.Scanner;

public class conca2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two strings");
		String s=sc.nextLine();
		String s1=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		
				if(s.charAt(s.length()-1)==s1.charAt(0))
				{
					sb.delete(sb.length()-1, sb.length());
					sb.append(s1);
					System.out.println(sb);
					
				}
				else
				{
					sb.append(s1);
					System.out.println(sb);
					
				}
			
				
		
		
		
		
		

	}

}
