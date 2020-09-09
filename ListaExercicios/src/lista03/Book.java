package lista03;

import javax.swing.JOptionPane;

public class Book {

	private String title;
	private int quantity;
	
	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "T�tulo: " + title + " - quantidade: " + quantity;
	}

	public void addBook() {
		String title = JOptionPane.showInputDialog("T�tulo do livro: ");
		int quantity = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de exemplares: "));
		this.setTitle(title);
		this.setQuantity(quantity);
	}
	
}
