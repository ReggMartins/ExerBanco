package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;

		System.out.print("Informe numero da conta: ");
		int numero = sc.nextInt();
		System.out.print("Inform Titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Existe depositio Inicial (s/n)? ");
		char response = sc.next().charAt(0);
		if (response == 's') {
			System.out.print("Entre com valor inicial: ");
			double initialdeposito = sc.nextDouble();
			account = new Account(numero, titular, initialdeposito);
		}
		else {
			account = new Account(numero, titular);
		}

		System.out.println();
		System.out.println("Dados da Conta:");
		System.out.println(account);

		System.out.println();
		System.out.print("Entre com valor deposito: ");
		double depositoValue = sc.nextDouble();
		account.deposito(depositoValue);
		System.out.println("Atualização da conta:");
		System.out.println(account);

		System.out.println();
		System.out.print("Entre com valor do saque: ");
		double saqueValue = sc.nextDouble();
		account.saque(saqueValue);
		System.out.println("Atualização da conta:");
		System.out.println(account);

		sc.close();
	}
}