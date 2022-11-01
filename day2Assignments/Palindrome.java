package week1.day2Assignments;

public class Palindrome {

	public static void main(String[] args) {
		 String num="343433";
		 char temp;
		 String revst="";
		 
		 
		 for(int i=num.length()-1;i>=0;i--) {
	        temp=num.charAt(i);
	        revst=revst+temp;
	     
		
	}
		   if(num.equals(revst)) {
				 System.out.println("This is a Palindrome");
			 }
			 else
			 {
				 System.out.println("This is not a plaindrome");
			 }
			 }
		 
		 

}

	
