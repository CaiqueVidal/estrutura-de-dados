package atividade02.ex02;

import javax.swing.JOptionPane;

import atividade02.LinkedList;

public class Main {
	
	public static void main(String[] args) {
		LinkedList<Double> temperatureList = new LinkedList<>();
		int opc = 0;
		
//		Simulações
//		Double t1 = 31.5;
//		Double t2 = 21.7;
//		Double t3 = 27.9;
//		Double t4 = 19.4;
//		Double t5 = 13.2;
//		
//		temperatureList.addEnd(t1);
//		temperatureList.addStart(t2);
//		temperatureList.addEnd(t3);
//		temperatureList.add(t4, 3);
//		temperatureList.addStart(t5);
//		JOptionPane.showMessageDialog(null, temperatureList.showLinkedList());
//		temperatureList.remove(4);
//		temperatureList.removeStart();
//		temperatureList.removeEnd();
//		JOptionPane.showMessageDialog(null, temperatureList.showLinkedList());
//		temperatureList.isEmpty();
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção: "
					+ "\n1-Verifica lista vazia \n2-Adicionar no início \n3-Adicionar no final"
					+ "\n4-Adicionar na posição \n5-Remover do início \n6-Remover do final "
					+ "\n7-Remover da posição \n8-Mostrar lista \n9-Sair"));
			
			Double temperature;
			
			switch (opc) {
			case 1:	
				if (temperatureList.isEmpty()) {
					JOptionPane.showMessageDialog(null,"Lista vazia!");
				} else {
					JOptionPane.showMessageDialog(null,"A lista não está vazia!");
				}
				break;
				
			case 2:
				temperature = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura: "));
				temperature = temperatureList.addStart(temperature);
				if (temperature != null) {
					JOptionPane.showMessageDialog(null, "Temperatura \"" + temperature + "\" adicionada no início com sucesso");
				}
				break;
				
			case 3:
				temperature = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura: "));
				temperature = temperatureList.addEnd(temperature);
				if (temperature != null) {
					JOptionPane.showMessageDialog(null, "Temperatura \"" + temperature + "\" adicionada no final com sucesso");
				}
				break;
			
			case 4:
				temperature = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura: "));
				int posA = Integer.parseInt(JOptionPane.showInputDialog("Posição para inserir: "));
				temperature = temperatureList.add(temperature, posA);
				if (temperature != null) {
					JOptionPane.showMessageDialog(null, "Temperatura \"" + temperature + "\" adicionada na posição " + posA);
				}
				break;
				
			case 5:
				temperature = temperatureList.removeStart();
				if (temperature != null) {
					JOptionPane.showMessageDialog(null, "Temperatura \"" + temperature + "\" removida do início");
				}
				break;
				
			case 6:
				temperature = temperatureList.removeEnd();
				if (temperature != null) {
					JOptionPane.showMessageDialog(null, "Temperatura \"" + temperature + "\" removida do final");
				}
				break;
				
			case 7:
				int posR = Integer.parseInt(JOptionPane.showInputDialog("Posição para remover: "));
				temperature = temperatureList.remove(posR);
				if (temperature != null) {
					JOptionPane.showMessageDialog(null, "Temperatura \"" + temperature + "\" removida da posição " + posR);
				}
				break;
				
			case 8:
				JOptionPane.showMessageDialog(null, temperatureList.showLinkedList());
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
