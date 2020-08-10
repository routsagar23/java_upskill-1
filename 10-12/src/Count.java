import java.util.*;
public class Count {

	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter string");
	String s= sc.nextLine();
	int word=0;
	for(int i=0;i<s.length();i++)
	{
		System.out.println("\n"+s.charAt(i));
		word++;
		
	}
	System.out.println("no of word is:"+word);

}
}
