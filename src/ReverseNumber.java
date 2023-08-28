import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
        System.out.println("Enter the user number:");
        int num =r.nextInt();
        
       /* int rev=0;   //  1 Logic Alogirtham  
        while(num!=0)
        {
        	rev=rev*10 + num%10;  //Using 0*10 +1234%10=4 End digit showing  (0+1234=4)
        	num = num/10 ; //  using 1234/10=123 digit
        }*/
        
		/*
		 * StringBuffer sb =new StringBuffer(String.valueOf(num)); StringBuffer rev
		 * =sb.reverse();
		 */
        
        StringBuilder sb1=new StringBuilder();
        sb1.append(num);
        StringBuilder rev =sb1.reverse();
        
        
        
        System.out.println("Reverse this number  "+rev);
	

}

	private static Object append(int num) {
		// TODO Auto-generated method stub
		return null;
	}
}
