package Extends_implement;

public class Overloading {
	
	void show(int a ,int b ,int d)
	
	{
		int c= a+b-d;
		System.out.println("Total Amount : "+c);
	}
	void show (int a ,int b )
	{
		System.out.println("A value : "+(a*b));
	}
	
	void show (int a )
	{
		System.out.println("A value : "+a);
	}
	public static void main(String[] args) {
	
		Overloading v=new Overloading ();
		v.show(20,40,20);
		v.show(20 ,40);
		v.show(50);

	}

}
