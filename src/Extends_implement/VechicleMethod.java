package Extends_implement;

abstract class Car {
	
	   
	 abstract void Start();
}

 class VechicleMethod extends Car
 {
	 
	 
	 void Start()
	 {
		 System.out.println(" First Enter a Keys");
		 
	 }
	 
	 void add( String a)
	 {
		 System.out.println(a);
	 }
	 
	public static void main(String[] args)
	{
		VechicleMethod v=new VechicleMethod();
		v.Start();
		v.add("ABC");

	}

}
