/* Create a class called GeneralBank which acts as base class for all banks. 
This class has functionality getSavingInterestRate and getFixedInterestRate methods, 
which return the saving a/c rate of interest and fixed account rate of interest the 
		specific bank gives. Since GeneralBank cannot say what percentage which bank would
		give, make it abstract.

1.2. Create 2 subclasses of GeneralBank called ICICIBank and KotMBank. Override the 
methods from base class. ICICI - Savings 4% Fixed 8.5% and KotMBank.  - Savings 6% Fixed 9%


1.3. Create a main method to test the above classes. Try one by one and absorb your finding.
a) ICICIBank object reference instantiated with ICICIBank class.
b) KotMBank object reference instantiated with KotMBank class.
c) GeneralBank object reference instantiated with KotMBank class.
d) GeneralBank object reference instantiated with ICICIBank class.*/
abstract class GeneralBank
{
	abstract void getSavingInterestRate();
	abstract void getFixedInterestRate();
	
}
class ICICIBank extends GeneralBank
{

	@Override
	void getSavingInterestRate() 
	{
		System.out.println(" Savings 4% ");
		
	}

	@Override
	void getFixedInterestRate() {
		System.out.println(" Fixed 8.5% ");
		
	}
	
}
class KotBank extends GeneralBank
{

	@Override
	void getSavingInterestRate()
	{
		
		System.out.println(" Savings 6% ");
	}

	@Override
	void getFixedInterestRate()
	{
		System.out.println(" Fixed 9% ");
		
	}
	
}

public class Banks {

	public static void main(String[] args) 
	{
		ICICIBank i= new ICICIBank();
		i.getFixedInterestRate();
		i.getSavingInterestRate();
		KotBank k=new KotBank();
		k.getFixedInterestRate();
		k.getSavingInterestRate();
		
		System.out.println("...............");
		GeneralBank g;
		g=i;
		g.getFixedInterestRate();
		g.getSavingInterestRate();
		g=k;
		g.getFixedInterestRate();
		g.getSavingInterestRate();
		
			
		
		
	}

}
