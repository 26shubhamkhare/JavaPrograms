package Array;

public class SecondLargestArr {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 8, 10, 1, 12 };
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}

		System.out.println("The second largest element in the array is " + secondLargest);
	}
}
/*
 * In this program, we define an array of integers arr with 5 elements. We
 * initialize two variables largest and secondLargest to the first element of
 * the array. We then loop through the array using a for loop, starting at index
 * 1 (since we have already set largest and secondLargest to the first element
 * of the array). For each element of the array, we compare it to the current
 * value of largest. If the element is greater than largest, we update both
 * largest and secondLargest, with secondLargest becoming the previous value of
 * largest. If the element is not greater than largest but is greater than
 * secondLargest and not equal to largest, we update secondLargest to be the
 * element. After the loop completes, we print the value of secondLargest to the
 * console.
 * 
 * 
 * 
 * Regenerate response
 */
