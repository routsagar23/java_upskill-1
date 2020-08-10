import java.util.Scanner;
class Robot
{
	int currentX;
	int currentY;
	int previousX;
	int previousY;
	
	public Robot() {
		this.currentX=0;
		this.currentY=5;
		
	}
	
	Robot(int x, int y)
	{
		this.currentX=x;
		this.currentY=y;
		
	}
	

	public void moveX(int dx) 
	{
		this.currentX=this.currentX+dx;
		this.previousX=dx;
		
	}
	public void moveY(int dy)
	{
		this.currentY=this.currentY+dy;
		this.previousY=dy;
		
	}

	public void printCurrentCoordinates() 
	{
		System.out.println(""+this.currentX+" "+this.currentY);
	}

	public void printLastCoordinates() 
	{
		this.previousX=this.currentX-this.previousX;
		this.previousY=this.currentY-this.previousY;
		System.out.println(""+this.currentX+" "+this.previousY);
		//System.out.println(""+this.previousX+" "+this.previousY);
	}
	public void printLastMove() 
	{
		
		System.out.println("x "+this.previousX);
		
		//System.out.println("y "+this.previousY);
		
		
	}
	
	
}
public class RobotMoves {
	static final Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
		int x=sc.nextInt();
		int y=sc.nextInt();
		int dx=sc.nextInt();
		int dy=sc.nextInt();
		
		Robot firstRobot = new Robot();
		firstRobot.printCurrentCoordinates();
		
		Robot secondRobot = new Robot(x,y);
		secondRobot.printCurrentCoordinates();
		
		for(int i=1;i<3;i++)
		{
			secondRobot.moveX(dx);
			secondRobot.printLastMove();
			//System.out.println("x "+firstRobot.previousX);
			secondRobot.printCurrentCoordinates();
			secondRobot.moveY(dy);
			////System.out.println("y "+this.previousY);
			//or secondRobot.printLastMove();
			secondRobot.printLastCoordinates();
			
			dx += i*i;
			dy -= i*i;
		}
	}

}
/*
 * 
 * input is.....
2
1
1
1
output is....
0 5
2 1
x 1
y 0
3 1
3 1
x 2
y 1
5 2
5 2
another output false...
0 5
2 1
x 1
y 0
3 1
2 1
x 2
y 1
5 2
3 2
*/
