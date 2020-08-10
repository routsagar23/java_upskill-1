
abstract class B {
	
	int x=2;;
	abstract void run();
	interface  A
	{
		int x=1;
		void play();
	}

}
class exxx extends B
{

	@Override
	void run() {
		System.out.println("run in y class");
		
	}
	void play()
	{
		System.out.println("play in y");
	}
	public static void main(String[] args)
	{
		exxx obj = new exxx();
		obj.run();
		obj.play();
		
		System.out.println(obj.x); // to access non static memeber of abstract class B
		System.out.println(A.x); // to access static member of interface class A
		
	}
	
}
