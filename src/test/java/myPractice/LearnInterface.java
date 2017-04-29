package myPractice;

interface area
{
	double compute(float a, float b);
	double pi=3.14;
}

public class LearnInterface {
	
	public static void main(String[]args)
	{
		Rect a=new Rect();
		Circ b=new Circ();
		
		area ar;
		
		ar=a;
		System.out.println(+ar.compute(10, 10));
		ar=b;
		System.out.println(+ar.compute(10, 10));
		
	}
}

class Rect implements area
{
	
	public double compute(float a, float b)
	{
		return(a*b);
	}

}
class Circ implements area
{
	
	public double compute(float a, float b)
	{
		return(pi*a*b);
	}

}

