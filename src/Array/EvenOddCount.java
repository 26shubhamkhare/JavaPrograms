package Array;
//In array find out how many are even and odd
public class EvenOddCount {

	public static void main(String[] args) {
		int arr[]= {2,3,5,6,7,8,10};
		int even = 0, odd = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]%2==0) 
				even ++;
			
			else
				odd++;
		}
		System.out.println("Even No " + even);
		System.out.println("Odd No " + odd);
		}

}
