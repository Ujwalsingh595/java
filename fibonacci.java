package forloop;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int a=0,b=1,sum=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=n-2;i++) {
			sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
		}
		
	}

}
