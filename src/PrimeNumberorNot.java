//import java.util.Scanner;

public class PrimeNumberorNot {

	public static void main(String[] args)
	{
	//	int a=13 ;
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number : ");
//		int a=sc.nextInt();
		
		int temp=0;
		for(int a=1;a<=100;a++)
		{
         		    for(int i=a; i<=a-1 ;i--)
		          {
			          if(a%i==0)
			         {
			   	      temp= temp+1;
			          }
		           }
		
			     if(temp==0)
			        {
				        System.out.println(a);
			         }
			      
			   //  System.out.println(no);
		
		}
	}

}
