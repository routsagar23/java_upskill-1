import java.util.*;
public class Palindrome
{
	int dg=0,r=0,c=0;

int number(int no)
{
	
		if(no==0)
		{
		
			c=0;
		}
		else
		{
			dg=no%10;
		
		r=r*10+dg;
		c=number(no/10);
	}

		return r;


}
	public static void main(String[] args)
	 {
	 	Scanner sc= new Scanner(System.in);
	 	System.out.println("enter number");
	 	int no=sc.nextInt();
	 	
	 	
	 	int result=new Palindrome().number(no);
	 	System.out.println(result);
	 	
	 	if(result==no)
	 		System.out.println("palindrome");
	 	else
	 		System.out.println("n0t palindrome");
	 	
	 	

		
	}
}