

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Banco {
//	Caua da Fonseca RA:2417685

//			Criando os livros

	public List<Livro> criarLivro() {

		Editora e1 = new Editora(1, "cozinhar");
		Editora e2 = new Editora(2, "mecanico");

		Livro l1 = new Livro(1, "Culinaria", e1, 2022, 120);
		Livro l2 = new Livro(2, "Carros e Motos", e2, 2023, 300);

		List<Livro> livros = new ArrayList<>();
		livros.addAll(Arrays.asList(l1, l2));

		return livros;
	}

}
