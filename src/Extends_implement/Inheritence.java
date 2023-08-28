package Extends_implement;

 class A{

	    int c=10;
		int d=20;
		public void add(int l ,int e)
		{
			System.out.println(l-e);
		}
		
}

public class Inheritence extends A{

	 		 int a=10;
		     int b=20;
		public void add(float m ,int n)
		   {
			System.out.println(m-n);
		}
		public void set(int m ,int  n ,int a)
		{
			System.out.println(m+n+a);
		}
		
		public static void main (String[] args)
		{
			Inheritence i =new Inheritence ();
			i.add(200, 12000);
			i.set(100,9000,200);
			System.out.println(i.a);
			System.out.println(i.b);
			System.out.println(i.c);
			System.out.println(i.d);
			
		}	
		
}
		

		


