//Caua Da Fonseca  RA:2417685

public class Emprestimo {

	private int id;
	private Pessoa pessoa;
	private Livro livro;

	public Emprestimo() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Emprestimo: \n" + pessoa + livro;
	}

}
