package Array;

public class MissingNumber {

	public static void main(String[] args) {
		// find Missing number in Java
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		// 1+2+4+5 = 12
		// 1+2+3+4+5 = 15 -12 =3 which is the missing no
		
		int len = a.length;
	//	System.out.println(len);
		int arrSum = 0, sum = 0, missingNo;
		for(int i =0 ;i< len ; i++) { 
			
			arrSum += a[i];
		}
		for(int i=1;i<=len+1; i++)
		{
			sum+= i;
		}
		missingNo = sum - arrSum;
		System.out.println("The missing No is:" + missingNo);
		

	}

}
