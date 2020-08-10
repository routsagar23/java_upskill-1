

public class Conca {
	static int i,j,k;

	public static void main(String[] args)throws Exception
	{
		
String s=new String("madam");
String s1= new String("please");
System.out.println(s);
System.out.println(s1);

 char arr[]=s.toCharArray();
char arr1[]= s1.toCharArray();
char arr2[]=new char[arr.length+arr1.length];
for ( i = 0,k=0; i < arr.length; i++,k++)
{

	arr2[k]= arr[i];

}
for (int i = 0,k=arr.length; i < arr1.length; i++,k++)
{
	arr2[k]=arr1[i];
}
System.out.println(arr2);
String s2=new String(arr2);
System.out.println(s2);




	}
}