import java.util.Scanner;

/*Create an abstract class Instrument which is having the abstract function play. 
Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
Override the play method inside all three classes printing a message 
�Piano is playing  tan tan tan tan  �  for Piano class
�Flute is playing  toot toot toot toot�  for Flute class
�Guitar is playing  tin  tin  tin �  for Guitar class 
You must not allow the user to declare an object of Instrument class.
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of  play method.
Use the instanceof operator to print that which object stored at which index of instrument
array.*/
abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument
{

	@Override
	void play() {
		System.out.println("Piano is playing  tan tan tan tan ");
		
	}
	
}
class Guitar extends Instrument
{

	@Override
	void play() {
		System.out.println("Guitar is playing  tin  tin  tin  ");
		
	}
	
}
class Flute extends Instrument
{

	@Override
	void play() {
		System.out.println("Flute is playing  toot toot toot toot ");
		
	}
	
}

public class Music
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Instrument i ;
		Flute f= new Flute();
		Guitar g= new Guitar();
		Piano p=new Piano();
		
		Instrument arr[]=new Instrument[10];
		System.out.println("enter details");
		for (int j = 0; j < arr.length-2; j++)
		{
			arr[j]=f;
			arr[j+1]=g;
			arr[j+2]=p;
			j++;
			j++;
			
			
		}
		for (int j = 0; j < arr.length; j++)
		{
			System.out.println(arr[j]);
			if(arr[j] instanceof Piano)
				System.out.println("instance of piano class at "+j);
			if(arr[j] instanceof Guitar)
				System.out.println("instance of guitar class at "+j);
			if(arr[j] instanceof Flute)
				System.out.println("instance of flute class at "+j);
				
			
			
			
		}
		System.out.println("enter no to select instrument");
		int n=sc.nextInt();
		
		if(arr[n]==f)
		{
		
			i=f;
			i.play();
			
		}
		if(arr[n]==p)
		{
		
			i=p;
			i.play();
			
		}
		if(arr[n]==g)
		{
		
			i=g;
			i.play();
			
		}
		
		
		
			
		
			
			

}
	}
	
