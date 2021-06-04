package Recursion;

public class Factorial {
    public static void main(String[] args) {
        //Find n factorial recursively
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    private static Integer factorial(Integer n) {
        //base condition to exit recursion
        if(n == 1){
            return n;
        }
        //calculate n multiplied by n-1 recursively
        return n * factorial(n-1);
    }
}
