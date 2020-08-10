
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
  public abstract int divisorSum(int n);
}
class Calculator implements AdvancedArithmetic
{
int sum;
	@Override
	public int divisorSum(int n)
	{
	
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				this.sum=this.sum+i;
				
			}
		}
		return sum;
	}
	
}
public class Calci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
