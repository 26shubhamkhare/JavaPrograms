package Basic;
public class FactorialRecursion {
	
	public static int fact(int num) {
		if(num<=1) {
			return 1;
		}
		else
			return num*fact(num-1);
	}

	public static void main(String[] args) {
		// 5! = 5*4*3*2*1 = 120
		
		int num = 5;
		int factorial = fact(num);
		System.out.println("The factorial of number using recursion:" + factorial);
		

	}

}
