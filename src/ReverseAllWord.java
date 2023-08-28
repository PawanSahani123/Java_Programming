
public class ReverseAllWord {

	public static void main(String[] args) {
		String str = "Welcome  to Java";
		String [] word=str.split("\\S");
		System.out.println("Before Split" +word);
		
		String reverseword=" ";
		for(String w:word)
		{
			StringBuilder sb=new StringBuilder(w);
			StringBuilder reverseword1= sb.reverse();	
			 
			 //reverseword=reverseword+sb.toString()+" "
			
			System.out.println("Reverse the word : "+ reverseword1);
		}
		 
		 

	}

	private static void reverse() {
		// TODO Auto-generated method stub
		
	}

}
