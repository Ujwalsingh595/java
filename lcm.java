package logical;
import java.util.*;
public class lcm {
	public  static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int l;
	for(l=2;l<a*b;l++) {
		if(l%a==0&&l%b==0)
			break;
		
	}
	System.out.println(l);
	}
}
