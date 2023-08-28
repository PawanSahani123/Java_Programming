
public class SumofDigitNumber {

	public static void main(String[] args) {
		int num=54321;
		int sum=0;
		while(num>0)//54321 5432
		{
			sum=sum+num%10; //last digit 1 /2 /
			num=num/10;//[5432][543]
		}
		System.out.println("Sum of DIGIT Number: "+sum);

	}

}
