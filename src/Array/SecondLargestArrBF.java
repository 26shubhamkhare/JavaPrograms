package Array;

import java.util.Arrays;

// Java program to find the second largest element in an array
// using sorting (brute force approach)
public class SecondLargestArrBF {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        Arrays.sort(arr);  // ascending order
        int n = arr.length;

        // find second largest (skip duplicates)
        int largest = arr[n-1];
        int second = -1;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] != largest) { //Skip Duplicates
                second = arr[i];
                break;
            }
        }

        if (second != -1)
            System.out.println("Second largest: " + second);
        else
            System.out.println("No second largest element");
    } 
}
/*
 * Time Complexity → O(n log n) (because of sorting).
📦 Space Complexity → O(1) (in-place).
Question: so after sorting in brute force can't we directly print arr[n-2]
Ans: Rule of Thumb:

If the array has only unique numbers, then yes → arr[n-2] works.

If the array may have duplicates, you must skip duplicates of the largest to get the correct answer.
arr = {12, 35, 1, 10, 35}
In this case, arr[n-2] = 35, which is incorrect. The second largest should be 12 not 35.
*/