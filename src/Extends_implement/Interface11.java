package Extends_implement;

interface B
{
	void show();
	default void display()
	{
		System.out.println("This is Class B");
	}
	
}
interface C{
	void set();
	
}

public class Interface11 implements B ,C{
	
	public void show()
	{
		System.out.println("This is Interface");
	}
	public void set() {
		System.out.println(" This is interface is c");
	}

	public static void main(String[] args) {
		
		Interface11 i =new Interface11();
		i.show();
		i.display();
		i.set();
		
		
		

	}

}
