import java.util.Scanner;

public class Matrix2D {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("enetr row");
		int row=sc.nextInt();
		System.out.println("enter col");
		int col=sc.nextInt();
		int[][] mat2D=new int[row][col];
		input(mat2D);
		display(mat2D);

	}
	private static void display(int[][] mat2d)
	{System.out.println("the array is:");
		
		for (int i = 0; i < mat2d.length; i++) 
		{
			
		for (int j = 0; j < mat2d[i].length; j++) 
		{
			System.out.print( mat2d[i][j]+"\t");
			
			
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
