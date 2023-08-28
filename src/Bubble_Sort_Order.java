import java.util.Arrays;

public class Bubble_Sort_Order {

	public static void main(String[] args) {
		int a[]= {11,2,3,1,40,80,100,99};
		System.out.println(" Array Before Sorting "+ Arrays.toString(a));
		int n=a.length;
		
		for(int i=0 ;i<n-1 ;i++)  //number of pass
		{
			for(int j=0 ;j<n-1 ;j++) //Iterations are pass 
			{
				if(a[j] >a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println(" Array After Sorting "+ Arrays.toString(a));
	}

}
