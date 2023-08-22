package Ex_5;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hours = sc.nextInt();
		double perhour = sc.nextDouble();
		double salary = hours*perhour;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		
		sc.close();
	}

}
