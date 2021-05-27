package array;

import java.util.Arrays;

public class merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {6,7,8,9};
		merge(arr1,arr2);
	}
	static void  merge(int arr1[],int arr2[]) {
		
		int length=arr1.length+arr2.length;
		int result[]=new int[length];
		int i=0;
		for(int  element:arr1) {
			result[i]=element;
			i++;
		}
		for(int element:arr2) {
			result[i]=element;
			i++;
		}
		System.out.println(Arrays.toString(result));
	}

}
