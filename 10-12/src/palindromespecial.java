
public class palindromespecial
{
	public static void main(String[] args)
	{
		for (int i = 1; i <1000; i++) 
		{
			if(i==reverse(i))
			{
				System.out.println(i);
			}
		}
	}
	public static int reverse(int i) {
		int n=i;
		int rem;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		return sum;
	}
}

