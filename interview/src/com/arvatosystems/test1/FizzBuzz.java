package com.arvatosystems.test1;

public class FizzBuzz {

    /**
     * FILL IN THE CODE
     * such that it will print number for 1 to N
     * BUT if the number is multiple of 3, print "Fizz" instead
     * BUT if the number is multiple of 5, print "Buzz" instead
     * BUT if it's multiple of 3 and 5, print "FizzBuzz" instead
     * @param n
     */
    public void fizzBuz(int n) {
        // TODO: code!
    	for (int i = 1; i <= n; i++) {
    		if ((i % 3) == 0 && (i%5) == 0)
    		{
    			System.out.println("FizzBuzz");
    		}else if ((i%3) == 0)
    		{
    			System.out.println("Fizz");
    		}else if ((i%5) == 0)
    		{
    			System.out.println("Buzz");
    		}
    		else
    		{
    			System.out.println(i);
    		}
		}
    }
    
    public static void main(String[] args) {
        FizzBuzz app = new FizzBuzz();
        app.fizzBuz(20);
    }
}
