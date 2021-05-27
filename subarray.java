package array;

public class subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,-1,4,3,-6,-7,2};
		boolean found=false;
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a.length;j++)
			{
			sum=sum+a[j];
			if(sum==0)
			{
				found=true;
				break;
			}
			}
			if(found)
				break;
			
		}
		System.out.println("found "+ found);
	}

}
