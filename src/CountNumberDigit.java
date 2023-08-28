
public class CountNumberDigit {

	public static void main(String[] args) {
		int num= 567545;  
		int count =0 ;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of DIGIT " +count);

	}

}
