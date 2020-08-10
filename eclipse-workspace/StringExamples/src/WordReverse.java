
public class WordReverse {
static String snew="";
	public static void main(String[] args)
	{
	String s= new String("hello pajji");
	String arr[]=s.split(" ");
	System.out.println("orignal string: "+s);
	for (int i = arr.length-1; i>=0; i--) 
	{
		snew=snew+" "+arr[i];
	}
	
		System.out.println("reverse string: "+snew);	
// now lets reverse chaacter
		StringBuffer sb= new StringBuffer(snew);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
// String s1= arr[0]; array of string to string
// String s2= arr[1]; array of string in 1st posn is placed in string s2