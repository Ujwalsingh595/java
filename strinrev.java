package recursion;

public class strinrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	rev("Ujwal");

	}
	static String rev(String s)
	{
		if(s.isEmpty())
		{
			return s;
		}
		
			return rev(s.substring(1)+s.charAt(0));
	}

}
