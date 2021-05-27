package Graph;
import java.util.*;
public class representation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
			for(int i=0;i<=5;i++) {
				adj.add(new ArrayList<Integer>());
			}
			adj.get(1).add(2);
			adj.get(1).add(9);
			adj.get(2).add(1);
			adj.get(3).add(4);
			adj.get(4).add(5);
			
			
			for(int i=1;i<=5;i++) {
				System.out.println("\n Adjacency list of vertex" + i);
				System.out.print("head");
				for(int j=0;j<adj.get(i).size();j++) {
					System.out.println(" ->"+adj.get(i).get(j)+" ");
				}
				System.out.println();
			}
	}

}
