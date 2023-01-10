package application;

import java.util.Scanner;

//usando o construtor de Account para inicializar as instâncias name e balance
//variável no momento em que cada objeto Account é criado

public class AccountTest {

	public static void main(String[] args) {
		// cria dois objetos Account
		Account acc1 = new Account("Jane Green", 50.00);
		Account acc2 = new Account("John Blue", -7.53);

		// exibe o valor inicial de cada objeto Account
		System.out.printf("%s balance: $%.2f %n", acc1.getName(), acc1.getBalance());
		System.out.printf("%s balance: $%.2f %n", acc2.getName(), acc2.getBalance());

		// cria scanner para obter uma entrada a partir do prompt
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");// prompt
		double depositAmount = sc.nextDouble();

		System.out.printf("%nadding %.2f to acc1 balance%n%n", depositAmount);
		acc1.deposit(depositAmount);// adiciona o saldo de acc1

		// exibe os saldos
		System.out.printf("%s balance: $%.2f %n", acc1.getName(), acc1.getBalance());
		System.out.printf("%s balance: $%.2f %n", acc2.getName(), acc2.getBalance());

		System.out.print("Enter deposit amount for account2: ");// prompt
		depositAmount = sc.nextDouble();

		System.out.printf("%nadding %.2f to acc2 balance%n%n", depositAmount);
		acc2.deposit(depositAmount);// adiciona o saldo de acc2

		// exibe os saldos
		System.out.printf("%s balance: $%.2f %n", acc1.getName(), acc1.getBalance());
		System.out.printf("%s balance: $%.2f %n", acc2.getName(), acc2.getBalance());

		sc.close();
	}
}// fim da classe AccountTest
