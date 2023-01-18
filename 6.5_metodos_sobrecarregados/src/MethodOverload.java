//Declarações de métodos sobrecarregados
public class MethodOverload {

	public static void main(String[] args) {
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square of double 7.5 is %f%n", square(7.5));

	}

	// método square com argumento int
	public static int square(int intValue) {
		System.out.printf("%nCalled squere with int argument: %d%n", intValue);
		return intValue * intValue;
	}

	// método square com argumento double
	public static double square(double doubleValue) {
		System.out.printf("%nCalled squere with double argument: %f%n", doubleValue);
		return doubleValue * doubleValue;
	}
}//fim da Classe MethodOverload
