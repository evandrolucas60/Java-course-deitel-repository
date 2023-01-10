package application;
// cria e manipula um objeto Account.

import java.util.Scanner;

public class AccountTest {

	/*
	 * a palavra-chave static (linha 13), que indica que main � um m�todo static. O
		m�todo static � especial, porque voc� pode cham�-lo sem antes criar um objeto da classe na qual esse m�todo � declarado �
		nesse caso, a classe AccountTest.
	 */
	public static void main(String[] args) {
		//Cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);
		
		//cria um objeto Account e o atribui a myAccount
		Account myAccount = new Account();
		
		//exibe o valor inicial do nome (null)
		System.out.printf("Initial name is: %s%n%n", myAccount.getName());
		
		//solicita e l� o nome
		System.out.println("Please enter the name:");
		String theName = sc.nextLine(); //l� uma linha de texto
		myAccount.setName(theName);//insere theName em myAccount
		System.out.println();//gera sa�do de uma linha em branco
		
		//exibe o nome armazenado no objeto myAccount
		System.out.printf("Name in object myAccount is %n%s%n", myAccount.getName());
		
		sc.close();
	}
}//Fim da AccountTest
