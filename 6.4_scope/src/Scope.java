
//A classe Scope demonstra os escopos de campo e de variável local.
public class Scope {

	//campo acessível para todos os métodos dessa classe
	private static int x = 1;
	
	//O método main cria e inicializa a variável local x
	//e chama os métodos useLocalVariable e useField
	public static void main(String[] args) 
	{
	int x = 5; //variable local x do método sombreia o campo x
	
	System.out.printf("local x in main is %d%n", x);
	
	useLocalVariable();//tem a variavél local x
	useField();//usa o campo x da classe Scope
	useLocalVariable();//reinicializa a variável local x
	useField();//campo x da classe Scope rétem seu valor

	System.out.printf("%nlocal x in main is %d%n", x);
	}
	
	//cria e incializa a variável local x durante cada chamada
	public static void useLocalVariable()
	{
		int x = 25; //inicializada toda vez que esté método for chamado
		
		System.out.printf(
				"%nlocal x on entering method useLocalVariable is %d%n", x);
		++x;//modifica a variável local x desse método
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
