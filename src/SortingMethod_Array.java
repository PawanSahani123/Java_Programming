import java.util.Arrays;

public class SortingMethod_Array {

	public static void main(String[] args) {
		int a[]= {10,3,4,20,10,11,17};
		
		//1 Approach 
//		System.out.println("Array Before Sorting : "+Arrays.toString(a) );
//		Arrays.parallelSort(a);
//		System.out.println("Array After Sorting : "+Arrays.toString(a) );
		System.out.println("Array Before Sorting : "+Arrays.toString(a) );
		Arrays.sort(a);
		System.out.println("Array After Sorting : "+Arrays.toString(a) );
		
	}

}
