
public class ReverseString {

	public static void main(String[] args) {
		String str= "ABCD";
		String rev="";
		
		System.out.println("Previous String Is this :" +str);
	  // Using 1 Ways
//		  int len=str.length(); //4 
//		  for(int i=len-1; i>=0; i--)// 3 2 1 0 
//		 {
//		  rev=rev+str.charAt(i); //DCB 
//		  }
		 
	char a[]=str.toCharArray();
	
       int len=a.length;
       for(int i =len-1 ;i>=0 ;i--) //3 2 1 0
       {
    	   rev=rev+a[i];  //DCBA
       }
		
		
		// Using  2 ways 
		
//		System.out.println("String Revserse the number " +str);
//		StringBuffer sb=new StringBuffer(str);
//		StringBuffer rev =sb.reverse();
		
		System.out.println("Revserse the number " +rev);

	}

}
