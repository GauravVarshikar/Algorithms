package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        //Find the nth number in the fibonacci series
        System.out.println(fibonacci(10));
    }

    private static int fibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return fibonacci(n-2)+ fibonacci(n-1);
    }
}
