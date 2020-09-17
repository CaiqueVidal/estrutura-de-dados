package lista01;

public class Ex01 {

	public static void main(String[] args) {
		
		double[] balances = new double[100];
		fillVector(balances);
		
		System.out.println("Média dos saldos entre 100 à 1000: " 
				+ String.format("%.2f", averageBetweenIntervals(balances, 100, 1000)));
		
		System.out.println("Média geral dos saldos: " 
				+ String.format("%.2f", overallAverage(balances)));
		
		System.out.println("Soma dos saldos negativos: " 
				+ String.format("%.2f", sumOfNegativeBalances(balances)));
		
	}
	
	
	private static void fillVector(double[] vt) {
		for (int i = 0; i < vt.length; i++) {
			vt[i] = (Math.random() * 1200 * (Math.random() > 0.5 ? 1 : -1));
		}
	}
	
	
	private static double averageBetweenIntervals(double[] balances, double min, double max) {
		double average = 0.0;
		int count = 0;
		
		for (double value : balances) {
			if ((value >= min) && (value <= max)) {
				average += value;
				count ++;
			}
		}
		return (average / count);
	}
	
	
	private static double overallAverage(double[] balances) {
		double average = 0.0;
		
		for (double value : balances) {
			average += value;
		}
		return (average / balances.length);
	}
	
	
	private static double sumOfNegativeBalances(double[] balances) {
		double sum = 0.0;
		
		for (double value : balances) {
			if (value < 0.0) {
				sum += value;
			}
		}
		return sum;
	}
}
