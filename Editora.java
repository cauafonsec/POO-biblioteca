package Biblioteoca.domain;

public class Editora {

//	Caua da Fonseca RA:2417685

	private int id;
	private String nome;

	public Editora() {

	}

	public Editora(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Editora: " + nome;
	}

}
