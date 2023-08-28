
public class SearchingDatainArray {

	public static void main(String[] args) {
		int a[] = {20 ,30,50,60,90,100};
		
		int b=50;
	    boolean c= false ;
		for(int i=0;i<a.length ;i++)
		{
			if(b==a[i])
			{
				System.out.println("Element are Found at position : "+i);
				c=true;
			}
		}
		
		if(c==false)
		{
		System.out.println("Element are NOT Found In Array");
		}
	}

}
