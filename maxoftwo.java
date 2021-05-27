package methods;

public class maxoftwo {

	public static void main(String[] args) {
		int c=12,d=44;
		int result=max(c,d);
		System.out.println(result);

	}
	static int max(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
