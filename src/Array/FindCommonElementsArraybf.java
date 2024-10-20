package Array;

public class FindCommonElementsArraybf {
    public static void main(String[] args) {
        // Two example arrays
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 3, 4, 5, 6, 7 };

        // Call the function to find common elements
        findCommonElements(array1, array2);
    }

    // Function to find common elements using brute force (nested loops)
    public static void findCommonElements(int[] array1, int[] array2) {
        System.out.println("Common elements are: ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.println(array1[i]);
                    break; // Avoid printing duplicates
                }
            }
        }
    }
}

/*
 * Explanation:
 * findCommonElements function: This function compares each element in array1
 * with every element in array2 using nested loops. If a match is found, the
 * common element is printed.
 * Time Complexity: O(n * m), where n is the length of array1 and m is the
 * length of array2.
 */