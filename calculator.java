package calculator;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
		System.out.println("Enter the operation");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		int result=0;
		switch(operation) {
		case '+':
			result=a+b;
			System.out.println(result);
			break;
		case '-':
			result=a-b;
			System.out.println(result);
			break;
		case  '/':
			result=a/b;
			System.out.println(result);
			break;
		case '*':
			result=a*b;
			System.out.println(result);
			default :
				System.out.println("Invalid  operation");
		}

	}

}
