//Program to print the largest and smallest element in an array
package Array;
import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {
	int arr[]= {10,11,2,-890,300,6,77,9,8, 200};
	int max = arr[0];
	int min = arr[0];
    System.out.println("Print First Index " + arr[0]);  // print first Index
	for(int i=0; i< arr.length ; i++) {
		if(arr[i]> max) {
			max= arr[i];	
		}
		else if(arr[i]<min) {
			 min = arr[i];
		}
	}
// The loop will check all the no whether it is greater than the max if its greater then the max then no is set as max and 
// 'i' will increase and next no will be compared.
	System.out.println("The given array is: " + Arrays.toString(arr));
	System.out.println("Largest element present in given array: " + max);
	System.out.println("Smallest element present in given array: " + min);
}

}
