package Array;
// Program to print the duplicate elements of an array
public class printDuplicateArr {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,2,6,7,4,8,8};
		for (int i= 0; i< arr.length; i++)
		{
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.println("The duplicate elements in an Arrays are:" + arr[i]);
				}
			}
		}
	}

}
