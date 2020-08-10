import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;

  char c;
    int s;
    int avg=0;
    int n;
    Student(String f,String l,int id,int arr[])
    {
    super(f, l, id);
    for(int marks:arr)
    {
    this.s=this.s+marks;
    n++;
    
}
    
}
    
   char calculate()
   {
   this.s=this.s/this.n;
   if(this.s>=90&&this.s<=100)
   {
   c='O';
   
}
if(this.s>=80&&this.s<90)
   {
   
     c='E';
   
}
if(this.s>=70&&this.s<80)
   {
   
     c='A';
   
}
if(this.s>=55&&this.s<70)
   {
   
     c='P';
   
}
if(this.s>=40&&this.s<55)
   {
  
     c='D';
   
}
      if(this.s<40)
      {
           c='T';
          
}

       return c;
    }
    
}
public class Marks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}

//ip is
/*
sagar
rout
1234
2
100
80*/