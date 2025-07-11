package Basic;
public class FibonacciRecursion {

    public static int fib(int num) {
    	// base case if n =1 and n=0
        if(num == 0) {
            return 0;
        } else if(num == 1) {
            return 1;
        } else {
            return fib(num - 1) + fib(num - 2); // 5 + 4
        }
    }

    public static void main(String[] args) {
        int num = 7;

        System.out.print("Fibonacci series: ");
        for(int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
