import java.util.Scanner;

public class JaggedArray {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("enter row");
		int row=sc.nextInt();
		int mat2d[][]=new int[row][];
		for (int i = 0; i < mat2d.length; i++)
		{
			System.out.println("enter column size for row "+i);
	int col=sc.nextInt();
			mat2d[i]=new int [col];
		}
		input(mat2d);
		display(mat2d);

	}
	private static void display(int[][] mat2d)
	{
		System.out.println("the array is:");
	
		
		for (int i = 0; i < mat2d.length; i++) 
		{
			
		for (int j = 0; j < mat2d[i].length; j++) 
		{
			System.out.println( mat2d[i][j]);
			
			
		}
	
		System.out.println();
		}
	}
	
	private static void input(int[][] mat2d)
	{
System.out.println("enter array details");
for (int i = 0; i < mat2d.length; i++) 
{
	System.out.println("enter row elemets of"+i);
for (int j = 0; j < mat2d[i].length; j++) 
{
	mat2d[i][j]=sc.nextInt();
}
}
	}



}