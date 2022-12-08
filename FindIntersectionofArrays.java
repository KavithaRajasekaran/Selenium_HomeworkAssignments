package week1.day2.assignments;

import java.util.Arrays;

public class FindIntersectionofArrays {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {7,8,9,4,5,6};
		System.out.println("The first array is " + Arrays.toString(arr1));
		System.out.println("The Second array is " + Arrays.toString(arr2));
		
		for (int i = 0; i < arr1.length; i++) 
		{
			for (int j = i; j < arr2.length; j++) 
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println("The common elements in both arrays are " + arr1[i]);
				}
			}
		}
	}

}
