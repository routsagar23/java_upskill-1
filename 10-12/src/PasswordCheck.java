import java.util.*;
public class PasswordCheck {

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter password");
		String pwd=sc.nextLine();
		String result=new PasswordCheck().CheckPass(pwd);
		System.out.println("Your password is: "+result);
	}

	 String CheckPass(String s) 
	 {
		 String output="";int c=0, d=0, u=0,l=0,k=0;
		 char arr[]=s.toCharArray();
		 if(arr.length==8)
		 {
		 for(int i=0;i<arr.length;i++)
		 {
		if(Character.isDigit(arr[i]))
		{
			if(d==0)
			{
				
				d=1;
			}
			
		}
		if(Character.isUpperCase(arr[i]))
		{
			if(u==0)
			{
				
				u=1;
			}
			
		}
		if(Character.isLowerCase(arr[i]))
		{
			if(l==0)
			{
				
				l=1;
			}
			
		}
		if(arr[i]=='!'||arr[i]=='@'||arr[i]=='#'||arr[i]=='$'||arr[i]=='&'||arr[i]=='*')
		{
			if(k==0)
			{
				k=1;
			}
		}

		
		
		
		if(d==1&&k==1&&u==1&&l==1)
		{
			output="Strong";
		}
		else
		{
			if(d==1&&k==1||u==1&&l==1&&k==1||u==1&&l==1&&d==1)
			{
				output="Medium";
			}
			else		
				
				if(d==1||k==1||(u==1&&l==1))
			{
				output="Weak";
			}
		}
		
		
			 
		 }
		 }
		 else
		 {
			 output="Too Short";
		 }
		 
		
		
		return output;
	}

}

