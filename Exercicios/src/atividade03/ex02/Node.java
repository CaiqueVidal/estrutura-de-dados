package atividade03.ex02;

public class Node<E> {
	E data;
	Node<E> previous;
	Node<E> next;
	

	public Node(E data) {
		this.data = data;
		previous = null;
		next = null;
	}
}
