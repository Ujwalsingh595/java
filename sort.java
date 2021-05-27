package sorting;
public class sort {
	void merge(int arr[],int l,int m,int h) {
		int n1=m-l+1;
		int  n2=h-m;
		int A[]=new int[n1];
		int B[]=new int[n2];
		for(int i=0;i<n1;i++)
			A[i]=arr[i+l];
		for(int j=0;j<n2;j++)
			B[j]=arr[m+1+j];
		int i=0,j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(A[i]<=B[j]) {
				arr[k]=A[i];
				i++;
			}else {
				arr[k]=B[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]=A[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k]=B[j];
			j++;
			k++;
		}
	}
	void mergesort(int arr[],int l,int h) {
		if(l<h) {
			int mid=(l+h)/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,h);
			merge(arr,l,mid,h);
		}
	}
	static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	public static void main(String  args[])
	{
		int arr[]= {5,1,6,8,14};
		print(arr);
		sort s=new sort();
		s.mergesort(arr, 0, arr.length-1);
		System.out.println("\nSorted array");
		print(arr);
	}
}
