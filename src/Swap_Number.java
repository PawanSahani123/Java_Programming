import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {
		int a , b ;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value for a");
		a=s.nextInt();
		System.out.println("Enter the value for b");
		b=s.nextInt();
	
		System.out.println("Swapping this number " + a + " " + b);

		int t; // Using 3rd third variable

		  t=a ; // value pass t=20 
		  a=b; // value pass a=10 
		  b=t; // value pass b=20
		 		 
		// Logic 2 without using 3 third variable

		
		  a = a + b; // 20+10 =30 
		  b = a - b; // 30-10 =20 
		  a = a - b; // 30-20 =10
		 
		System.out.println("After wapping this number " + a + " " + b);

	}

}
