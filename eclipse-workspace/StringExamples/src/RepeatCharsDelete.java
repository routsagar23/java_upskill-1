
import java.util.Scanner;

public class RepeatCharsDelete 
{

	public static void main(String[] args)
	{
		String ss="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String s=sc.nextLine();
		//char arr[]=s.toCharArray();
 for (int i = 0; i < s.length()-1; i++) 
 {
	
	int j=i+1;
	 if(s.charAt(i)!=s.charAt(j))
	 {
		 ss=ss+s.charAt(i);
	 }
 
	
}
 System.out.println(ss);

		

	

		}
	}

		
		