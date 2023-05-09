package Biblioteoca.domain;

public class EntradaInvalidaException extends Exception {

//	Caua da Fonseca RA:2417685

	private static final long serialVersionUID = 1L;

	public EntradaInvalidaException() {

	}

	public void msg() {
		System.out.println("opção inválida, selecione um número inteiro, tente novamente.");
	}
}
