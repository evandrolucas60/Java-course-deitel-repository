//instru??o continue termina uma itera??o de uma instru??o for.
public class ContinueTest {

	public static void main(String[] args) {
		for(int count = 1; count <= 10; count++) {
			if (count == 5) {
				continue;//pula o c?digo restante no corpo do loop se a contagem for 5
			}
			System.out.printf("%d ", count);
		}
		System.out.printf("%nUsed continue to skip printing 5%n");

	}

}//Fim da Classe ContinueTest
