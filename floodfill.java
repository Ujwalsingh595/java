package recursion;

public class floodfill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static void floodfill(int a[][],int r,int c,int tofill,int prevfill) {
		int rows=a.length;
		int cols=a[0].length;
		if(r<0||r>=rows||c<0||c>=cols) {
			return;
		}
		if(a[r][c]!=prevfill) {
			return;
		}
		a[r][c]=tofill;
		floodfill(a,r-1,c,tofill,prevfill);
		floodfill(a,r,c-1,tofill,prevfill);
		floodfill(a,r+1,c,tofill,prevfill);
		floodfill(a,r,c+1,tofill,prevfill);
	}

}
