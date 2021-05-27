package collection;

public class LinkedList<E> {
	Node<E>  head;
	public void add(E data) {
		Node<E> toadd=new Node<E>(data);
		if(head==null) {
			head=toadd;
			return;
		}
		Node<E> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toadd;
	}
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public E removeLast() {
		Node<E> temp=head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		Node toremove=temp.next;
		temp.next=null;
		return (E)toremove.data;
	}
	static class Node<E>{
		E data;
		Node<E> next;
		public  Node(E data) {
			this.data=data;
			next=null;
		}
	}
}
