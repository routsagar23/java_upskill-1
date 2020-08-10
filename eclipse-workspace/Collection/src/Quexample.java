import java.util.*;

public class Quexample {

	public static void main(String[] args)
	{
		Queue <Integer> q= new LinkedList <Integer>()  ;
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q);
		q.remove();
		System.out.println(q);
	
	Deque <Character> dq= new LinkedList<Character>();
	dq.add('a');
	dq.addFirst('b');
	dq.addLast('c');
	dq.add('e');
	System.out.println(dq);
	dq.removeLast();
	dq.removeFirst();
	
	
	

	}

}
