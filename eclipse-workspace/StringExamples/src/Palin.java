
public class Palin {
	static int i,j;

	public static void main(String[] args)
	{
String s= new String("kellos");
		
		
		char arr[]=s.toCharArray();
		char arr1[]= new char[arr.length];
		
		System.out.println(arr);
		

		
		
		for (i=arr.length-1,j=0;i>=0;i--,j++) 
		{
			arr1[j]=arr[i];
		}
		String ss= new String(arr1);
		System.out.println("after reverse "+ss);
		
		if(s.equalsIgnoreCase(ss))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		System.out.println(ss.length());
		System.out.println(s.length());
		
	}
	

}
