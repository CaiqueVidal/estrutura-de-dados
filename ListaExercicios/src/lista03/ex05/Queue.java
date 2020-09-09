package lista03.ex05;

import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JOptionPane;

import lista03.Book;

public class Queue {

	private Object queue[];
	private int size;
	
	public Queue() {
	}
	
	public Queue(int size) {
		queue = new Object[size];
		this.size = 0;
	}
	
	private boolean isEmpty () {
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	private boolean isFull () {
		if (size == queue.length) {
			return true;
		}
		return false;
	}
	
	public Object enqueue(Object obj) {
		if (isFull()) {
			JOptionPane.showMessageDialog(null,"Fila cheia!");
			return null;
		} else {
			queue[size]= obj;                     
			size++;
			System.out.println();
			return obj;
		}
	}
	
	public Object dequeue() {
		if (isEmpty()) {
			JOptionPane.showMessageDialog(null,"Fila vazia!");
			return null;
		} else {
			Object obj = (queue[0]);
			for (int i = 1; i < size; i++){                      
				queue[i-1] = queue[i];                          
			}
			size--;
			return obj;
		}
	}

	public String showQueue() {
		String aux=" ";
		
		if (isEmpty()) {
			return "Vazio!";
		}
		for (int i = 0; i < size; i++){
			aux += "\n"+ queue[i];
		}
		return aux;
	}
	
	public void sort() {
		if (size >= 2) {
			Arrays.sort(queue, new Comparator<Object>() {
				
				public int compare(Object o1, Object o2) {
					if ((o1 instanceof Book) && (o2 instanceof Book)) {
						Book b1 = (Book) o1;
						Book b2 = (Book) o2;
						String a = (String) b1.getTitle();
						String b = (String) b2.getTitle();
						return a.compareTo(b);
					} else {
						String a = (String) o1;
						String b = (String) o2;
						return a.compareTo(b);
					}
				}
			});
			
			JOptionPane.showMessageDialog(null, ">> Fila Ordenada<<" + this.showQueue());
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possível ordenar a Fila");
		}
	}
	
}
