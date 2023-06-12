//Caua Da Fonseca  RA:2417685

public class EntradaInvalidaException extends Exception {

	private static final long serialVersionUID = 1L;

	public EntradaInvalidaException() {

	}

	public void msg() {
		System.out.println("opção inválida, selecione um número inteiro, tente novamente.");
	}
}
