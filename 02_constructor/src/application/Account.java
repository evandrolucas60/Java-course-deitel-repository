package application;
//a classe Account com um construtor que inicializa o nome e o balance.

//e m�todo deposit que executa a valida��o.

public class Account {
	private String name; // Vari�vel de inst�ncia
	private double balance; // Vari�vel de inst�ncia

	// construtor recebe dois par�metros
	public Account(String name, double balance) {
		this.name = name; // atribui name � vari�vel name

		// valida que o balance � maior que 0.0; se n�o for,
		// a vari�vel de inst�ncia balance mant�m seu valor inicial padr�o
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	//m�todo que deposita apenas uma quantia v�lida no saldo
	public void deposit (double depositAmount) {
		// se depositAmount for v�lido
		if (depositAmount > 0.0) {
			balance += depositAmount; //o adiciona ou saldo
		}
	}
	
	//m�todo retorna o saldo da conta
	public double getBalance() {
		return balance;
	}

	// m�todo para definir o nome
	public void setName(String name) {
		this.name = name;
	}

	// m�todo para recuperar o nome
	public String getName() {
		return name; //retorna o name ao chamador
	}

}// fim da classe Account
