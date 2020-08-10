import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		int size=sc.nextInt();
		int arr[]= new int[size];//marks of some students
		System.out.println("enter mark of students");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		
		for(int marks=1;marks<=100;marks++)
		{
			for (int j = 0; j <arr.length; j++)
			{
				if (arr[j]==marks)
				{
					c++;
				}
			}
			if(c!=0)
			{
				System.out.println(marks+"= "+c);
				c=0;
			}
		}
		
			
			
		
		

	}

}
