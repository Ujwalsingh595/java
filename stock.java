package Stack;
import java.util.*;
class Pair{
	   int value;
	   int key;
	   Pair(int value,int key){
		   this.value=value;
		   this.key=key;
	   }
}
public class stock {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,80,60,70,60,75,85};
		int n=arr.length;
		System.out.println(stockspan(arr,n));
	}
	public static List<Integer> stockspan(int arr[],int n){
		List<Integer> l=new ArrayList<>();
		Stack<Pair> stack=new Stack<>();
		for(int i=0;i<n;i++) {
			if(stack.empty())
				l.add(-1);
			else if(!stack.empty()&&stack.peek().value>arr[i])
				l.add(stack.peek().key);
			else if(!stack.empty()&&stack.peek().value<arr[i])
			{
				while(!stack.empty()&&stack.peek().value<arr[i]) {
					stack.pop();
				}
				if(stack.size()==0)
					l.add(-1);
				else
					l.add(stack.peek().key);
			}
			stack.push(new Pair(arr[i],i));
		}
		for(int i=0;i<n;i++) {
			l.set(i,i-l.get(i));
		}
		return  l;
	}
}
