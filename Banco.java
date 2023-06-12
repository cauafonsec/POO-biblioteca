//	Caua da Fonseca RA:2417685

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {

//			Criando os livros

	static Pessoa p = new Pessoa();
	static List<Pessoa> bdPes = new ArrayList<>();
	static List<Livro> l = new ArrayList<>();
	private static Banco bancoUnico;

	public static Banco getBanco() {
		if (bancoUnico == null) {
			bancoUnico = new Banco();
		}
		return bancoUnico;
	}

	public List<Pessoa> getBdPes() {
		return bdPes;
	}

	public static Pessoa consPesCpf(Pessoa p) {
		for (int i = 0; i < bdPes.size(); i++) {
			if (p.getCpf() == bdPes.get(i).getCpf()) {
				return bdPes.get(i);
			}
		}
		return null;
	}

	public static Pessoa cadPes(Pessoa p) {
		if (consPesCpf(p) == null) {
			bdPes.add(p);
			return p;
		}
		return null;
	}

	public List<Livro> criarLivro() {

		Editora e1 = new Editora(1, "cozinhar");
		Editora e2 = new Editora(2, "mecanico");

		Livro l1 = new Livro(1, "Culinaria", e1, 2022, 120);
		Livro l2 = new Livro(2, "Carros e Motos", e2, 2023, 300);

		l.addAll(Arrays.asList(l1, l2));

		return l;
	}

	public List<Livro> getBdLivros() {
		return l;
	}

	public void removerLivro(int parseInt) {
		l.remove(parseInt - 1);
	}

	public Pessoa buscarPessoa(String text) {
		for (Pessoa p : bdPes) {
			if (text.equals(p.getCpf())) {
				return p;
			}
		}
		return null;
	}

	public Livro buscarLivro(int text) {
		for (Livro l1 : l) {
			if (text == l1.getId()) {
				return l1;
			}
		}
		return null;
	}
}
