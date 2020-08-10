import java.util.Arrays;
import java.util.Scanner;

public class Array1D {
static Scanner sc= new Scanner(System.in);
private static void input(int arrr[])
{
	System.out.println("enter the array details");
	for (int i = 0; i < arrr.length; i++) 
	{
		arrr[i]=sc.nextInt();
	}
	
}
private static void display(int arrr[]) 
{
	System.out.println("the array is:");
	for (int i = 0; i < arrr.length; i++) 
	{
		System.out.println(arrr[i]+"\t");
	}
	
	System.out.println();
}
	public static void main(String[] args) 
	{
		System.out.println("enter the size of array");
	 int size=sc.nextInt();
	int arr[]= new int[size];
	input(arr);
	display(arr);
	Arrays.sort(arr, 0, 5);;
	display(arr);
	System.out.println("found at"+Arrays.binarySearch(arr, 3));
	int brr[]=Arrays.copyOf(arr,2);
	display(brr);
	int crr[]=Arrays.copyOfRange(arr, 1, 4);
	display(crr);
	
	System.out.println(Arrays.equals(arr, brr));
	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.hashCode(arr));
	Arrays.fill(arr,33);
	
	display(arr);
	
	

	}
	
	

}
