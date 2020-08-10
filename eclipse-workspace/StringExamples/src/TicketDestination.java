import java.util.Scanner;

public class TicketDestination 
{
	public static void main(String[] args)
	{   
        int xx = 81; 
        char c = 'A'; 
         
        c = (char) xx; 
        System.out.println("i = " +xx + " c = " + c);     
           
		int count=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter no of elemts");
		int n=sc.nextInt();
		String arr[] = new String[n];
		System.out.println("enter elements");
		for (int i = 0; i <arr.length; i++)
		{
			arr[i]=sc.next();
		}
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
			if(arr[i]==arr[j])
			{
				System.out.println(arr[i]);
				count++;
			}
				
			}
		}
		System.out.println(count);
		
		
	}

}
/*
 AB
 PQR
 AAA
 XYZ
 SFO
 AAA
 XYZ
 AB
  */
 