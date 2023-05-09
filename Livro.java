package Biblioteoca.domain;

public class Livro {

	
//	Caua da Fonseca RA:2417685

	private int id;
	private String titulo;
	private Editora editora;
	private int ano;
	private int paginas;

	public Livro() {

	}

	public Livro(int id, String titulo, Editora editora, int ano, int paginas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.editora = editora;
		this.ano = ano;
		this.paginas = paginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "\nLivro: \nid: " + id + ", titulo: " + titulo + ", " + editora + ", ano: " + ano + ", paginas: "
				+ paginas;
	}

}
