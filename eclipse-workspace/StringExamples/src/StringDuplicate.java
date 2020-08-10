
 
import java.util.*;
class StringDuplicate
{
	StringDuplicate()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string");
	String s= sc.nextLine();
	System.out.println("orignal string is"+s);

	char arr[]=s.toCharArray();
	HashSet <Character> set= new HashSet <Character> ();
	for (int i = 0; i < arr.length; i++) {
		
	
set.add(arr[i]);
	}
	System.out.println(set);
}

public static void main(String[] args) {
	new StringDuplicate();
}
}
