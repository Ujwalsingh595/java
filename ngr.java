package Stack;
import java.util.*;
public class ngr {

	public static void main(String[] args) {
		int arr[]= {1,3,2,4};
		int n=4;
		System.out.println(NGR(arr,n));
	}
	static List<Integer> NGR(int arr[],int n) {
		List l=new ArrayList();
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=n-1;i>=0;i--) {
			if(stack.empty())
				l.add(-1);
			else if(!stack.empty()&&stack.peek()>arr[i])
				l.add(stack.peek());
			else if(!stack.empty()&&stack.peek()<arr[i])
			{
				while(!stack.empty()&&stack.peek()<arr[i]) {
					stack.pop();
				}
				if(stack.size()==0)
					l.add(-1);
				else
					l.add(stack.peek());
			}
			stack.push(arr[i]);
		}
		Collections.reverse(l);
		return l;
	}

}
