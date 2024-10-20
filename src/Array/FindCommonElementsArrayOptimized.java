package Array;

import java.util.HashSet;

public class FindCommonElementsArrayOptimized {
    public static void main(String[] args) {
        // Two example arrays
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 3, 4, 5, 6, 7 };

        // Call the function to find common elements
        findCommonElementsOptimized(array1, array2);
    }

    // Function to find common elements using HashSet
    public static void findCommonElementsOptimized(int[] array1, int[] array2) {
        // Create a HashSet to store elements of the first array
        HashSet<Integer> set = new HashSet<>();

        // Add elements from the first array to the HashSet
        for (int num : array1) {
            set.add(num);
        }

        System.out.println("Common elements are: ");
        // Check for common elements in the second array
        for (int num : array2) {
            if (set.contains(num)) {
                System.out.println(num);
            }
        }
    }
}
/*
 * Explanation:
 * HashSet: We use a HashSet to store the elements of array1. Checking whether
 * an element exists in a HashSet is an O(1) operation on average.
 * findCommonElementsOptimized function: The function first adds all elements
 * from array1 to a HashSet. Then it iterates over array2, checking whether each
 * element is present in the HashSet.
 * Time Complexity: O(n + m), where n is the length of array1 and m is the
 * length of array2.
 */