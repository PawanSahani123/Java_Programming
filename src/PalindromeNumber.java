import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while(temp!=0)
		{
			
			rev= rev*10 + temp%10 ;
			temp=temp/10 ;
	     }
		
	  if(num==rev)
	  {
		  System.out.println("Paliendrone Number" +num);
	  }
	  else
	  {
		  System.out.println("Not Paliendrome Number " +num);
	  }
	  
	}

}
