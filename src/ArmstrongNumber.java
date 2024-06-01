
public class ArmstrongNumber {
	public static void isArmstrong(int n) {
		int t, rem, cube=0 ;
		t =n;
		while(n>0) {
			rem = n%10;
			n/=10;
			cube = cube+(rem*rem*rem);
					
		}
		if(t==cube) {
			System.out.println("this is an armstrong number");
		}
		else {
			System.out.println("This is not an armstrong number");
		}
	}
	
	public static void main(String[] args) {
	isArmstrong(153);	

}
}
