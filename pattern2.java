package pattern;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=6;i++) 
		{
		for(int j=1;j<=6;j++)
		{
			if(j>=6-i)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
		}
	}

}
