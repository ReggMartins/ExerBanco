package entities;

public class Account {

	private int numero;
	private String titular;
	private double saldo;

	public Account(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}

	public Account(int numero, String titular, double initialdeposito) {
		this.numero = numero;
		this.titular = titular;
		deposito(initialdeposito);
	}

	public int getnumero() {
		return numero;
	}

	public String gettitular() {
		return titular;
	}

	public void settitular(String titular) {
		this.titular = titular;
	}

	public double getsaldo() {
		return saldo;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}

	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}

	public String toString() {
		return "Account "
				+ numero
				+ ", titular: "
				+ titular
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
	}
}