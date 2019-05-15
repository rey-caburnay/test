package algo;

public class Palindrome {
    public static boolean isPalindrome(String word) {
    	String reverse = ""; 
    	int length = word.length();
    	for(int i = length - 1; i >= 0; i--) {
    		reverse = reverse + word.charAt(i);
    		if(word.equalsIgnoreCase(reverse)) {
    			return true;
    		} 
    	}
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Deleveled"));
    }
    
//    String original, reverse = ""; // Objects of String class  
//    Scanner in = new Scanner(System.in);   
//    System.out.println("Enter a string/number to check if it is a palindrome");  
//    original = in.nextLine();   
//    int length = original.length();   
//    for ( int i = length - 1; i >= 0; i-- )  
//       reverse = reverse + original.charAt(i);  
//    if (original.equals(reverse))  
//       System.out.println("Entered string/number is a palindrome.");  
//    else  
//       System.out.println("Entered string/number isn't a palindrome.");   
// }  
}