import java.util.Scanner;
//Anális dos resultados do exame utilizando instrucoes de controle aninhadas
public class Analysis {

	public static void main(String[] args) {
		//Cria Scanner para obter entrada a partir da janela de comando
		Scanner sc = new Scanner(System.in);
		
		//inicializando variaveis nas declarações 
		int passes = 0;
		int failures = 0;
		int studentCounter =1;
		
		//processa 10 alunos utilazando loop controlado por contador
		while(studentCounter <= 10) {
			//solicita entrada de usuário
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = sc.nextInt();
			
			//if...else aninhada na instrucao while
			if (result == 1) {
				passes += 1; 
			}else {
				failures += 1;
			}
			
			//incrementa o contador 
			studentCounter++;
		}
		
		//fase de término; prepara e exibe os resultados
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		//determina se mais de 8 alunos foram aprovados
		if (passes > 8) {
			System.out.println("Bonus to instructor!");
		}
		
		sc.close();
	}

}
