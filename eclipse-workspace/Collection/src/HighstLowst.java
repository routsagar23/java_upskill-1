import java.util.Scanner;
import java.util.TreeSet;

public class HighstLowst {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		TreeSet<Integer> set=new TreeSet<Integer>();
		int arr[]=new int[5];
		System.out.println("enter elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int x:arr)
		{
			set.add(x);
		}
		
		System.out.println(set);
		System.out.println(set.descendingSet());
		int x1=set.first();
		int x2=set.last();
		System.out.println(x1);
		System.out.println(x2);
		
	}

}
