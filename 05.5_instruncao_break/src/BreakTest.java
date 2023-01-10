//a instrução break sai de uma instrução for.
public class BreakTest {

	public static void main(String[] args) {
		int count; // variável de controle também utilizada depois que o loop termina

		for (count = 1; count <= 10; count++) {
			if (count == 5) {
				break;
			}
			System.out.printf("%d", count);
		}
		System.out.printf("%nBroke out of the loop at count = %d%n", count);
	}
}
