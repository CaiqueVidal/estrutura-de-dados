package lista03.ex04;

import java.util.Arrays;
import java.util.Comparator;

import javax.swing.JOptionPane;

import lista03.Book;

public class Stack {

	private Object stack[];
	private int size;
	
	public Stack(int size) {
		stack = new Object[size];
		this.size = 0;
	}
	
	private boolean isEmpty () {
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	private boolean isFull () {
		if (size == stack.length) {
			return true;
		}
		return false;
	}
	
	public Object push(Object obj) {
		if (isFull()) {
			JOptionPane.showMessageDialog(null,"Pilha cheia!");
			return null;
		} else {
			for (int i = size; i > 0; i--){         
				stack[i] = stack[i-1];                 
			}
			stack[0] = obj;                          
			size++;
			return obj;
			
		}
	}
	
	public Object pop() {
		if (isEmpty()) {
			JOptionPane.showMessageDialog(null,"Pilha vazia!");
			return null;
		} else {
			Object obj = (stack[0]);
			for (int i = 1; i < size; i++){                      
				stack[i-1] = stack[i];                          
			}
			size--;
			return obj;
		}
	}
	
	public String showStack() {
		String aux=" ";
		
		if (isEmpty()) {
			return "Vazio!";
		}
		for (int i = 0; i < size; i++){
			aux += "\n"+ stack[i];
		}
		return aux;
	}
	
	public void sort() {
		if (size >= 2) {
			Arrays.sort(stack, new Comparator<Object>() {
				
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
			
			JOptionPane.showMessageDialog(null, ">> Pilha Ordenada<<" + this.showStack());
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possível ordenar a Pilha");
		}
	}
	
}
