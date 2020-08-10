import java.util.Arrays;
import java.util.Scanner;

public class OTP
{
	String solution()
	{
		String OTP="";
		int arr[]=new int[4];
		int largest=0;
		int small=0;
		int large=0;
		largest=arr[0];
		large=arr[0];
		

		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter series of no in one line");
		System.out.println("Dont press enter until you're finished");
		String s1=sc.nextLine();
		String ss1[]=s1.split(" ");
		
//for input 1 of OTP	
	for (int k = 0; k < ss1.length; k++) 
	{
		
		for (int i = 0; i <ss1[k].length()-1; i++) 
			
		{
				for (int j = 0; j < arr.length; j++) 
				{
					
		arr[j]=(Character.getNumericValue(ss1[k].charAt(i))*10)+Character.getNumericValue((ss1[k].charAt(i+1)));
				
				if(arr[j]>largest) //logic to find largest two digit no
				{
					largest=arr[j];
					
				}
				
				
				
		
				}
	
				
		}
			
	}
//for input 2 of OTP
	for (int k = 0; k < ss1.length; k++) 
	{
		small=arr[0];
		
		for (int i = 0; i <ss1[k].length(); i++) 
			
		{
				for (int j = 0; j < arr.length; j++) 
				{
					arr[j]=(Character.getNumericValue(ss1[k].charAt(i))); //split string into single digit
					
					
					if(arr[j]>large) //logic to find largest single digit no
					{
					large=arr[i];
					
					}
					
					if(arr[j]<small)//logic to find smallest single digit no
					{
						small=arr[i];
					}
					
				}
		}
	}
	OTP=OTP+largest+(large+small);
	
			System.out.println("Largest two digit no:"+largest);
			System.out.println("Largest one digit no:"+large);
			System.out.println("smallest one digit no:"+small);	
			
 System.out.println("-----------------------------------------------");
 
 return OTP;
	
	} //end of function
	
	public static void main(String[] args)
	{
		String otp=new OTP().solution();
		System.out.println("OTP IS:"+otp);
		
	}
}

/*op is Enter series of no in one line
Dont press enter until you're finished
123 567 981 2367
Largest two digit no:98
Largest one digit no:9
smallest one digit no:1
-----------------------------------------------
OTP IS:9810*/