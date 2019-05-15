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
	  
	    public static void main (String args[]) 
	    { 
	        int n = 9; 
	        System.out.println(fib(n)); 
	    } 
}
