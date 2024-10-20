package Array;

import java.util.HashSet;

public class RemoveDuplicatesOptimized {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 5};

        // Call the function to remove duplicates
        int[] result = removeDuplicatesOptimized(array);

        // Print the array without duplicates
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
}
 // Function to remove duplicates using HashSet
    public static int[] removeDuplicatesOptimized(int[] array) {
        // Use a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Add elements from the array to the HashSet
        for (int num : array) {
            set.add(num);
        }

        // Create a result array with the size of the HashSet
        int[] result = new int[set.size()];
        int i = 0;

        // Add elements from the HashSet to the result array
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}

/*Explanation:
HashSet: A HashSet automatically removes duplicates when adding elements.
We add all elements from the input array to the HashSet, which will only store unique elements.
Finally, we create a result array from the HashSet and return it.

Time Complexity:
Brute force approach: O(n²) due to nested loops.
Optimized approach with HashSet: O(n) for adding elements to the HashSet and creating the result array.
The optimized solution using HashSet is faster and more efficient for larger arrays.*/