//classe que representa uma ap?lice de seguro de autom?vel
public class AutoPolicy {

	private int accountNumber;//n?mero da conta da ap?lice
	private String makeAndModel; //carro ao qual a ap?lice ? aplicada
	private String state;//abreviatura do estado com duas letras
	
	//construtor
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getMakeAndModel() {
		return makeAndModel;
	}

	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//m?todo predicado ? retornado se o estado tem seguros "sem culpa"
	public boolean isNoFaultState() {
		boolean noFaultState;
		
		//determina se o estado tem seguros de autom?vel "sem culpa"
		switch (getState()) {
		case "MA": case "NJ": case "NY": case "PA":
			noFaultState = true;
			break;

		default:
			noFaultState = false;
			break;
		}
		
		return noFaultState;
	}
	
}
