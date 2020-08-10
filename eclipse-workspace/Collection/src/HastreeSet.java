import java.util.*;
public class HastreeSet {

	public static void main(String[] args) 
	{
	int arr[]= {3,11,44,7,22,11,44,7,22,1,3};
	LinkedList <Character> list= new LinkedList <Character>();
	list.add('a');
	list.add('c');
	list.add('e');
	list.add('a');
	list.add('c');
	list.add('e');
     HashSet <Integer> hs= new HashSet<Integer>();
     TreeSet <Character> hs1= new TreeSet<Character>();
     
     for(int a:arr)
    	 hs.add(a);
     
     for(Character c:list)
    	 hs1.add('a') ;
     hs1.add('c');
     hs1.add('a') ;
     hs1.add('c');
     hs1.add('b');
     
     System.out.println(hs);
     System.out.println(hs1);
     
     
	}

}
