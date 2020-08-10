/*Create a class named �Animal� which includes methods like eat() and sleep().
Create a child class of Animal named �Bird� and override the parent class methods. 
Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this
object.Create an instance of Bird class and invoke the eat, sleep and fly
methods using this object.*/

  class Animal
{
	 void eat()
	 {
		 System.out.println("animal eats");
	 }
	 void sleep()
	 {
		 System.out.println("animal sleeps");
	 }
}
  class Bird extends Animal
 {
	 void eat()
	 {
		
		 System.out.println("bird eats");
	 }
	 void sleep()
	 {
		 System.out.println("bird sleeps");
	 }
	 void fly()
	 {
		 System.out.println("birds fly");
	 }
	 
	 public static void main(String[] args) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b= new Bird();
		b.sleep();
		b.eat();
		b.fly();
		
	}
	 
 }
