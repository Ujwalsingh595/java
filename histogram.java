package Stack;
import java.util.*;
class pair{
	int value;
	int key;
	pair(int value,int key){
		this.value=value;
		this.key=key;
	}
}
public class histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,11,10,10,10};
		int n=arr.length;
		int width[]=new int[n];
		int area[]=new int[n];
		List<Integer> wid=new ArrayList<>();
		List<Integer> are=new ArrayList<>();
		List <Integer>NSR=NSR(arr,n);
		List <Integer>NSL=NSL(arr,n);
		System.out.println("Shortest distance to right " +NSR(arr,n));
		System.out.println("Shortest distance to left " +NSL(arr,n));
		for(int i=0;i<n;i++) {
			width[i]=NSR.get(i)-NSL.get(i)-1;
			wid.add(width[i]);
			
		}
		for(int i=0;i<n;i++) {
			area[i]=width[i]*arr[i];
			are.add(area[i]);
			
		}
		int mah=area[0];
		for(int i=0;i<n;i++) {
			if(area[i]>mah)
				mah=area[i];
		}
		System.out.println("Maximum area of histogram = "+mah);
	
	}
	public static List<Integer> NSR(int arr[],int n){
		Stack<pair> stack=new Stack<pair>();
		List<Integer> r=new ArrayList<Integer>();
		int pseudo=n;
		for(int i=n-1;i>=0;i--) {
			if(stack.empty())
				r.add(pseudo);
			if(!stack.empty()&&stack.peek().value<arr[i])
				r.add(stack.peek().key);
			if(!stack.empty()&&stack.peek().value>arr[i]) {
				while(!stack.empty()&&stack.peek().value>arr[i]) {
					stack.pop();
				}
				if(stack.empty())
					r.add(pseudo);
				else
					r.add(stack.peek().key);
			}
			stack.push(new pair(arr[i],i));
		}
		Collections.reverse(r);
		return r;
	}
	public static List<Integer> NSL(int arr[],int n){
		Stack<pair> stack=new Stack<pair>();
		List<Integer> l=new ArrayList<Integer>();
		int pseudo=-1;
		for(int i=0;i<n;i++) {
			if(stack.empty())
				l.add(pseudo);
			if(!stack.empty()&&stack.peek().value<arr[i])
				l.add(stack.peek().key);
			if(!stack.empty()&&stack.peek().value>arr[i]) {
				while(!stack.empty()&&stack.peek().value>arr[i]) {
					stack.pop();
				}
				if(stack.empty())
					l.add(pseudo);
				else
					l.add(stack.peek().key);
			}
			stack.push(new pair(arr[i],i));
		}
		return l;
	}
	
}
