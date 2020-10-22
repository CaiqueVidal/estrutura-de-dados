package atividade02.ex04;

import javax.swing.JOptionPane;

import atividade02.RecursiveLinkedList;
import lista03.Book;

public class Main {
	
	public static void main(String[] args) {
		RecursiveLinkedList<Book> list = new RecursiveLinkedList<>();
		int opc = 0;
		
//		Simulações
//		Book b1 = new Book("Java", 10);
//		Book b2 = new Book("PHP", 3);
//		Book b3 = new Book("C#", 5);
//		Book b4 = new Book("JavaScript", 12);
//		Book b5 = new Book("Kotlin", 7);
//		
//		list.addEnd(b1);
//		list.addStart(b2);
//		list.addEnd(b3);
//		list.add(b4, 3);
//		list.addStart(b5);
//		
//		JOptionPane.showMessageDialog(null, list.showLinkedList());
//		JOptionPane.showMessageDialog(null, list.showLinkedList());
//		JOptionPane.showMessageDialog(null, list.sequencialSearch("Java"));
//		list.sort();
//		JOptionPane.showMessageDialog(null, list.binarySearch("PHP"));
		
//		list.remove(4);
//		list.removeStart();
//		list.removeEnd();
//		JOptionPane.showMessageDialog(null, list.showLinkedList());
		
		while (opc != 99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
					+ "\n1-Adicionar no final \n2-Adicionar no início"
					+ "\n3-Adicionar na posição \n4-Remover do fim"
					+ "\n5-Remover do início \n6-Remover da posição \n7-Ordenar "
					+ "\n8-Busca sequencial \n9-Busca binária"
					+ "\n10-Mostrar lista \n99-Sair"));
			
			Book book = new Book();
			
			switch (opc) {
			case 1:	
				book.addBook();
				book = list.addEnd(book);
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro " + book.getTitle() +" adicionado no final com sucesso");
				}
				break;
				
			case 2:
				book.addBook();
				book = list.addStart(book);
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro " + book.getTitle() +" adicionado no início com sucesso");
				}
				break;
				
			case 3:
				book.addBook();
				int posA = Integer.parseInt(JOptionPane.showInputDialog("Posição para inserir: "));
				book = list.add(book, posA);
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro " + book.getTitle() +" adicionado na posição "+ posA +" com sucesso");
				}
				break;
			
			case 4:
				book = list.removeEnd();
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro " + book.getTitle() +" removido do final");
				}
				break;
				
			case 5:
				book = list.removeStart();
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro " + book.getTitle() +" removido do início");
				}
				break;
				
			case 6:
				int posR = Integer.parseInt(JOptionPane.showInputDialog("Posição para remover: "));
				book = list.remove(posR);
				if (book != null) {
					JOptionPane.showMessageDialog(null, "Livro " + book.getTitle() +" removido da posição " + posR);
				}
				break;
				
			case 7:
				list.sort();
				break;
				
			case 8:
				String seqSearch = JOptionPane.showInputDialog("Buscar pelo título: ");
				book = list.sequencialSearch(seqSearch);
				if (book == null) {
					JOptionPane.showMessageDialog(null, "Não foi possível encontrar \"" + seqSearch + "\"");
				} else {
					JOptionPane.showMessageDialog(null, book);
				}
				break;
				
			case 9:
				String binSearch = JOptionPane.showInputDialog("Buscar pelo título: ");
				book = list.binarySearch(binSearch);
				if (book == null) {
					JOptionPane.showMessageDialog(null, "Não foi possível encontrar \"" + binSearch + "\"");
				} else {
					JOptionPane.showMessageDialog(null, book);
				}
				break;
				
			case 10:
				JOptionPane.showMessageDialog(null, list.showLinkedList());
				break;
				
			case 99:
				JOptionPane.showMessageDialog(null,"Encerrando...");
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null,"Opção inválida");
			}
			
		}
		
	}
	
}
