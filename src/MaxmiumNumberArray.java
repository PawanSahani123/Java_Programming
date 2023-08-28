
public class MaxmiumNumberArray {

	public static void main(String[] args) 
	{
		int a[]= {20,40,30 ,90, 200,345,344};
		
		
	int max=a[0];
	for(int i=0 ; i<a.length ;i++)
	{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(" Maxium Number Element in Array is : " +max);

	}

}
