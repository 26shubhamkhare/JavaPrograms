// To check whether a No is Prime or Not
public class PrimeNumber {

	public static void main(String[] args) {
		int i, num =8;
		boolean flag = false;
		for(i=2; i<= num/2; ++i) {
			if(num %i == 0) {
				flag = true;
				break;
			}
		}
			if(!flag) 
				System.out.println(num + " is a prime number.");
			
				else 
					System.out.println(num + " is not a prime number.");
		}
	}


