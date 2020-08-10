import java.util.Scanner;

/*Create a class Box that uses a parameterized method to initialize the dimensions of a 
  box.(dimensions are width, height, depth of double type). 
 The class should have a method that can return volume. Obtain an object and print
 the corresponding volume in main() function.*/

public class Box 
{
	double width;
	double height;
	double depth;

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Box b=new Box();
		System.out.println("enter dimension");
		double w=sc.nextDouble();
		double h=sc.nextDouble();
		double d=sc.nextDouble();
		b.size(w,h,d);
	double result=b.volume();
	System.out.println("volume is: "+result);

	}

	private double volume() {
		
		return(width*height*depth);
	}

	private void size(double w, double h, double d)
	{
		
		width=w;
		height=h;
		depth=d;
		
	}

}
