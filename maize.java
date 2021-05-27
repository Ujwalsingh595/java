package backtracking;
import java.util.*;
public class maize {
	static boolean isSafe(int a[][],int x,int y,int n)
	{
		if(x<n&&y<n&&a[x][y]==1) {
			return true;
		}
		return false;
	}
	static boolean ratinmaize(int a[][],int x,int y,int n,int sol[][]) {
		if(x==n-1&&y==n-1) {
			sol[x][y]=1;
			return true;
		}
		if(isSafe(a,x,y,n)) {
			sol[x][y]=1;
			if(ratinmaize(a,x+1,y,n,sol)) {
				return true;
			}
			if(ratinmaize(a,x,y+1,n,sol)) {
				return true;
			}
			sol[x][y]=0;
			return false;
		}
		return false;
	}
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size ");
	int n=sc.nextInt();
	int a[][]=new int[n][n];
	System.out.println("Enter the values");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int sol[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sol[i][j]=0;
			}
		}
		if(ratinmaize(a,0,0,n,sol)) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.println(sol[i][j]);
				}
			}
		}
	}
}
