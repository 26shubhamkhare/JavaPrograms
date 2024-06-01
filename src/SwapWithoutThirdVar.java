
public class SwapWithoutThirdVar {

	public static void main(String[] args) {
		
		int x=10, y=20;
		System.out.println("Num before the swap: " + x + " " + y);
	/*	x=x+y;
		y=x-y;
		x=x-y; */
		
	/*	x=x*y;
		y=x/y;
		x=x/y;  */
		
		x=x^y;
		y=x^y;
		x=x^y;
		
		
		System.out.println("Num after the swap: " + x + " " + y);
		

	}

}
