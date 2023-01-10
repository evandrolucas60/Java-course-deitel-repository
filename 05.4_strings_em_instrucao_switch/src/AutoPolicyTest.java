//Demostrando Strings em um Switch
public class AutoPolicyTest {

	public static void main(String[] args) {
		//cria dois objetos AutoPolicy
		AutoPolicy policy1 = new AutoPolicy(1111111, "Toyota Camry", "NJ");
		AutoPolicy policy2 = new AutoPolicy(2222222, "Ford Fusion", "ME");
		
		//exibe se cada ap�lice est� em um estado "sem culpa"
		policyInNoFaultState(policy1);
		policyInNoFaultState(policy2);

	}
	
	//m�todo que mostra se um AutoPolicy
	//est� em um estado com seguro de autom�vel "sem culpa"
	public static void policyInNoFaultState(AutoPolicy policy) {
		System.out.println("The auto policy:");
		System.out.printf("Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(), (policy.isNoFaultState() ? "is" : "is not"));
	}

}//fim da Classe AutoPolicyTest
