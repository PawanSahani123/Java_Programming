import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Numer for A");
		int a=sc.nextInt();
		System.out.println("Enter a Numer for B");
		int b=sc.nextInt();
		System.out.println("Enter a Numer for C");
		int c=sc.nextInt();
		/*
		 * if(a>b && a>c) { System.out.println("A is graeter"); }
		 * 
		 * else { if(b>a && b>c) { System.out.println("B is greater  "); }
		 * 
		 * else { System.out.println(" C is graeter "); }
		 * //System.out.println("This is not number"); }
		 */
		
		int Largest1 = a>b?a:b;  //Largest of a & b
		int Largest2= c>Largest1?c:Largest1; //largest of c & Largest 1
		System.out.println("Largest number "+Largest2);
		//System.out.println("Largest number "+Largest2);
		
	}
	}


