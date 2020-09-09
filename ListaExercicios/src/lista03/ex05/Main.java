package lista03.ex05;

import javax.swing.JOptionPane;

import lista03.Book;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		int opc = 0;
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
					+ "\n1-Enqueue \n2-Dequeue \n3-Exibir fila \n9-Sair"));
			
			Book book = new Book();
			
			switch (opc) {
			case 1:
				book.addBook();
				book = (Book)queue.enqueue(book);
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro \"" + book.getTitle() + "\" inserido na fila com sucesso!");
				}
				break;
				
			case 2:
				book = (Book)queue.dequeue();
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro \"" + book.getTitle() + "\" removido da fila com sucesso!");
				}
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, queue.showQueue());
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null,"Encerrando...");
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null,"Opção inválida");
			}
			
		}
	}
	
}
