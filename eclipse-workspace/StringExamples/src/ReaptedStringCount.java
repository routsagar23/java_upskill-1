
public class ReaptedStringCount
{
	public static void main(String[] args) 
	{
		String s="ABCDFRSABCDJABGTDABCDEABCG";
		String ss="ABC";
		int count=0;
		
		for (int i = 0; i < s.length()-2; i++)
		{
			for (int j = 0; j < ss.length()-2; j++) 
			{
				if(s.charAt(i)==ss.charAt(j)&&s.charAt(i+1)==ss.charAt(j+1)&&s.charAt(i+2)==ss.charAt(j+2))
				{
					
							count++;
						
					
				}
			}
		}
		System.out.println(count);
	}
}
