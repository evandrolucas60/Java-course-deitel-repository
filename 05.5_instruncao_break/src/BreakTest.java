//a instru��o break sai de uma instru��o for.
public class BreakTest {

	public static void main(String[] args) {
		int count; // vari�vel de controle tamb�m utilizada depois que o loop termina

		for (count = 1; count <= 10; count++) {
			if (count == 5) {
				break;
			}
			System.out.printf("%d", count);
		}
		System.out.printf("%nBroke out of the loop at count = %d%n", count);
	}
}
