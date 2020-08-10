import java.util.Scanner;

public class StringDiffChar
{
	public static void main(String[] args)
	{
		String arr="";
		
		Scanner sc= new Scanner(System.in);
		
		
			
		
		System.out.println("enter string");
		String s1=sc.nextLine();
		String ss1[]=s1.split(" ");
		
	for (int k = 0; k < ss1.length; k++) 
	{
		
		int sum=0;
		int z=0;
		if((ss1[k].length())%2!=0) //for odd no of letters in a word
		{
		for (int i = 0,j=ss1[k].length()-1; i <=ss1[k].length()/2; i++,j--) 
		{
			
				if(i!=j)	
				{
					sum=sum+(ss1[k].charAt(i)-ss1[k].charAt(j));
					
				}
				if(i==j) //when it reaches the middle letter
				{
					
				z=Character.getNumericValue((ss1[k].charAt(i)));
				sum =sum+(z-9);
				
				
				
				}
					
			}
		}
		else //for even no of letters in a word
		{
			for (int i = 0,j=ss1[k].length()-1; i <ss1[k].length()/2; i++,j--) 
			{
				sum=sum+(ss1[k].charAt(i)-ss1[k].charAt(j));
				//System.out.println(ss1[k].charAt(i)+""+ss1[k].charAt(j));
					
					
				
			}
		}
		
				
		arr=arr+sum;
		System.out.println(sum);
		
	}
	
		System.out.println("final string is:"+arr);
	}
}
	
//input is :world wide web 
