
public class DuplicateElementArray {

	public static void main(String[] args) {
		
		String arr[] = {"Java" ,"C++" ,"C" ,"Java"};
		
		for(int i=0 ; i<arr.length ;i++)
		{
			for(int j=i+1 ;j<arr.length ;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Dupplicate Element in Array : "+arr[i]);
				}
			}
		}
	}

}
