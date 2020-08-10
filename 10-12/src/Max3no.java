import java.util.*;

public class Max3no {

	static int arr[];
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter no of arrays");
		int no=sc.nextInt();
		 arr= new int[no];
		new Max3no().input();
		new Max3no().maximum();
		

	}

	private void input() 
	{
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i]=sc.nextInt();
			
			
		}
		
		
	}

	private void maximum()
	{
		int max=arr[0];
		int temp=0,temp1=0;
		for (int i = 1; i <arr.length; i++) 
		{
		  if(max<arr[i])
		  {
			  max=arr[i];
			  temp=i;
			 
		  }
			
		}
		System.out.println("the max no is: "+max);
		arr[temp]=arr[0];
		arr[0]=max;
		
		int max1=arr[1];
		for (int i = 2; i < arr.length; i++) 
		{
			if(max1<arr[i])
			  {
				  max1=arr[i];
				  temp1=i;
				  
			  }
			
		}
		System.out.println("the 2nd highst is:"+max1);
		arr[temp1]=arr[1];
		arr[1]=max1;
		
		
		
		
	}

}
