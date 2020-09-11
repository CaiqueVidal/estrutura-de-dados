package lista03.ex06;

import javax.swing.JOptionPane;

import lista03.Book;
import lista03.ex04.Stack;
import lista03.ex05.Queue;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue(15);
		Stack stack = new Stack(15);
		
		String title[] = {"Java", "C", "PHP", "CSS", "HTML", "JavaScript", "C++", "Assembly", "UML", "C#", "Python", "Cobol", "Kotlin", "Ruby", "Flutter"};
		
		for (int i = 0; i < title.length; i++) {
			Book book = new Book(title[i], i);
			queue.enqueue(book);
		}

		JOptionPane.showMessageDialog(null, ">> Fila <<" + queue.showQueue());		
		for (int i = 0; i < 15; i++) {
			Book book = new Book();
			book = (Book)queue.dequeue();
			if (book != null) {
				stack.push(book);
			}
		}
		
		JOptionPane.showMessageDialog(null, ">> Pilha <<" + stack.showStack());
		
	}
	
}
