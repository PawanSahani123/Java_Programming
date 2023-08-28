package Extends_implement;


class G {
	
		int a=10;
		
	
}

public class SuperKeyword extends G {
	int b=70;
	void add(int b)
	{
		int c=b;
		System.out.println(" This refer Parent class Variable "+ super.a); // super keyword used 
		System.out.println("This is Refer Current Class variable:" +this.b); // THis keyword used
		System.out.println(c);
	}

	public static void main(String[] args) {
		SuperKeyword s =new SuperKeyword();
		
		s.add(30);

	}

}
