package application;
//a classe Account com um construtor que inicializa o nome e o balance.

//e método deposit que executa a validação.

public class Account {
	private String name; // Variável de instância
	private double balance; // Variável de instância

	// construtor recebe dois parâmetros
	public Account(String name, double balance) {
		this.name = name; // atribui name à variável name

		// valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance mantém seu valor inicial padrão
		if (balance > 0.0) {
			this.balance = balance;
		}
	}
	
	//método que deposita apenas uma quantia válida no saldo
	public void deposit (double depositAmount) {
		// se depositAmount for válido
		if (depositAmount > 0.0) {
			balance += depositAmount; //o adiciona ou saldo
		}
	}
	
	//método retorna o saldo da conta
	public double getBalance() {
		return balance;
	}

	// método para definir o nome
	public void setName(String name) {
		this.name = name;
	}

	// método para recuperar o nome
	public String getName() {
		return name; //retorna o name ao chamador
	}

}// fim da classe Account
