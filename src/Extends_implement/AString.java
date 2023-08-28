package Extends_implement;

public class AString {

	public static void main(String[] args) {
		
		String a="ANKIT";
		String b="rahul";
		
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
	
		System.out.println(a.concat(b)); // add two character anme 
		System.out.println(a.length()); // total length value 5 
		System.out.println(b.length());
		
		
		
		String c="  Ankush   " ;
		String d="";
		String e="Learn";
		
		System.out.println(c);
		System.out.println(c.trim()); // without space showing 
		System.out.println(d.isEmpty()); //showing boolean 
		System.out.println(e.isEmpty());
		
		System.out.println(a.charAt(4)); // taken a index value 
		System.out.println(a.indexOf('N')); // taken a charater value 
		
		System.out.println(a.equals(b));  // both are equals or not
		System.out.println(a.replace("KIT","RAM"));  // KIT replay RMA directly 
		
		
		System.out.println("" +a.contains("k")); //showing boolean value
		
		//compareTo
		String str1 =" Guru";
		String str2=" Guru";
		
		System.out.println(str1);
		System.out.println(str2);
		
		//int  S = str1.compareTo(str2);
		
		if(str1.equals(str2))  //(S==0)
		{
			System.out.println(" both  value are same ");
		}
		else {
			System.out.println("both are not same ");
		}
		
		
		//compareToIgnorecase
		
		String str3 =" Guru";
		String str4 =" Guru";
		
		System.out.println(str1);
		System.out.println(str2);
		
		int  A = str3.compareToIgnoreCase(str4);
		
		if(A==0)
		{
			System.out.println(" both  value are same ");
		}
		else {
			System.out.println("both are not same ");
		}
		
		
		
		
	}

}
