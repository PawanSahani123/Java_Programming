import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0 ,b=1,c,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter the Number of Fibonacci Series: ");
		temp=sc.nextInt();
		for(int i=1;i<=temp;i++) //2
		{
			System.out.println(""+a);
			c=a+b; // c= 1
			a=b;  // a=1
			b=c; //c=1
		}

	}

}
