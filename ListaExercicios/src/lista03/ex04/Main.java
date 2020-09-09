package lista03.ex04;

import javax.swing.JOptionPane;

import lista03.Book;

public class Main {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		int opc = 0;
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
					+ "\n1-Push \n2-Pop \n3-Exibir pilha \n9-Sair"));
			Book book = new Book();
			
			switch (opc) {
			case 1:	
				book.addBook();
				book = (Book)stack.push(book);
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro \"" + book.getTitle() + "\" inserido na pilha com sucesso!");
				}
				break;
				
			case 2:
				book = (Book)stack.pop();
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro \"" + book.getTitle() + "\" removido da pilha com sucesso!");
				}
				break;
				
			case 3:
				JOptionPane.showMessageDialog(null, stack.showStack());
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
