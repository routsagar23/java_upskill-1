import java.util.Scanner;

abstract class Account
{
	abstract double calculateIntrest();
	double intrestrate;
	double amount;
}

class FDaccount extends Account
{
	double intrestrate;
	double amount;
	int days;
	int age;
	@Override
	double calculateIntrest()
	{
		Scanner sc1= new Scanner(System.in);
		System.out.println("enter amount");
		this.amount=sc1.nextDouble();
		System.out.println("enter age");
		this.age=sc1.nextInt();
		System.out.println("enter days between 7 to 365");
		this.days=sc1.nextInt();
		if(amount<=10000000)
		{
		if(age>=60)
		{
			if(days>=7&&days<=14)
			{
				intrestrate=(amount*0.05);
			}
			if(days>=15&&days<=45)
			{
				intrestrate=(amount*0.0525);
			}
			if(days>=46&&days<=60)
			{
				intrestrate=(amount*0.06);
			}
			if(days>=61&&days<=184)
			{
				intrestrate=(amount*0.075);
			}
			if(days>=185&&days<=365)
			{
				intrestrate=(amount*0.08);
			}
		
			
		}
		else
		{
			if(days>=7&&days<=14)
			{
				intrestrate=(amount*0.045);
			}
			if(days>=15&&days<=45)
			{
				intrestrate=(amount*0.0475);
			}
			if(days>=46&&days<=60)
			{
				intrestrate=(amount*0.055);
			}
			if(days>=61&&days<=184)
			{
				intrestrate=(amount*0.07);
			}
			if(days>=185&&days<=365)
			{
				intrestrate=(amount*0.075);
			}
		}
		}
		else
		{
			if(days>=7&&days<=14)
			{
				intrestrate=(amount*0.065);
			}
			if(days>=15&&days<=45)
			{
				intrestrate=(amount*0.0675);
			}
			if(days>=46&&days<=60)
			{
				intrestrate=(amount*0.08);
			}
			if(days>=61&&days<=184)
			{
				intrestrate=(amount*0.085);
			}
			if(days>=185&&days<=365)
			{
				intrestrate=(amount*0.01);
			}
			
		}
		return intrestrate;
	}
		
	
}
class SBaccount extends Account
{
	double intrestrate;
	double amount;
	String nationality;
	
	
	@Override
	double calculateIntrest()
	{
		Scanner sc2= new Scanner(System.in);
		System.out.println("enter amount");
		this.amount=sc2.nextDouble();
		System.out.println("enter nationality");
		this.nationality=sc2.next();
		
		
		if(nationality.equalsIgnoreCase("NORMAL"))
		{
			intrestrate=(amount*0.04);
		}
		else
		{
			intrestrate=(amount*0.06);
		}
		
		
		return intrestrate;
	}
	
}
class RDaccount extends Account
{
	double intrestrate;
	double amount;
	double monthlyamount;
	int months;
	int age;
	
	@Override
	double calculateIntrest() 
	{
		Scanner sc1= new Scanner(System.in);
		System.out.println("enter amount");
		this.amount=sc1.nextDouble();
		System.out.println("enter age");
		this.age=sc1.nextInt();
		System.out.println("enter months 6 or 9 or 12 or 15 or 18 or 21");
		this.months=sc1.nextInt();
		if(age>=60)
		{
			if(months==6)
			{
				intrestrate=(amount*0.08);
			}
			if(months==9)
			{
				intrestrate=(amount*0.0825);
			}
			if(months==12)
			{
				intrestrate=(amount*0.085);
			}
			if(months==15)
			{
				intrestrate=(amount*0.0875);
			}
			if(months==18)
			{
				intrestrate=(amount*0.09);
			}
			if(months==21)
			{
				intrestrate=(amount*0.0925);
			}
		}
		else
		{
			if(months==6)
			{
				intrestrate=(amount*0.075);
			}
			if(months==9)
			{
				intrestrate=(amount*0.0775);
			}
			if(months==12)
			{
				intrestrate=(amount*0.08);
			}
			if(months==15)
			{
				intrestrate=(amount*0.0825);
			}
			if(months==18)
			{
				intrestrate=(amount*0.085);
			}
			if(months==21)
			{
				intrestrate=(amount*0.0875);
			}
		}
		return intrestrate;
	}
	
}
public class IntrestCalculator {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int ch=0;
		System.out.println("enter choice");
		System.out.println("1.FD ACC 2. SB ACC 3.RD ACC 4.EXIT");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			{
				
				double result=new FDaccount().calculateIntrest();
				System.out.println("The intrest is "+result);
				break;
			}
		case 2:
			{
				double result=new SBaccount().calculateIntrest();
				System.out.println("The intrest is "+result);
				break;
			}
		case 3:
			{
				double result=new RDaccount().calculateIntrest();
				System.out.println("The intrest is "+result);
				break;
			}
		case 4:
			{
				System.out.println("exit successfully!");
				System.exit(0);
				
			}
		}
	}
}
		
	
		

	
