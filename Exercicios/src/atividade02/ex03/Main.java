package atividade02.ex03;

import javax.swing.JOptionPane;

import atividade02.RecursiveLinkedList;

public class Main {
	
	public static void main(String[] args) {
		RecursiveLinkedList<Student> list = new RecursiveLinkedList<>();
		int opc = 0;
		
//		Simulações
//		Student st1 = new Student(7, "Caique", "18-2T", "5 °");
//		Student st2 = new Student(3, "Victor", "18-1T", "6 °");
//		Student st3 = new Student(15, "Pedro", "19-2N", "3 °");
//		Student st4 = new Student(12, "Raizer", "19-1N", "3 °");
//		Student st5 = new Student(23, "Gustavo", "20-2T", "1 °");
//		
//		list.addEnd(st1);
//		list.addStart(st2);
//		list.addEnd(st3);
//		list.add(st4, 3);
//		list.addStart(st5);
//		JOptionPane.showMessageDialog(null, list.showLinkedList());
//		list.remove(4);
//		list.removeStart();
//		list.removeEnd();
//		JOptionPane.showMessageDialog(null, list.showLinkedList());
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
					+ "\n1-Adicionar no final \n2-Adicionar no início"
					+ "\n3-Adicionar na posição \n4-Remover do fim"
					+ "\n5-Remover do início \n6-Remover da posição \n7-Mostrar lista \n9-Sair"));
			
			Student student = new Student();
			
			switch (opc) {
			case 1:	
				student.addStudent();
				student = list.addEnd(student);
				if (student != null) {
					JOptionPane.showMessageDialog(null, "Aluno " + student.getName() +" adicionado no final com sucesso");
				}
				break;
				
			case 2:
				student.addStudent();
				student = list.addStart(student);
				if (student != null) {
					JOptionPane.showMessageDialog(null, "Aluno " + student.getName() +" adicionado no início com sucesso");
				}
				break;
				
			case 3:
				student.addStudent();
				int posA = Integer.parseInt(JOptionPane.showInputDialog("Posição para inserir: "));
				student = list.add(student, posA );
				if (student != null) {
					JOptionPane.showMessageDialog(null, "Aluno " + student.getName() +" adicionado na posição "+ posA +" com sucesso");
				}
				break;
			
			case 4:
				student = list.removeEnd();
				if (student != null) {
					JOptionPane.showMessageDialog(null, "Aluno " + student.getName() +" removido do final");
				}
				break;
				
			case 5:
				student = list.removeStart();
				if (student != null) {
					JOptionPane.showMessageDialog(null, "Aluno " + student.getName() +" removido do início");
				}
				break;
				
			case 6:
				int posR = Integer.parseInt(JOptionPane.showInputDialog("Posição para remover: "));
				student = list.remove(posR);
				if (student != null) {
					JOptionPane.showMessageDialog(null, "Aluno " + student.getName() +" removido da posição " + posR);
				}
				break;
				
			case 7:
				JOptionPane.showMessageDialog(null, list.showLinkedList());
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
