import java.util.Scanner;

public class primeIndex
{
	public static void main(String[] args)
	{
		int sum1=0;
		int sum2=0;
		int arr_high2=0;
		int brr_high2=0;
		int flag=0;
		
		Scanner sc= new Scanner(System.in);
		
		int arr[]= {50,12,5,16,7,3,18,23,13,14,17};
		int brr[]= {23,97,12,8,4,18,77,27,28,34,39};
		
		

		
	    for (int i = 2; i <arr.length; i++)
	    {
			
		  flag=0;
	    for(int k=2;k<i;k++)
	    {
	        if(i%k==0)
	        {
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    {
	    	//System.out.println(arr[i]);
	       sum1=sum1+arr[i];
	    }
	    }
		
	    for (int i = 2; i <brr.length; i++)
	    {
			
		  flag=0;
	    for(int k=2;k<i;k++)
	    {
	        if(i%k==0)
	        {
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    {
	    	//System.out.println(brr[i]);
	       sum2=sum2+brr[i];
	    }
	    }
		
	int large1=arr[0];
	
	
		for (int i = 1; i < arr.length; i++) 
		{
			
			if(large1<arr[i])
			{
				large1=arr[i];
				arr[i]=arr[0];
				arr[0]=large1;
				
				
				
			}
		}
		
	arr_high2=arr[1];
	for (int i = 2; i < brr.length; i++) 
	{
		if(arr_high2<arr[i])
		{
		
			arr_high2=arr[i];
		}
	}
	
	int large2=brr[0];
	
	
		for (int i = 1; i < brr.length; i++) 
		{
			
			if(large2<brr[i])
			{
				large2=brr[i];
				brr[i]=brr[0];
				brr[0]=large1;
				
				
				
			}
		}
		
	brr_high2=arr[1];
	for (int i = 2; i < brr.length; i++) 
	{
		if(brr_high2<brr[i])
		{
		
			brr_high2=brr[i];
		}
	}
	
	int result=(sum1-sum2)*(arr_high2-brr_high2);
	System.out.println(result);
	
		
		
	} /*mettl9*/
}
