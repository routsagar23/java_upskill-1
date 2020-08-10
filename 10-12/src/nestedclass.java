

interface CC 
{
	
	int x=2;
	
	abstract class BB
	{
		int x=1;
		abstract void play() ;
		
		
	}

}
public class nestedclass implements CC
{
	void run() {
		System.out.println("run in y class");
		
	}
	void play()
	{
		System.out.println("play in y");
	}
	public static void main(String[] args)
	{
		nestedclass obj = new nestedclass();
		obj.run();
		obj.play();
		
				BB bbb= new BB()
				{

					@Override
					void play() 
					{
						System.out.println("play in anonymous class");
						
					}
				
				};
				bbb.play();
		
		
		
		System.out.println(CC.x); // to access static member of interface class CC
		System.out.println(bbb.x); // to access non static memeber of abstract class BB
		System.out.println(bbb  instanceof BB);
		//System.out.println(bbb  instanceof nestedclass$1);
		
	}
	
}
