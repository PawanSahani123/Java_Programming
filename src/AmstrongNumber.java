
public class AmstrongNumber {

	public static void main(String[] args) {
		
		int a= 153 ;
		int b=a; 
		int length = 0;
		while(b !=0)
		{
		
			b=b/10;
			length = length +1 ;
			
		System.out.println("Total length : " +length);   //First stage length /digit find out
		}
		
		int c=a;
		int rem=0;
		int arm = 0;
		while(c !=0)
		{
			rem= c%10 ; 
			System.out.println("Rem value " +rem);  // 3 5 1
			int mul =1;
			for(int i=1;i<=length ;i++)
			{
				mul=mul *rem;                       // 3*3*3 =27   5*5*=125   1*1*1 =1
				System.out.println("mul value " +mul);
			}
		
			c=c/10;
			arm = arm +mul;                     // 27+125+1 =153  
			System.out.println("ARM value " +arm);  
			
		}
		
		
		if(arm==a)    // 153 =153
		{
			
			System.out.println("Amstrong Number");
		}
		else
		{
			System.out.println("NOT Amstrong Number");
		}
		

	}

}
