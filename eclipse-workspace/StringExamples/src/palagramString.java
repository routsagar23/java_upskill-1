import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class palagramString
{
	public static void main(String[] args) {
		int n=0;
	TreeSet<Character>set=new TreeSet<Character>();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.nextLine();
	
	
	char arr[]=s.toCharArray();
	char brr[]= new char[arr.length+1];
for (int i = 0,j=0; i < arr.length;j++, i++)
{
	
		if(arr[i]!=' ')
		{
		brr[j]=arr[i];
		}
		
	
	
}
for (int i = 0; i < brr.length; i++) {
	System.out.print(brr[i]);
}
	
	
	
	
	}
	

}
