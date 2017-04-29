package myPractice;

public class InheritanceP {

	public static void main(String[] args) {
		

		c1 c=new c1();
		c2 C=new c2();
		c.display();
		c.display1();
	}
	
	
}

class c1 extends c2
{
	
	void display()
	{
		System.out.println("From subclass"+z);
	}
}

class c2
{ int z=1;
	void display1()
	{
		System.out.println("From superclass" +z);
	}
}
