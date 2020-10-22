package atividade02;

import javax.swing.JOptionPane;

import lista03.Book;

class Node<E> {
	E data;
	Node<E> next;

	public Node(E data) {
		this.data = data;
		next = null;
	}

}

public class RecursiveLinkedList<E> {
	private Node<E> firstNode;
	
	public RecursiveLinkedList() {
		firstNode = null;
	}
	
	
	public boolean isEmpty() {
		return firstNode == null;
	}
	
	
	public E addEnd(E data) {
		Node<E> node = new Node<E>(data);	
		Node<E> aux = firstNode;
		Node<E> resp = addEnd2(data, node, aux);
		
		if (resp.data == null) {
			JOptionPane.showMessageDialog(null, "Erro ao adicionar no final");
			return null;
		}
		return resp.data;
	}
	
	private Node<E> addEnd2(E data, Node<E> node, Node<E> aux) {
		if (isEmpty()) {
			return firstNode = node;
		}
		
		if (aux.next == null) {
			return aux.next = node;
		}
		aux = aux.next;
		return addEnd2(data, node, aux);
	}

	
	public E addStart(E data) {
		Node<E> node = new Node<E>(data);
		Node<E> resp;
		node.next = firstNode;
		resp = firstNode = node;

		if (resp.data == null) {
			JOptionPane.showMessageDialog(null, "Erro ao adicionar no final");
			return null;
		}
		return resp.data;
	}
	
	
	public E add(E data, int pos) {
		if (pos == 1) {
			return addStart(data);
		}
		
		Node<E> node = new Node<E>(data);
		Node<E> aux = firstNode;
		int count = 1;
		return add2(node, aux, count, pos);
	}
	
	private E add2(Node<E> node, Node<E> aux, int count, int pos) {
		if (aux.next == null || count >= pos-1) {
			if (count == pos-1) {
				node.next = aux.next;
				aux.next = node;
				return aux.next.data;
			} else {
				JOptionPane.showMessageDialog(null, "Erro ao adicionar na posição escolhida");
				return null;
			}
		}
		
		aux = aux.next;
		return add2(node, aux, count +1, pos);
	}


	public E removeEnd() {
		E resp = null;
		if (isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lista vazia!");
			return resp;
		}

		if (firstNode.next == null) {
			resp = firstNode.data;
			firstNode = null;
			return resp;
		}
		
		Node<E> aux1 = firstNode;
		Node<E> aux2 = firstNode;
		resp = removeEnd2(aux1, aux2).data;
		return resp;
	}
	
	private Node<E> removeEnd2(Node<E> aux1, Node<E> aux2) {
		if (aux1.next == null) {
			aux2.next = null;
			return aux1;	
		}
		aux2 = aux1;
		aux1 = aux1.next;
		return removeEnd2(aux1, aux2);
	}
	
	
	public E removeStart() {
		E resp = null;
		if (isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lista vazia!");
			return resp;
		} 
		
		resp = firstNode.data;
		firstNode = firstNode.next;
		return resp;
	}
	
	
	public E remove(int pos) {
		E resp = null;
		int count = 1;
		Node<E> aux = firstNode;
		
		if (isEmpty()) {
			JOptionPane.showMessageDialog(null, "Lista vazia!");
			return resp;
		}
		if (pos == 1) {
			resp = removeStart();
			return resp;
		}
		
		resp = remove2(pos, aux, count);
		return resp;
	}
	
	private E remove2(int pos, Node<E> aux, int count) {
		if (aux.next == null) {
			if (pos > count || pos == 0) {
				JOptionPane.showMessageDialog(null, "Posição Inválida!");
				return null;
			} else if (pos == count) {
				return removeEnd();
			} else {
				aux = firstNode;
				Node<E> aux2 = aux;		
				return remove3(pos, aux, aux2);
			}
		}
		
		aux = aux.next;
		return remove2(pos, aux, count+1);
	}
	
	private E remove3(int pos, Node<E> aux, Node<E> aux2) {
		if (pos == 1) {
			aux2.next = aux.next;
			return aux.data;
		}
		aux2 = aux;
		aux = aux.next;
		return remove3(pos-1, aux, aux2);
	}
	

	public String showLinkedList() {
		String text = "";
		Node<E> first = firstNode;
		return showLinkedList2(first, text);
	}
	
	private String showLinkedList2(Node<E> first, String text) {
		if (isEmpty()) {
			return "Lista vazia!";
		}
		
		if (first == null) {
			return text;
		}
		
		text += first.data + "\n";
		return showLinkedList2(first.next, text);
	}
	
	
	public void sort() {
		if (isEmpty()) {
			return;
		}
		Node<E> first = firstNode;
		int size = 0;
		size = countElements(first, size);
		
		sort2(first, size);
	}
	
	private void sort2(Node<E> first, int size) {
		if (size == 1) {
			return;
		}
		first = firstNode;
		sort3(first, size, 1);
	}
	
	private void sort3(Node<E> first, int size, int i) {
		if (i == size || first.next == null) {
			sort2(first, size-1);
		}
		
		if (i < size && first.next != null) {
			
			if (first.data instanceof Book) {
				Book b1 = (Book) first.data;
				String st1 = b1.getTitle();
				Book b2 = (Book) first.next.data;
				String st2 = b2.getTitle();
				String str = compareToString(st1, st2);
				if (str == b1.getTitle()) {
					remove(i);
					add((E) b1, i+1);
					first = first.next;
				}
				
			}
			sort3(first.next, size, i+1);
		}
	}
	
	
	public E sequencialSearch(String text) {
		int count = 1;
		Node<E> first = firstNode;
		return sequencialSearch2(text, first, count);
	}
	
	private E sequencialSearch2(String text, Node<E> first, int count) {
		E resp = null;
		if (isEmpty()) {
			return resp;
		}
		
		if (first == null) {
			return resp;
		}
		
		if (first.data instanceof Book) {
			Book b = (Book) first.data;
			if (text.equals(b.getTitle())) {
				resp = first.data;
				return resp;
			}
		}
		return sequencialSearch2(text, first.next, count+1);
	}
	
	
	public E binarySearch(String text) {
		E resp = null;
		if (isEmpty()) {
			return resp;
		}
		sort();
		
		Node<E> first = firstNode;
		int size = countElements(first, 0);
		
		resp = binarySearch2(text, first, 1, size);
		return resp;	
	}
	
	private E binarySearch2(String text, Node<E> first, int start, int end) {
		if (start > end) {
			return null;
		}
		
		int middle = (start + end) /2;
		Node<E> aux = searchPosition(middle);
		if (aux.data instanceof Book) {
			Book b = (Book) aux.data;
			String s = b.getTitle();
			if (text.equals(b.getTitle())) {
				return aux.data;
			}
			
			String str = compareToString(s, text);
			if (str == text) {
				start = middle +1;
				return binarySearch2(text, first, start, end);
			} else {
				end = middle -1;
				return binarySearch2(text, aux, start, end);
			}
		}
		return null;
	}
	
	
	private int countElements(Node<E> first, int count) {	
		if (first == null) {
			return count;
		}
		return countElements(first.next, count +1);
	}

	
	private Node<E> searchPosition(int pos) {
		if (pos == 1) {
			return firstNode; 
		}
		Node<E> first = firstNode;
		int count = 1;
		return searchPosition2(first, count, pos);
	}
	
	private Node<E> searchPosition2(Node<E> first, int count, int pos) {
		if (first.next == null || count >= pos-1) {
			if (count == pos-1 && first.next != null) {
				return first.next;
			} else {
				return null;
			}
		}
		first = first.next;
		return searchPosition2(first, count +1, pos);
	}
	
	
	private String compareToString(String s1, String s2) {
		int size = (s1.length() < s2.length()) ? s1.length() : s2.length();
		int count = 0;
		return compareToString2(s1, s2, count , size);
	}
	
	private String compareToString2(String s1, String s2, int count, int size) {
		if (count >= size) {
			return (s1.length() > s2.length()) ? s1 : s2;
		}
		
		char c1 = Character.toUpperCase(s1.charAt(count));
		char c2 = Character.toUpperCase(s2.charAt(count));
		
		if (c1 > c2) {
			return s1;
		} else if (c2 > c1) {
			return s2;
		}
		return compareToString2(s1, s2, count+1, size);
	}

}
