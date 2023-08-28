package Extends_implement;

class Over{
	void add(int a)
	{
		System.out.println("Class A " +a);
	}
}

public class OverridingMethod extends Over {
	
	
	
	void add(int a)
	{
		System.out.println("Class B :" +a);
	}

	public static void main(String[] args) {
		
		 OverridingMethod v=new  OverridingMethod();
		 v.add(10);
		 
		 Over a=new Over();
		 a.add(30);
		 
	}

}
