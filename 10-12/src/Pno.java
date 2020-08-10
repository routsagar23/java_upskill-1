import java.util.HashSet;

public class Pno {

static int n=10;
HashSet <Integer> set= new <Integer> HashSet();
 static int arr[]= new int[100];
	public static void main(String[] args) 
	{
		System.out.println("value is"+arr.length);
		Pno p = new Pno();
		p.primeno();


	}

	private void primeno()
	{
		System.out.println("start");
		for(int n=10;n<100;n++)
		{
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0)
				{
					for (int j = 0; j <arr.length; j++)
					{
						arr[j]=n;
					
						for(int x:arr)
						{
							set.add(x);
						}
						
					} 
					
					
				}
				
			}
		}
		System.out.println(set);
	}
}
		
			
			

	

