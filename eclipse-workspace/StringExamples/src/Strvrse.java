
public class Strvrse {
static int i,j;

	public static void main(String[] args) 
	{
String s= new String("madam");
		
		
		char arr[]=s.toCharArray();
		char arr1[]= new char[arr.length];
		
		System.out.println(arr);
		

	
		
		for (i=arr.length-1,j=0;i>=0;i--,j++) 
		{
			arr1[j]=arr[i];
		}
		String ss= new String(arr1);
		System.out.println("after reverse "+ss);
		
		for (int i = 0; i < arr.length; i++) 
		{
			
		for (int j = 0; j < arr1.length; j++) 
		{
			
		if(arr[i]==arr1[j])
		{
			System.out.println("pli");
		}
		else
		{
			System.out.println("no");
		}
		}
		}

	}

	

}
