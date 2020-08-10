import java.util.Scanner;

public class EncodedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter array elements");
		int arr[]=new int[6];
		int brr[]=new int[6];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		//arr[i]=arr[i+1]-arr[i]
		for (int i = 0; i < arr.length-1; i++)
		{
			
			brr[i]=arr[i+1]-arr[i];
			brr[brr.length-1]=arr[arr.length-1];
			
			
		}
		for (int j = 0; j < brr.length; j++) 
		{
			System.out.print(" "+brr[j]);
			
		}
	}
}
/*
 op is 2

5
1
7
9
3
*/