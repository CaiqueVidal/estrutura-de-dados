package lista03.ex07;

import javax.swing.JOptionPane;

import lista03.Book;
import lista03.ex04.Stack;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack(15);
		
		String title[] = {"Java", "C", "PHP", "CSS", "HTML", "JavaScript", "C++", "Assembly", "UML", "C#", "Python", "Cobol", "Kotlin", "Ruby", "Flutter"};
		
		for (int i = 0; i < title.length; i++) {
			Book book = new Book(title[i], i);
			stack.push(book);
		}

		JOptionPane.showMessageDialog(null, ">> Pilha <<" + stack.showStack());
		stack.sort();

	}
}
