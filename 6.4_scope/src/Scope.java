
//A classe Scope demonstra os escopos de campo e de vari�vel local.
public class Scope {

	//campo acess�vel para todos os m�todos dessa classe
	private static int x = 1;
	
	//O m�todo main cria e inicializa a vari�vel local x
	//e chama os m�todos useLocalVariable e useField
	public static void main(String[] args) 
	{
	int x = 5; //variable local x do m�todo sombreia o campo x
	
	System.out.printf("local x in main is %d%n", x);
	
	useLocalVariable();//tem a variav�l local x
	useField();//usa o campo x da classe Scope
	useLocalVariable();//reinicializa a vari�vel local x
	useField();//campo x da classe Scope r�tem seu valor

	System.out.printf("%nlocal x in main is %d%n", x);
	}
	
	//cria e incializa a vari�vel local x durante cada chamada
	public static void useLocalVariable()
	{
		int x = 25; //inicializada toda vez que est� m�todo for chamado
		
		System.out.printf(
				"%nlocal x on entering method useLocalVariable is %d%n", x);
		++x;//modifica a vari�vel local x desse m�todo
		System.out.printf(
				"local x before exiting method useLocalVariable is %d%n", x);
		
	}
	
	public static void useField() 
	{
		System.out.printf(
				"%nfield x on entering method useField is %d%n", x);
		x *= 10; //modifica o campo x da classe Scope
		System.out.printf(
				"field x before exiting useField is %d%n", x);
	}

}//fim da classe Scope
