package logical;
import java.util.*;
import java.lang.Math;
public class binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary :");
		int bin=sc.nextInt();
		int last,d=0,i=0;
		while(bin!=0)
		{
			last=bin%10;
			d=(int) (d+last*Math.pow(2,i));
			i++;
			bin=bin/10;
			
		}
		System.out.println(d);
	}

}
