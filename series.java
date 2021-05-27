package forloop;
import java.util.*;
public class series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		float sum=0;
		for(float i=1;i<=n;i++) {
			sum=1+1/i;
		}
			System.out.println(sum)
	}

}
