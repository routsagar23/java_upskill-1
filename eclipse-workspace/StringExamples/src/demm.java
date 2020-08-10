
public class demm 
{
public static void main(String[] args)
{
	String s="12345";
	char arr[]=new char[s.length()-1];
	for (int i = s.length()-1,j=0; i >0; i--,j++) 
	{
		arr[j]=s.charAt(i);
	}
	
	String ss=new String(arr);
	StringBuffer sb= new StringBuffer(ss);
	sb.append(s.charAt(0));
	System.out.println("output is "+sb);
	
	
}
}
