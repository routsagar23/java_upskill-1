import java.util.Scanner;

public class Wordmixer {
	
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		
	String s1= sc.nextLine();
	String s2= sc.nextLine();
	char arr1[]=s1.toCharArray();
	char arr2[]=s2.toCharArray();
	char arr[]=new char[arr1.length+arr2.length];
	for (int i = 0,j=0; i < arr1.length; i++,j++)
	{
		arr[2*j]=arr1[i];
	
	}
	
	for (int k = 0,j=0; k < arr2.length; k++,j++)
	{
		arr[(2*j)+1]=arr2[k];
		
	}
System.out.println(arr);
	}

}
