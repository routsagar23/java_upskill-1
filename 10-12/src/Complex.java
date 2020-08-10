
public class Complex 
{
	float real,img;
	public Complex() 
	{
		real=img=0;
	}
	public Complex(float R,float I)
	{
		real=R;
		img=I;
	}
	void add(Complex t1,Complex t2)
	{
		real=t1.real+t2.real;
		img=t1.img+t2.img;
		System.out.println("sum is real no is: "+real+" imag is :"+img);
	}

	public static void main(String[] args)
	{
Complex c= new Complex();
Complex c1= new Complex(2,4);
Complex c2= new Complex(4.3f,2.3f);
c.add(c1, c2);

	}

}
