package Array;

public class RemoveDuplicatesbf {
    public static void main(String[] args) {
        
    
    // Example array with duplicates
    int[] array = {1, 2, 3, 2, 4, 5, 3, 6, 5};

    // Call the function to remove duplicates
    int[] result = removeDuplicates(array);

    // Print the array without duplicates
    System.out.print("Array without duplicates: ");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }

}
// Function to remove duplicates using brute force approach
public static int[] removeDuplicates(int[] array) {
    int n = array.length;
    int[] temp = new int[n];
    int k = 0;

    // Loop to remove duplicates
    for (int i = 0; i < n; i++) {
        boolean isDuplicate = false;
        for (int j = 0; j < i; j++) {
            if (array[i] == array[j]) {
                isDuplicate = true;
                break;
            }
        }
        // If the element is not a duplicate, add it to the temp array
        if (!isDuplicate) {
            temp[k++] = array[i];
        }
    }

    // Create a new array of size 'k' to store unique elements
    int[] result = new int[k];
    for (int i = 0; i < k; i++) {
        result[i] = temp[i];
    }
    return result;
}
}

/*Explanation:
We use a temporary array (temp) to store unique elements.
The outer loop iterates over each element, and the inner loop checks for duplicates by comparing the current element with all previous elements.
If an element is not a duplicate, it is added to the temp array.
Finally, we create a new array with the size of unique elements (k), which is returned as the result.
 */
