package lista02.ex04;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		StringList stringList = new StringList(5);
		int opc = 0;
		int pos;
		String data;
		
		
		while (opc != 99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o: "
					+ "\n1-Verifica lista vazia \n2-Verifica lista cheia \n3-Adicionar no inicio"
					+ "\n4-Adicionar no final \n5-Adicionar na posi��o \n6-Remover do inicio"
					+ "\n7-Remover do fim \n8-Remover na posi��o \n9-Mostrar lista \n99-Sair"));
			
			switch (opc) {
			case 1:
				if (stringList.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Lista vazia!");
				} else {
					JOptionPane.showMessageDialog(null,"A lista n�o est� vazia!");
				}
				break;
				
			case 2:
				if (stringList.isFull()) {
					JOptionPane.showMessageDialog(null,"Lista cheia!");
				} else {
					JOptionPane.showMessageDialog(null,"A lista n�o est� cheia!");
				}
				break;
				
			case 3:
				data = JOptionPane.showInputDialog("Digite a String: ");
				stringList.addStart(data);
				break;
				
			case 4:
				data = JOptionPane.showInputDialog("Digite a String: ");
				stringList.addEnd(data);
				break;	
				
			case 5:
				data = JOptionPane.showInputDialog("Digite a String: ");
				pos = Integer.parseInt(JOptionPane.showInputDialog("Adicionar na posi��o: "));
				stringList.add(data, pos);
				break;
				
			case 6:
				data = stringList.removeStart();
				if (data != null) {
					JOptionPane.showMessageDialog(null, data + " removido da lista");
				} else {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel remover da lista");
				}
				break;
				
			case 7:
				data = stringList.removeEnd();
				if (data != null) {
					JOptionPane.showMessageDialog(null, data + " removido da lista");
				} else {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel remover da lista");
				}
				break;
				
			case 8:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Remover na posi��o: "));
				data = stringList.remove(pos);
				if (data != null) {
					JOptionPane.showMessageDialog(null, data + " removido da lista");
				} else {
					JOptionPane.showMessageDialog(null, "N�o foi poss�vel remover da lista");
				}
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, stringList.showList());
				break;
				
			case 99:
				JOptionPane.showMessageDialog(null,"Encerrando...");
				System.exit(0);
				
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida");
			}
		}
		
		
	}
}
