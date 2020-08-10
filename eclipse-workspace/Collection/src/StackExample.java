import java.util.*;
public class StackExample {

	public static void main(String[] args)
	{
	Stack st= new Stack();
	st.push(20);
	st.push(30);
	st.push(40);
	System.out.println(st);
	st.push("raja");
	st.push('a');
	System.out.println(st);
	st.pop();
	System.out.println(st);
	System.out.println(st.empty());
	System.out.println(st.peek());
	
	
	
		
		

	}

}
