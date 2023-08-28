import java.util.Arrays;

public class CheckEqulityofarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		
	boolean status = Arrays.equals(a,b);
		
	//	if (Arrays.equals(a, b))
		if(status==true)
		  {
			System.out.println("Array are Equals");
		  }
		else
		   {
				System.out.println("Array are not  Equals");
			}
		

	}

}
