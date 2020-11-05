package atividade04;

import java.util.Arrays;

import atividade04.ex01.QuickSort;
import atividade04.ex02.MergeSort;

public class Main {

	public static void main(String[] args) {
		int[] array = {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82, 42, 55, 78};
		new QuickSort().sort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
		
		int[] array2 = {11, 15, 32, 43, 28, 17, 79, 18, 33, 99, 88, 75, 45, 82};
		new MergeSort().sort(array2, 0, array2.length-1);
		System.out.println(Arrays.toString(array2));
		
	}
}
