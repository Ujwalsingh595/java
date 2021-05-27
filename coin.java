package recursion;
import java.lang.*;
public class coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,7,3,2,43};
		System.out.println(coinmax(a,0,a.length-1));
	}
	static int coinmax(int a[],int l,int  r)
	{
		if(l+1==r) {
			return Math.max(a[l],a[r]);
		}
		return Math.max(a[l] + Math.min(coinmax(a,l+2, r),coinmax(a,l+1,r-1)),
				a[r] + Math.min(coinmax(a, l+1,r-1),coinmax(a,l,r-2)));
	}

}
