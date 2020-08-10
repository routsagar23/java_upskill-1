import java.util.Scanner;

public class roundup
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the no");
		double d=sc.nextDouble();
		System.out.println("the no is: "+d);
		double s=d*100; //upto 2 decimal point
		s=Math.round(s);
		System.out.println("the no "+d+" is rounded up to two decimal places :"+s/100); 
		
		double s1=d*1000;  // upto 3 decimal point
		double s2=Math.round(s1); //again round it up
		System.out.println("the no "+d+" is rounded up to three decimal places :"+s2/1000);
		
	}
}
