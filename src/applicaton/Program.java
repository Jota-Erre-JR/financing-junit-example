package applicaton;

import entities.Financing;

public class Program {

	public static void main(String[] args) {

		try {

			Financing f1 = new Financing(100000.0, 2000.0, 20);
			System.out.println("Financimento 1:");
			System.out.printf("Entrada: %.2f%n", f1.entry());
			System.out.printf("Valor das Parcelas: %.2f%n", f1.quota());

		} catch (IllegalArgumentException e) {
			System.out.printf("Atenção: " + e.getMessage());
		}

		try

		{

			Financing f2 = new Financing(100000.0, 2000.0, 80);
			System.out.println("Financimento 2:");
			System.out.printf("Entrada: %.2f%n", f2.entry());
			System.out.printf("Valor das Parcelas: %.2f%n", f2.quota());

		} catch (IllegalArgumentException e) {
			System.out.printf("Atenção: " + e.getMessage());
		}
	}

}
