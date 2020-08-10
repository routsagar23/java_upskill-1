import java.util.Scanner;

public class WordCount {
	static int n;
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enter string");
		String s= sc.nextLine();
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(!arr[i].isEmpty())
			{
			System.out.println(arr[i]);
			n++;
			}
			
		}
		
		System.out.println("word count is::"+n);
	}

}
