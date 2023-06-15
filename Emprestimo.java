import java.util.ArrayList;
import java.util.List;

//Caua Da Fonseca  RA:2417685

public class Emprestimo {

	private int id;
	private Pessoa pessoa;
	private List<Livro> livro = new ArrayList<Livro>();

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

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

}
