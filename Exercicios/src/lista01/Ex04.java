package lista01;

import java.util.Random;

public class Ex04 {
	
	public static void main(String[] args) {
		
		int[][] array = new int[4][4];
		fillArray(array);
		
		System.out.println("Soma dos valores no intervalo de 1 a 100: " 
				+ sumBetweenIntervals(array, 1, 100));
		
		System.out.println("Quantidade de números ímpares entre 30 e 50: " 
				+ oddAmountBetweenIntervals(array, 30, 50));
		
		System.out.println("Quantidade de números divisíveis por 8: " 
				+ divisibleAmount(array, 8));
		
		System.out.println("Quantidade de números ímpares divisíveis por 3: " 
				+ amountOfDivisibleOddNumbers(array, 3));
		
		long factorialResult = highestFactorialNumber(array);
		String textFactorial =(factorialResult == 0 ? "Número muito grande!" : Long.toString(factorialResult));
		System.out.print("Fatorial do maior número informado na matriz: " + textFactorial);
		
	}
	

	private static void fillArray(int[][] array) {
		Random r = new Random();
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++ ) {
				array[i][j] = r.nextInt(120);
			}
		}
	}
	
	private static int sumBetweenIntervals(int[][] array, int min, int max) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				if ((array[i][j] >= min) && (array[i][j] <= max)) {
					sum += array[i][j];
				}
			}
		}
		return sum;
	}
	
	
	private static int oddAmountBetweenIntervals(int[][] array, int min, int max) {
		int amount = 0;
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				if ((array[i][j] >= min) && (array[i][j] <= max)) {
					if (array[i][j] %2 != 0) {
						amount++;
					}
				}
			}
		}
		return amount;
	}
	
	
	private static int divisibleAmount(int[][] array, int number) {
		int amount = 0;
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				if (array[i][j] %8 == 0) {
					amount ++;
				}
			}
		}
		return amount;
	}
	
	private static int amountOfDivisibleOddNumbers(int[][] array, int number) {
		int amount = 0;
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				if (array[i][j] %2 != 0) {
					if (array[i][j] %3 == 0) {
						amount ++;
					}
				}
			}
		}
		return amount;
	}
	
	private static long highestFactorialNumber(int[][] array) {
		int highestNumber = 0;
		long highestFactorialNumber = 0L;
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array[i].length; j++) {
				if (array[i][j] > highestNumber) {
					highestNumber = array[i][j];
				}
			}
		}
		
		highestFactorialNumber = calculateFactorial(highestNumber);
		return highestFactorialNumber;
	}
	
	
	private static long calculateFactorial(int number) {
		long fact = 1L;
		for (int i = 1; i <= number; i++) {
			fact *= i;
		}
		return fact;
	}
	
}
