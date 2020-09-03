package lista02.ex05;

import javax.swing.JOptionPane;

public class TemperatureList {
	private float list[];                  
	private int size;
	
	public TemperatureList(int size) {
		list = new float[size];
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
	
	protected void addStart(float data) {
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
	
	protected void addEnd(float data) {
		if (isFull()){
			JOptionPane.showMessageDialog(null,"Lista cheia!");                               
		}
		else{
			list[size]= data;                     
			size++;
		}
	}
	
	protected void add(float data, int pos) {
		int i;
		
		if ((!isFull()) && (pos<size+1) && (pos>=0)) {
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
	
	protected Float removeStart() {
		Float data;
		if (isEmpty()){                              
			return null;                                 
		} else {
			data = (list[0]);
			for (int i = 1; i < size; i++){                      
				list[i-1] = list[i];                          
			}
			size--;
			return data;
		}
	}
	
	protected Float removeEnd() {
		Float data;
		if (isEmpty()){                               
			return null;
		} else {
			data = (list[size-1]);
			size--;
			return data;
		}
	}
	
	protected Float remove(int pos) {
		int i;
		Float data; 
		
		if ((pos < size) && (pos >= 0) && (!isEmpty())){
			data = (list[pos]);
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
