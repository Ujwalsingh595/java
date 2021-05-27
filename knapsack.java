package dp;

import java.util.Arrays;

public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int w=10;
		int n=4;
		int[] val= {10,40,30,50};
		int[] wt= {1,3,4,6};
		int[][] mat=new int[n+1][w+1];
		for(int r=0;r<w+1;r++) {
			mat[0][r]=0;
		}
		for(int c=0;c<n+1;c++) {
			mat[c][0]=0;
		}
		//Main Logic
		for(int  item=1;item<=n;item++) {
			for(int capacity=1;capacity<=w;capacity++)
			{
				int maxwithoutcur=mat[item-1][capacity];
				int maxwithcur=0;
				int weightofcur=wt[item-1];
				if(capacity>=weightofcur) {
					maxwithcur=val[item-1];
					int remainingcapacity=capacity-weightofcur;
					maxwithcur+=mat[item-1][remainingcapacity];
				}
				mat[item][capacity]=Math.max(maxwithcur, maxwithoutcur);
			}
		}
		System.out.println(mat[n][w]);
		System.out.println(Arrays.deepToString(mat));
	}

}
