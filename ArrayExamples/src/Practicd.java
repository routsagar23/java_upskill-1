import java.util.Scanner;

public class Practicd {

	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int arr[]= new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter details");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("enter no u want to insert and at what position");
		int n=sc.nextInt();
		System.out.println("enter posn");
		int p=sc.nextInt();
		for (int i = p; i <=arr.length+1; i++) 
		{
			arr[p+1]=arr[p];

			
			
		}
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
		
		
	}
}

	