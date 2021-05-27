package searching;

public class binarysearch {
	static int bs(int arr[],int l,int h,int key) {
		if(l==h) {
			if(arr[l]==key)
				return l;
			else return -1;
		}
		else {
			int mid=(l+h)/2;
			if(key==arr[mid])
				return mid;
			if(key<arr[mid])
				return bs(arr,l,mid-1,key);
			else
				return bs(arr,mid+1,h,key);
		}
	}
	public static void main(String args[]) {
		int arr[]= {4,32,565,75,2,7,77,134,66,75};
		int key=66;
		int result=bs(arr,0,arr.length,key);
		if(result==-1)
			System.out.println("Element not present");
		else
			System.out.println("Element  present at index"+" "+result);
	}
}
