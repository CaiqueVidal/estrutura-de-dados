package lista02.ex05;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		TemperatureList temperatureList = new TemperatureList(5);
		int opc = 0;
		int pos;
		String dataText;
		Float data;
		
		while (opc != 99) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
					+ "\n1-Verifica lista vazia \n2-Verifica lista cheia \n3-Adicionar no inicio"
					+ "\n4-Adicionar no final \n5-Adicionar na posição \n6-Remover do inicio"
					+ "\n7-Remover do fim \n8-Remover na posição \n9-Mostrar lista \n99-Sair"));
			
			switch (opc) {
			case 1:
				if (temperatureList.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Lista vazia!");
				} else {
					JOptionPane.showMessageDialog(null,"A lista não está vazia!");
				}
				break;
				
			case 2:
				if (temperatureList.isFull()) {
					JOptionPane.showMessageDialog(null,"Lista cheia!");
				} else {
					JOptionPane.showMessageDialog(null,"A lista não está cheia!");
				}
				break;
				
			case 3:
				dataText = JOptionPane.showInputDialog("Digite a Temperatura: ");
				data = Float.parseFloat(dataText);
				temperatureList.addStart(data);
				break;
				
			case 4:
				dataText = JOptionPane.showInputDialog("Digite a Temperatura: ");
				data = Float.parseFloat(dataText);
				temperatureList.addEnd(data);
				break;	
				
			case 5:
				dataText = JOptionPane.showInputDialog("Digite a Temperatura: ");
				data = Float.parseFloat(dataText);
				pos = Integer.parseInt(JOptionPane.showInputDialog("Adicionar na posição: "));
				temperatureList.add(data, pos);
				break;
				
			case 6:
				data = temperatureList.removeStart();
				if (data != null) {
					JOptionPane.showMessageDialog(null, data + " removido da lista");
				} else {
					JOptionPane.showMessageDialog(null, "Não foi possível remover da lista");
				}
				break;
				
			case 7:
				data = temperatureList.removeEnd();
				if (data != null) {
					JOptionPane.showMessageDialog(null, data + " removido da lista");
				} else {
					JOptionPane.showMessageDialog(null, "Não foi possível remover da lista");
				}
				break;
				
			case 8:
				pos = Integer.parseInt(JOptionPane.showInputDialog("Remover na posição: "));
				data = temperatureList.remove(pos);
				if (data != null) {
					JOptionPane.showMessageDialog(null, data + " removido da lista");
				} else {
					JOptionPane.showMessageDialog(null, "Não foi possível remover da lista");
				}
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, temperatureList.showList());
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
