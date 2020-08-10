
public class Strff 
{
	

	public static void main(String[] args) 
	{
		
	int count=0;
 String s="satgar";


String k=s.substring(3,6);
char arr[]=k.toCharArray();
System.out.println(k);
String z=s.substring(0,3);
char brr[]=z.toCharArray();;
System.out.println(z);

for (int i = 0; i < k.length(); i++)
{
	for (int j = 0; j < z.length(); j++) 
	{
		if(k.charAt(i)==z.charAt(j))
		{
			count++;
		}
		else
		{
			arr[i]=brr[i];
		}
	}
}
for (int i = 0; i < arr.length; i++) 
{
	System.out.println(arr[i]);
	
}
System.out.println(count);


	
	}
	
	
	//change the charcters if @nd half os=f string not equal to 1st
 
}
