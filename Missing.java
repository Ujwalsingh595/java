package array;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,2,1};
		solve(arr);
	}
	static void solve(int arr[]) {
		int n=arr.length;
		int i=0;
		while(i<n) {
			if(arr[i]!=arr[arr[i]-1]) {
				int temp=arr[i];
				arr[i]=arr[arr[i]-1];
				arr[temp-1]=temp;
			}else
				i++;
		}
		for(i=0;i<n;i++) {
			if(arr[i]!=i+1) {
				System.out.println(arr[i]+" Duplicate");
				System.out.println(i+1+"Missing");
			}
		}
	}
	
	
}

