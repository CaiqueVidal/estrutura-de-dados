package lista02.ex03;

import javax.swing.JOptionPane;

public class CharList {
	private char list[];                  
	private int size; 
	
	public CharList(int size) {
		list = new char[size];
		this.size = 0;
	}
	
	protected boolean isEmpty () {
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	protected boolean isFull () {
		if (size == list.length) {
			return true;
		}
		return false;
	}
	
	protected void addStart(char data) {
		if (isFull()) {
			JOptionPane.showMessageDialog(null,"Lista cheia!");  
		} else {
			for (int i = size; i > 0; i--){         
				list[i] = list[i-1];                 
			}
			list[0] = data;                          
			size++; 
		}
	}
	
	protected void addEnd(char data) {
		if (isFull()){
			JOptionPane.showMessageDialog(null,"Lista cheia!");                               
		}
		else{
			list[size]= data;                     
			size++;
		}
	}
	
	protected void add(char data, int pos) {
		int i;
		
		if ((!isFull()) && (pos < size +1) && (pos >= 0)) {
			for (i = size; i != pos; i--) {                     
				if (i !=0 ) {                                      
					list[i]= list[i-1];                            
				}
			}
			list[i] = data;                         
			size++;
			
		} else {
			JOptionPane.showMessageDialog(null,"Não foi possível inserir na lista");
		}
	}
	
	protected String removeStart() {
		String data;
		if (isEmpty()){                              
			return null;                                 
		} else {
			data = Character.toString(list[0]);
			for (int i = 1; i < size; i++){                      
				list[i-1] = list[i];                          
			}
			size--;
			return data;
		}
	}
	
	protected String removeEnd() {
		String data;
		if (isEmpty()){                               
			return null;
		} else {
			data = Character.toString(list[size-1]);
			size--;
			return data;
		}
	}
	
	protected String remove(int pos) {
		int i;
		String data; 
		
		if ((pos < size) && (pos >= 0) && (!isEmpty())){
			data = Character.toString(list[pos]);
			for (i = pos; i < size-1; i++){                 
				list[i] = list[i+1];                         
			}
			size--;
			return data;
			
		}
		return null;
		
	}
	
	protected String showList() {
		String aux=" ";
		for (int i = 0; i < size; i++){
			aux += "\n"+ list[i];
		}
		return aux;
	}
	
}
