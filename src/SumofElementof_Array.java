
public class SumofElementof_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,6,9,7};
		int sum=0;
		//for(int i=0 ;i<=a.length-1 ;i++)
		for(int value:a)
		{
			sum=sum +value;
		}
		
		System.out.println("Sum of Array : " +sum);

	}

}
