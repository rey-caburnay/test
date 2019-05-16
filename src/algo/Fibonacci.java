package algo;

public class Fibonacci {

	 static int fib(int n) 
	    { 
	        int a = 0, b = 1, c; 
	        if (n == a || n == b) 
	            return n; 
	        for (int i = 2; i <= n; i++) 
	        { 
	            c = a + b; 
	            a = b; 
	            b = c; 
	        } 
	        return b; 
	    } 
	 
	   static int recurfib(int n) {
		   System.out.println("recursive call:" + n);
		   if (n < 2) {
			   return n;
		   }
		   return recurfib(n-1) + recurfib(n-2);
	   }
	  
	    public static void main (String args[]) 
	    { 
	        int n = 9; 
	        System.out.println(fib(n)); 
	        System.out.println(recurfib(n)); 
	    } 
}
