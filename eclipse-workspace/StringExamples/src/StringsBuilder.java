
public class StringsBuilder {

	public static void main(String[] args)
	{
	StringBuilder s= new StringBuilder("heyaa")	;
	System.out.println(s.length());
	System.out.println(s.append(" hello"));
	System.out.println(s.insert(0, "india "));
	System.out.println(s.replace(0, 5, "java"));
	System.out.println(s.delete(5, 10));
	System.out.println(s.delete(4, 10));
	System.out.println(s.append(" is ispmle"));
	
	
}
}