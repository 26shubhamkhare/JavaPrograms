package Array;

public class SumofNoArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,5};
		int sum = 0;
		for(int i=0; i< arr.length; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("The sum of Array element is =" + sum);
		System.out.println("Length of array " + arr.length);
				}

}
