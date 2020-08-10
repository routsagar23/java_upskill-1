import java.util.Scanner;

public class StringCommonFormatio 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	String s1="I love india my friend";
	String s2="he Love you buddy friend";

	String arr1[]=s1.split(" ");
	String arr2[]=s2.split(" ");
	
	
	String x = "";
	String y ="";
	
	for (int i = 0; i < arr1.length; i++)
	{
		for (int j = 0; j < arr2.length; j++) 
		{
			if(arr1[i].equalsIgnoreCase(arr2[j]))
			{
				
				x=arr1[i];
				y=y+x+" ";
				
				
				
				
			}
			
		}
	}
	
	System.out.println(y.toUpperCase());
	
}
}
