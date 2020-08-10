import java.util.*;
import java.util.Collections;
public class LinkedLst {

	public static void main(String[] args) 
	{
		LinkedList<Integer> list= new LinkedList<Integer>();
		LinkedList<Integer> list1= new LinkedList<Integer>();
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("1-Insert at begin 2- Inset at end  3- insert at any posn");
			System.out.println("4-dekete at begin 5- delete at end 6- delete at any posn");
			System.out.println("7-display list    8- sort          9- search");
			System.out.println("10-merge          11- reverse      12- countlist");
			System.out.println("..................enter your choice 0-exit-------------------");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 0: System.exit(0);
			default: System.out.println("invalid choice bro");
			break;
			case 1: 
				System.out.println("enter the element");
				list.addFirst(sc.nextInt());
				break;
			case 2:
				System.out.println("enter the element");
				list.addLast(sc.nextInt());
				break;
			case 3:
				System.out.println("enter posn");
				list.add(sc.nextInt(),sc.nextInt());
				break;
				
			case 4: list.removeFirst();
			break;
			case 5: list.removeLast();
			break;
			case 6: System.out.println("enter posn");
			list.remove(sc.nextInt());
			break;
			case 7: 
			System.out.println(list);
			break;
			case 8:Collections.sort(list);
			System.out.println(list);
			break;
			case 9: System.out.println("enter element");
			int element=sc.nextInt();
			System.out.println(list.contains(element));
			System.out.println(list.indexOf(element));
			System.out.println(list.lastIndexOf(element));
			
				break;
			case 10: list1.add(11);
			list1.add(11);
			list.addAll(list1);
			System.out.println(list);
			break;
			
			case 11: Collections.reverse(list);
			System.out.println(list);
			break;
			
			case 12: System.out.println("no of element:"+list.size());
			break;
		}

	}

}
}
