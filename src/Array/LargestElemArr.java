//Program to print the largest element in an array
package Array;

public class LargestElemArr {

	public static void main(String[] args) {
	int arr[]= {10,11,2,6,77,9,8, 200};
	int max = arr[0];
    System.out.println(arr[0]);
	for(int i=0; i< arr.length ; i++) {
		if(arr[i]> max) {
			max= arr[i];
			
		}
	}
// The loop will check all the no whether it is greater than the max if its greater then the max then no is set as max and 
// 'i' will increase and next no will be compared.
	System.out.println("Largest element present in given array: " + max);
}

}
