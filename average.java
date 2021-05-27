package array;
import java.util.*;
public class average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of  students:");
		int n=sc.nextInt();
		int average=0;
		int marks[]=new int[n];
		System.out.println("Enter  marks");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
		average=average+marks[i];
		}
		average=average/n;
		System.out.println("Average marks of student:"+" "+average);
	}

}
