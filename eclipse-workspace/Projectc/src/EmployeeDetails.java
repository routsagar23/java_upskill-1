import java.util.Scanner;

public class EmployeeDetails {
	
	int empid;
	String name;
	String dept;
	String designation;
	double HRA;
	double IT;
	double basic;
	double DA;
	static double salary;
	
	public String toString() {
	    return "id: " + this.empid +  "  Name: " + this.name+  "  dept: " + this.dept+  "  BASIC: " + this.basic+  "  HRA: " + this.HRA+  "  IT: " + this.IT+ this.HRA+"  DA: " + this.DA+  "  Designation: " + this.designation+  "  Salary: " + this.salary;
	}

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		EmployeeDetails emp[]=new EmployeeDetails[3];
		EmployeeDetails empn[]=new EmployeeDetails[2];
		EmployeeDetails empf[]=new EmployeeDetails[3];
		System.out.println("enter details of emplyee table 1 ");
		for (int i = 0; i < emp.length; i++) {
			
			emp[i]=new EmployeeDetails();
			System.out.println("enter id name of emplyee "+i);
			emp[i].empid=sc.nextInt();
			emp[i].name=sc.nextLine();
			System.out.println("enter dept of emplyee"+i);
			emp[i].dept=sc.next();
			System.out.println("enter basic HRA IT of emplyee of"+i);
			emp[i].basic=sc.nextDouble();
			emp[i].HRA=sc.nextDouble();
			emp[i].IT=sc.nextDouble();
			
	}
		
		
		System.out.println("enter designation details for table 2 ");
		for (int i = 0; i < empn.length; i++)
		{
			empn[i]=new EmployeeDetails();
			System.out.println("enter dept of emplyee ");
			empn[i].dept=sc.next();
			System.out.println("enter designation of emplyee ");
			empn[i].designation=sc.next();
			System.out.println("enter DA of emplyee ");
			empn[i].DA=sc.nextDouble();
			
		}
		
		System.out.println("emplyee table 1 is");
		System.out.println("----------------------------------------------------------");
		for (int i = 0; i < emp.length; i++) 
		{
			System.out.println("id: "+emp[i].empid+" name: "+emp[i].name+" dept: "+emp[i].dept+" BASIC: "+emp[i].basic+" HRA: "+emp[i].HRA+" IT: "+emp[i].IT);
		}
		System.out.println("..........................................................");
		System.out.println("emplyee table 2 is");
		System.out.println("----------------------------------------------------------");
		for (int i = 0; i < empn.length; i++)
		{
			System.out.println("dept: "+empn[i].dept+" designation: "+empn[i].designation+"DA: "+empn[i].DA);
		
		}
		System.out.println("----------------------------------------------------------");
		
		
		/*System.out.println("calculation in proccess");
		for (int i = 0; i < emp.length; i++) {
			
		for (int j = 0; j < empn.length; j++)
		{
			if(emp[i].dept.equalsIgnoreCase(empn[j].dept))
			{
				salary=(emp[i].basic+empn[j].DA+emp[i].HRA)-emp[i].IT;
			}
			
		}
		}
		
		System.out.println(".............................................................");
		System.out.println("emplyee table new is");
		for (int i = 0; i < empf.length; i++)
		{
			empf[i].name=emp[i].name;
			empf[i].salary=salary;
			empf[i].dept=emp[i].dept;
			empf[i].designation=empn[i].designation;
			empf[i].name=emp[i].name;
			
			
		}
		System.out.println("emplyee table 3 is");
		System.out.println("----------------------------------------------------------");
		for (int i = 0; i < empf.length; i++)
		{
			System.out.println("name "+empf[i].name+"id "+empf[i].empid+"dept: "+empf[i].dept+"designation: "+empf[i].designation+"salary "+empn[i].salary);
		
		}
		System.out.println("----------------------------------------------------------");*/
		
		
		System.out.println("enter id of employee u want to search");
		int s=sc.nextInt();
		for(EmployeeDetails emp1:emp)
		{
			for(EmployeeDetails emp2:empn)
			{
			if(emp1.empid==s)
			{
				System.out.println("found!!");
				if(emp1.dept.equalsIgnoreCase(emp2.dept))
				{
					salary=(emp1.basic+emp2.DA+emp1.HRA)-emp1.IT;
					System.out.println("salary: "+salary+" empid :"+emp1.empid+" name: "+emp1.name+" dept: "+emp1.dept+" designation: "+emp2.designation);
					
				}
				
				//System.out.println(emp1.toString());
				
				
				
			}
			
		
		}
		

	}

}
}
//output
/*enter details of emplyee table 1 
enter id name of emplyee 0
121 sagar
enter dept of emplyee0
ee
enter basic HRA IT of emplyee of0
50000 15000 5000
enter id name of emplyee 1
122 rohit
enter dept of emplyee1
me
enter basic HRA IT of emplyee of1
25000 1000 2500
enter id name of emplyee 2
123 honey
enter dept of emplyee2
ee
enter basic HRA IT of emplyee of2
10000 500 1000
enter designation details for table 2 
enter dept of emplyee 
ee
enter designation of emplyee 
senior
enter DA of emplyee 
2000
enter dept of emplyee 
me
enter designation of emplyee 
junior
enter DA of emplyee 
1000
emplyee table 1 is
----------------------------------------------------------
id: 121 name:  sagar dept: ee BASIC: 50000.0 HRA: 15000.0 IT: 5000.0
id: 122 name:  rohit dept: me BASIC: 25000.0 HRA: 1000.0 IT: 2500.0
id: 123 name:  honey dept: ee BASIC: 10000.0 HRA: 500.0 IT: 1000.0
..........................................................
emplyee table 2 is
----------------------------------------------------------
dept: ee designation: seniorDA: 2000.0
dept: me designation: juniorDA: 1000.0
----------------------------------------------------------
enter id of employee u want to search

122
found!!
found!!
salary: 24500.0 empid :122 name:  rohit dept: me designation: junior
*/
