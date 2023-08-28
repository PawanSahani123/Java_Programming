import java.util.Scanner;

public class PaliendromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.next();
		String rev="";
		
		int len=str.length();
		for(int i=len-1; i>=0 ;i--)
		{
			rev=rev+ str.charAt(i);
		}
      System.out.println(" String is Revase : " +rev);
      
      if(str.equals(rev))
      {
    	  System.out.println("Paliendrome String " +str);
      }
      else
      {
    	  System.out.println("Is Not a Paliendrome string " +str);
      }
	}

}
