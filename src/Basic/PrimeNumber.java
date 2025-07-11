package Basic;
// To check whether a No is Prime or Not
public class PrimeNumber {

	public static void main(String[] args) {
		int n =59;
		int flag = 0;
		for(int i=2; i<=n/2; i++){
		 if(n%i==0){
			 flag = 1;
			 break;
		 }
		 
		} 
		if(flag==0)
		System.out.println("Num is Prime");
		else
		System.out.println("Not Prime");
		
 
	 }
	}


