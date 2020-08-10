
public class AlphaNumericSum
{
	
	
	public static void main(String[] args) 
	{
		int product=0;
		int previous_value=0;
		int position=0;
		String s="12a23c45z";
		char arr[]=s.toCharArray();
		
		for (int i = 0; i < arr.length; i++)
		{
			if(Character.isDigit(arr[i])&&Character.isDigit(arr[i+1]))
			{
				previous_value=Character.getNumericValue(arr[i+1]);
				position=i+3;
				product=product+previous_value+position+(Character.getNumericValue(arr[i])*Character.getNumericValue(arr[i+1]));
				
				
				
				
			}
		}
		System.out.println("final sum is:"+product);
	}
}
//mettl5