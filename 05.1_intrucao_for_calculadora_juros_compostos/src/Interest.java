
public class Interest {
	
	public static void main(String[] args) {
		double amount;
		double principal = 1000.0;
		double rate = 0.05;

		//exibe cabeçalhos
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
		
		//cacula a quantidade de depósito para cada um dos dez anos
		for(int year =1; year <= 10; ++year) {
			//calcula nova quantidade durante ano especificado
			amount = principal * Math.pow(1.0 + rate, year);
			
			//exibe o ano e a quantidade
			System.out.printf("%4d%, 20.2f%n", year, amount);
		}
	}

}//fim da classe Interest
