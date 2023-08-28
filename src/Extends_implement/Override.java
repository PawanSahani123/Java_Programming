package Extends_implement;

public class Override extends Overriding {
	public void set()
	{
		System.out.println(" Class b");
	}
	public static void main(String[] args) {
		Override c =new Override ();
		c.set();
		//c.get();

	}

}
