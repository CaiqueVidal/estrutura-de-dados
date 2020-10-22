package atividade03.ex02;

import javax.swing.JOptionPane;

public class List {
	private Object list[];                  
	private int size; 
	
	public List(int size) {
		list =  new Object[size];
		this.size = 0;
	}
	
	public boolean isEmpty () {
		if (size == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull () {
		if (size == list.length) {
			return true;
		}
		return false;
	}
	
	public void addStart(Object data) {
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
	
	public void addEnd(Object data) {
		if (isFull()){
			JOptionPane.showMessageDialog(null,"Lista cheia!");                               
		}
		else{
			list[size]= data;                     
			size++;
		}
	}
	
	public void add(Object data, int pos) {
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
	
	public Object removeStart() {
		Object data;
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
	
	public Object removeEnd() {
		Object data;
		if (isEmpty()){                               
			return null;
		} else {
			data = (list[size-1]);
			size--;
			return data;
		}
	}
	
	public Object remove(int pos) {
		int i;
		Object data; 
		
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
		
	public String showList() {
		String aux=" ";
		for (int i = 0; i < size; i++){
			aux += "\n"+ list[i];
		}
		return aux;
	}
	
}
