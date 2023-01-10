import java.util.Scanner;

//Resolvendo o problema da m�dia da classe usando a repeticao controlada
//por sentinela.

public class ClassAverage {

	public static void main(String[] args) {
		//cria Scanner para obter entrada do prompt
		Scanner sc = new Scanner(System.in);
		
		//fase de inicializa��o de vari�vel
		int total = 0;
		int gradeCounter = 0;
		
		//fase de processamento
		//solicta a entrada do usu�rio
		System.out.print("Enter grade or -1 to quit: ");
		int grade = sc.nextInt();
		
		//faz um loop at� ler o valor de sentinela inserido
		while(grade != -1) {
			total += grade;
			gradeCounter++;
			//solicta a entrada do usu�rio
			System.out.print("Enter grade or -1 to quit: ");
			grade = sc.nextInt();
		}
		
		//fase de t�rmino
		if (gradeCounter != 0) {
			//usa n�mero de ponto flutuante para calcular as m�dias
			double average = (double) total/gradeCounter;
			
			//exibe o total e a m�dia (com dois digitos de precis�o)
			System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		} else {
			System.out.println("No grades entered");
		}
		sc.close();
	}
}//fim da classe ClassAverage
