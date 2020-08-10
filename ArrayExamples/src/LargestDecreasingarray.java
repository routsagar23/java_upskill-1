public class LargestDecreasingarray
{
	public static void main(String[] args)
	
	{
		int longg=0;
		int n=0;
		int g=0;
		int count=0;
		String s="";
		String ss="";
		int flag=0;
	
		
		

		int arr[]= {11,3,1,7,8,12,2,3,7};
	
		for (int i = 0; i <arr.length-1; i++)
		{
			if(arr[i]>arr[i+1])
			{
				count++;
				if(n==0)
				{
				n++;
				g=g+n;
				}
				flag=1;
				ss=ss+arr[i]+" ";
				if(i==arr.length-2)
				{
					ss=ss+arr[i+1]+" ";
				}
				
				
				
			}
			
			else
			{
				
				if(flag==1)// agar ye flag on hai matlb if true hone ke bad ye on h iska matlb mjhe do greater mil chuka h av third wla cahye...
				{
				ss=ss+arr[i]+" ";
				flag=0;
				}
				
			}
			
			if(count>=longg)
			{
				longg=count;
				s=ss;
			}
			if(flag==0)
				{
				n=0;
				count=0;
				ss="";
				}
			
			
				
		}
		
		System.out.println("longest decreasing sequence is:"+(longg+1));
		System.out.println("no of decreasing sequence is:"+g);
		System.out.println("the largest decreasing sequnce array is:"+s);
	}
}

