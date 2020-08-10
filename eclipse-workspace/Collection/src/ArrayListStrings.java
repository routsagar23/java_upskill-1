/*Create an ArrayList which will be able to store only Strings. Create a 
 * printAll method which will print all the elements using an Iterator.*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListStrings {
	static ArrayList <String> list=new ArrayList <String> ();
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		
		System.out.println("add strings");
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		list.add(sc.next());
		System.out.println(list);
		new ArrayListStrings().printAll();
		

	}

	 private void printAll()
	{
		 System.out.println("all the elemnts are");
		Iterator iter=list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
