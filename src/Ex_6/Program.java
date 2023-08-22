package Ex_6;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod_1 = sc.nextInt();
		int nr_1 = sc.nextInt();
		double price_1 = sc.nextDouble();
		int cod_2 = sc.nextInt();
		int nr_2 = sc.nextInt();
		double price_2 = sc.nextDouble();
		
		double total = (nr_2*price_2) + (nr_1*price_1);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		
		sc.close();

	}

}
