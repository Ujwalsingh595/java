package methods;
public class swap {
	public static void main(String args[]) {
//		int a=12;
//		int b=24;
//		swap(a,b);
//		System.out.println(a +" "+b);
		Dog c=new Dog();
		c.legs=4;
		Dog d=new Dog();
		d.legs=3;
		swap(c,d);
		System.out.println(c.legs+" "+d.legs);
	}
	static void swap(int c,int d) {
		int temp=c;
		c=d;
		d=temp;
		System.out.println(c +" "+d);
	}
	static void swap(Dog a,Dog b) {
		Dog temp=a;
		a=b;
		b=temp;
	}
	
}
class Dog{
	int legs;
}
