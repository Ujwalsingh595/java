package logical;

public class gcd {

	public static void main(String[] args) {
		System.out.println(gcd(24,72));

	}
	static int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd(b,a%b);
	}

}
