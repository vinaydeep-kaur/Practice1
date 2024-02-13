package arrays;

import java.util.Arrays;

public class MissingNumber {
	 static int missingNumber(int array[], int n) {
         Arrays.sort(array);
         System.out.println(Arrays.toString(array));
        for ( int i = 1; i<n;i++){
            if(i!=array[i-1]){
                return i;
            }
        }
        return 0;
    }
	 public static void main(String[] args) {
		int arr[] = {6,1,2,8,3,4,7,10,5};
		int n = 10;
		System.out.println(missingNumber(arr,n));
	}
}
