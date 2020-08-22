package lista01;

import java.util.Random;

public class Ex05 {

	public static void main(String[] args) {
		
		int[][] array = new int[4][4];
		
		fillArray(array);
		showArray(array);
		
	}

	
	private static void fillArray(int[][] array) {
		Random r = new Random();
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++ ) {
				if (i == j && i == 0) {
					array[i][j] = 1;
				}
				else if (i == j && i > 0) {
					array[i][j] = array[i-1][j-1] * 3;
				}
				else {
					array[i][j] = r.nextInt(10);	
				}
				
			}
		}
	}
	
	
	private static void showArray(int[][] array) {
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	
}
