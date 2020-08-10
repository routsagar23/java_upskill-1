
/*Title - Gamecar
  Abstract -  Race of two cars and finding the winnder based on distance
  Author - Ravinder Singh
  ID - 0081
  Date - 09/04/2017
*/

import java.util.Scanner;

public class GameCar
{
 		private String carName;
 		private String carColor;
 		private int distance;

 		public GameCar()
 		{
 			carName =  "";
 			carColor = "";
 			distance = 0;
 		}
 		
	Scanner  Keyboard = new Scanner(System.in);
	
 	GameCar(String name , String color, int dist)
	{
 		this.carName = name;
 		this.carColor = color;
 		this.distance = dist;
 		System.out.println("Car information: " + this.carName + " (" + this.carColor + ")"+", Current Position: "+ this.distance);
	}
 	
 	
 	
	public void setColor(String col)
 	{
 		this.carColor = col;
 	}
 	
 	public void setCar(String name , String color , int distance)
 	{
 		this.carName = name;
 		this.carColor = color;
 		this.distance = distance;
 	}
	public void getcarInfo()
	{
		
		System.out.println("Enter the car name: ");
		this.carName = Keyboard.next();
		System.out.println("Enter the color: ");
		this.carColor = Keyboard.next();
		System.out.println("Enter the starting position: ");
		this.distance = Keyboard.nextInt();
		System.out.println("Car information: " + this.carName + " (" + this.carColor + ")"+", Current Position: "+ this.distance);
		
	}
	
	public void moveForward(int distancee)
	{
		this.distance = this.distance +distancee;
	}
	
	public void moveBackword(int distancee)
	{
		this.distance = this.distance -distancee;
	}
	
	public void race(GameCar anotherCar)
	{
		if(this.distance > anotherCar.distance)
		{
			System.out.println(this.carName + " wins");
		}
		
		else
		{
			System.out.println(anotherCar.carName + " wins");
		}
	}
	public boolean equals(GameCar anotherCar)
	{
		return(carName.equalsIgnoreCase(anotherCar.carName) && carColor.equalsIgnoreCase(anotherCar.carColor)
				&& distance == anotherCar.distance);
	}
	public String toString() 
	{
		return ("CarName:"+this.carName+" color:"+this.carColor+" last position:"+this.distance);
		
	}

   public static void main(String[] args)
   {
      GameCar car1 = new GameCar ("MyBuddy", "Red", 19);
      GameCar car2 = new GameCar ();

      car1.moveForward(5);
      car1.moveBackword(2);
      car1.setColor("Black");
      
     System.out.println(car1);
      
      car2.getcarInfo();
      car2.moveForward(7);
      car2.moveForward(3);
     
     System.out.println(car2);
     car1.race(car2);        
      
      car1.moveForward(10);   
            
      car1.race(car2); 
      //car2.setCar("BlueJay", "Blue", 30);   
      
      car1.race(car2);    
      System.out.println("Same Car ?" + car1.equals(car2));
      System.out.println("car1:"+car1);
      System.out.println("car2:"+car2);
   }
}