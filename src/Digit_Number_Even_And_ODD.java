
public class Digit_Number_Even_And_ODD {

	public static void main(String[] args) {
		int num=59117826;
		int even_count=0;
		int odd_count=0;
		while(num>0)
		{
			int rem=num%10;
					if(rem%2==0)
					{
						even_count++;
						//System.out.println("Even Number :" +even_count);
					}
					else
					{
						odd_count++;
						//System.out.println("odd Number :" +odd_count);
					}
		num=num/10;			
		}
		System.out.println("Even Number in Digit :" +even_count);
		System.out.println("odd Number in Digit: " +odd_count);
				

	}

}
