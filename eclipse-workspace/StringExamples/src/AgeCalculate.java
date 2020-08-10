import java.util.Scanner;

public class AgeCalculate
{
	public static void main(String[] args) 
	{
		int dg=0;
		String dob="";
		String new_dob="";
		String month="";
		String f="";
		int age=0;
		String year[]= {"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the string");
		String s=sc.next();
		dg=(Character.getNumericValue(s.charAt(0)))*10;
		dob=Integer.toString((2017-dg));
		new_dob=dob.substring(0, 3);
		new_dob=new_dob+(s.charAt(1));
		age=(2017-Integer.parseInt(new_dob));
		for (int i = 0; i < year.length; i++)
		{
			month=""+s.charAt(2)+s.charAt(3)+s.charAt(4);
			if (month.equalsIgnoreCase(year[i])) 
			{
				f=year[i];
			}
			else
			{
				month=""+s.charAt(4)+s.charAt(2)+s.charAt(3);
				if (month.equalsIgnoreCase(year[i])) 
				{
					f=year[i];
				}
				else
				{
					month=""+s.charAt(3)+s.charAt(2)+s.charAt(4);
					if (month.equalsIgnoreCase(year[i])) 
					{
						f=year[i];
					}
					else
					{
						month=""+s.charAt(2)+s.charAt(4)+s.charAt(3);
						if (month.equalsIgnoreCase(year[i])) 
						{
							f=year[i];
						}
						else
						{
							month=""+s.charAt(3)+s.charAt(4)+s.charAt(2);
							if (month.equalsIgnoreCase(year[i])) 
							{
								f=year[i];
							}
							else
							{
								month=""+s.charAt(4)+s.charAt(3)+s.charAt(2);
								if (month.equalsIgnoreCase(year[i])) 
								{
									f=year[i];
								}
							}
						}
					}
				}
			}
			
		}
		System.out.println("Born in "+f+" "+new_dob);
		System.out.println("Age is "+age);
		
		
		
	}
}
//ip is 32aym...3 age in 30-40,2 is last digit of dob,may,current year 2017.
