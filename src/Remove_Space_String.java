
public class Remove_Space_String {

	public static void main(String[] args) {
		String str="JAVA   Programming  in  Selenium  Automation  " ;
		System.out.println("Before Remove Whit space :" +str);
		str =str.replaceAll("\\s" ,"");
	    System.out.println("After Remove Whit space :" +str);
	}

}
