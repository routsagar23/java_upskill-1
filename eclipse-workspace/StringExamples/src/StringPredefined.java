
public class StringPredefined {

	public static void main(String[] args) 
	{
		
String s= new String("madam");
StringBuffer sb= new StringBuffer(s);
sb.reverse();
String s1=new String(sb);
if(s.equals(s1))
{
	System.out.println("palindrome");
}
else
{
	System.out.println("not");
}
	}

}
