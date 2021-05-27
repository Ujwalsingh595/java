package logical;
import java.util.*;
public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(fib(20));
		
		
	}
	static int fib(int n)
	{
		if(n==1||n==0)
			return n;
		return fib(n-1)+fib(n-2);
	}

}
