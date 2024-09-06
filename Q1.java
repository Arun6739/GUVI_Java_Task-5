package task5;
import java.util.Scanner;

   public class Q1 {
      public static void main(String[] args) {
    	  Scanner word = new Scanner(System.in);
    	  System.out.print("Enter a string: ");
    	  String str = word.nextLine();
          str = str.toLowerCase();      
    	  int len = str.length();
    	        
    	  for (int i = 0; i < len / 2; i++) {

    	      if (str.charAt(i) != str.charAt(len - i - 1)) {
    	        	System.out.println("\"" + str + "\" is not a palindrome.");
    	            return; 
    	          }
    	      }
    	  System.out.println("\"" + str + "\" is a palindrome.");
          word.close();
    	    }
}