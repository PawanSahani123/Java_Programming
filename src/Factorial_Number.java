import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number: ");
		int a=sc.nextInt();		
		//int a=10;
		long factorial=1;
		for(int i=1; i<=a;i++) //1 2 3 4
		{
			factorial=factorial * i;      //1 2  3
			
		}		
	
		
		System.out.println("Factorial Number : "+ factorial);

	}

}
