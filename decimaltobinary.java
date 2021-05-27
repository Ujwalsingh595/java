package logical;
import java.util.*;
public class decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a  number");
			int n=sc.nextInt();
			int r,bin = 0,i=1;
			while(n>=1)
			{
				r=n%2;
				n=n/2;
				bin=bin+r*i;
				i=i*10;
			}
			System.out.println(bin);
	}

}
