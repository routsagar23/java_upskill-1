import java.util.*;
public class uprString {
	
	
		static Scanner sc= new Scanner(System.in);
		public static void main(String[] args)
		 {
			System.out.println("enetr string");
			String s=sc.nextLine();
	      char arr[]=s.toCharArray();
	      
	      for (int i = 0; i < arr.length; i++) 
	      {
			if(arr[i]>=65&& arr[i]<=90)
			{
				arr[i]= (char) ( arr[i]+32);
			}
			
			else
			{
				arr[i]=(char) (arr[i]-32);
			}
		  }
	   System.out.println(arr);
	
			
		
			
	}

}
