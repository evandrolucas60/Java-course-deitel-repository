
public class GradeBook {
	private String courseName;// nome do curso
	private int[] grades; // array de notas de aluno

	// construtor
	public GradeBook(String courseName, int[] grades) {
		this.courseName = courseName;
		this.grades = grades;
	}

	// m�todo para configurar o nome do curso
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	// m�todo para recuperar o nome do curso
	public String getCourseName() {
		return courseName;
	}

	// realiza v�rias opera��es nos dados
	public void processGrades() {
		// gera sa�da de array de notas
		outputGrades();

		// chama m�todo getAverage para calcular a nota m�dia
		System.out.printf("%nClass average is %.2f%n", getAverage());

		// chama os m�todos getMinumum e getMaximum
		System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n", getMinimum(), getMaximum());

		// chama outputBarChart para imprimir o gr�fico
		outoutBarChart();
	}

	// localiza nota m�nima
	public int getMinimum() {
		int lowGrade = grades[0];// sup�e que grades[0] � a menor nota

		// faz um loop pelo array de notas
		for (int grade : grades) {
			if (grade < lowGrade) {
				lowGrade = grade;// nota mais baixa
			}
		}

		return lowGrade;
	}

	// localiza nota m�xima
	public int getMaximum() {
		int highGrade = grades[0];// sup�e que grades[0] � a maior nota

		// faz um loop pelo array de notas
		for (int grade : grades) {
			if (grade > highGrade) {
				highGrade = grade;// nota mais alta
			}
		}

		return highGrade;
	}

	// determina a m�dia para o teste
	public double getAverage() {
		int total = 0;

		// soma notas de um aluno
		for (int grade : grades) {
			total += grade;
		}
		return (double) total / grades.length;
	}

	// gera a sa�da do gr�fico de barras
	public void outoutBarChart() {
		System.out.println("Grad distribuition:");

		// armazena frequ�ncia de notas em cada intervalo de 10 notas
		int[] frequency = new int[11];

		// para cada nota, incrementa a frequ�ncia apropriada
		for (int grade : grades) {
			++frequency[grade / 10];
		}

		// para cada frequ�ncia de nota, imprime barra no gr�fico
		for (int count = 0; count < frequency.length; count++) {

			// gera sa�da do r�tulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
			if (count == 10) {
				System.out.printf("%5d: ", 100);
			} else {
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
			}

			// imprime a barra de asteriscos
			for (int stars = 0; stars < frequency[count]; stars++) {
				System.out.print("*");

			}

			System.out.println();
		}
	}

	// gera saida do conte�do do array de notas
	public void outputGrades() {
		System.out.printf("The grades are:%n%n");

		// gera a sa�da da nota de cada aluno
		for (int student = 0; student < grades.length; student++) {
			System.out.printf("Student %2d: %3d%n", student + 1, grades[student]);
		}
	}

}// fim da class GradeBook
