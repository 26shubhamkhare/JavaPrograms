package Array;

// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesOptimized {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] arr = {1, 2, 3, 2, 4, 1, 5};

        Set<Integer> set = new LinkedHashSet<>(); // maintains order
        for (int num : arr) {
            set.add(num);
        }

        // print unique elements
        for (int num : set) {
            System.out.print(num + " ");
        }

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