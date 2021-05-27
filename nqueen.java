package backtracking;

public class nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nQueen(new boolean[4][4],0,0,4,0,"");

	}
	public static void nQueen(boolean board[][],int row,int col,int tq,int qpsf,String ans)
	{
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		if(col==board[0].length) {
			row++;
			col=0;
		}
		if(row==board.length)
		{
			return;
		}
		if(isSafe(board,row,col)) {
		board[row][col]=true;
		nQueen(board,row,col+1,tq,qpsf+1,ans + "[" + row +"," + col +"]");
		board[row][col]=false;
		}
		nQueen(board,row,col+1,tq,qpsf,ans);
	}
	public static boolean isSafe(boolean board[][],int row,int col) {
		int r=row-1;
		int c=col;
		while(r>=0) {
			if(board[r][c]==true) {
				return  false;
			}
			r--;
		}
		r=row;
		c=col-1;
		while(c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			c--;
		}
		r=row-1;
		c=col-1;
		while(r>=0&&c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		r=row-1;
		c=col+1;
		while(r>=0&&c<board[0].length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}

}
