package pattern;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++) 
		{
		for(int j=1;j<=10;j++)
		{
			if(j<=6-i || j>=4+i)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
		}
	}
}
