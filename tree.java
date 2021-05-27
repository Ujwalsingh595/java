package Tree;
import java.util.*;

public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Node root=Create();
		inorder(root);
		preorder(root);
		postorder(root);
		levelorder(root);
		
	}
	static Node Create()
	{
		Scanner sc=new Scanner(System.in);
		Node root=null;
		System.out.println("Enter data: ");
		int data=sc.nextInt();
		if(data==-1)
			return null;
		Node n=new Node(data);
		root=n;
		System.out.println("Enter  left data: "+data);
		root.left=Create();
		System.out.println("Enter right data: "+data);
		root.right=Create();
		return root;
	}
	static void levelorder(Node root) {
		Queue<Node> queue=new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			Node tempnode= queue.poll();
			System.out.print(tempnode.data);
			if(tempnode.left!=null) {
				queue.add(tempnode.left);
			}
			if(tempnode.right!=null) {
				queue.add(tempnode.right);
			}
		}
	}
	static void inorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	static void postorder(Node root)
	{
		if(root==null)
			return;
		inorder(root.left);
		
		inorder(root.right);
		System.out.print(root.data+" ");
	}
	static void preorder(Node root)
	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		inorder(root.left);
		
		inorder(root.right);
	}

}
class Node{
	int data;
	Node left,right;
	Node(int  data){
		this.data=data;
		left=null;
		right=null;
	}
}