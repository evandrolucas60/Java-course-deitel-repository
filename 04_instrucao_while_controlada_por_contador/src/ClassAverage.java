import java.util.Scanner;
//Resovendo o problema da média da classe usando repeticao
//controlada po contador
public class ClassAverage {

	public static void main(String[] args) {
		//cria um Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);
		
		//fase de inicialização
		int total = 0; //inicializa a soma das notas inseridas pelo usuário
		int gradeCounter = 1;//inicializa nº da nota a ser enserido em seguida
		
		//fase de processamento utiliza repetição controlada por contador
		while(gradeCounter <=10) { //faz o loop 10 vezes
			System.out.print("Enter grade: ");//prompt
			int grade = sc.nextInt();//insere a próxima nota
			total += grade;//adiciona grade a total
			gradeCounter ++;//incrementa o contador por 1
		}
		
		//fase de término
		int average = total/10; //divisão de inteiros produz resultado inteiro
		
		//exibe o total e a média das notas
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
		
		sc.close();
	}

}//fim da classe ClassAverage
