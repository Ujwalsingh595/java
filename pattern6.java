package pattern;

public class pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean k=true;
		for(int i=1;i<=5;i++) 
		{
			k=true;
		for(int j=1;j<=15;j++)
		{
			if(j<=4+i && j>=6-i && k==true)
			{
			System.out.print("*");
			k=false;
			}
			else
			System.out.print(" ");
			k=true;
		}
		System.out.println();
		}
	}
}
