

import java.time.OffsetDateTime;
import java.util.List;
import java.util.Scanner;

public class EmprestimoService implements ValidaLivro {
//	Caua da Fonseca RA:2417685

	// interface para o usuario entrar com o livro que gostaria de alugar
	Scanner sc = new Scanner(System.in);

	public void emprestar(Pessoa p, List<Livro> livros) {

		// interface para o usuario entrar com o livro que gostaria de alugar

		System.out.println("\n\nOla " + p.getNome() + ", deseja alugar qual livro: ");
		for (Livro l : livros) {
			System.out.println(l);
		}
		System.out.println("\n\n(selecione pelo id do livro ou 0 para sair): ");
		Emprestimo emp1 = new Emprestimo();

		try {
			int escolher = lerInt(sc);

			switch (escolher) {
			case 1:
				emp1.setPessoa(p);
				emp1.setLivro(livros.get(0));
				livros.remove(escolher);

				break;
			case 2:
				emp1.setPessoa(p);
				emp1.setLivro(livros.get(1));
				livros.remove(escolher);
				break;
			case 0:
				System.out.println("\n\nAté mais!!!");
				break;
			default:
				break;
			}

//			dados do usuario e do livro que alugou junto com a data limite de devolucao

			if (escolher != 0) {
				System.out.println("\n\nData de retirada: " + OffsetDateTime.now());
				System.out.println("\nData de limite de devolução: " + OffsetDateTime.now().plusDays(7));
				System.out.println("\n" + emp1);
			}

		} catch (EntradaInvalidaException e) {
			e.msg();
		}

//		System.out.println("\n\nDeseja alugar outro Livro? ");
		System.out.println("\n\nLivros restantes " + verifQuantLivros(livros) + ".");
//		System.out.println("1-SIM\n2-NAO");
//		int escolha = sc.nextInt();
//		if (escolha == 1) {
//			emprestar(p, livros);
//		} else {
//			System.out.println("Ate a proxima!");
//		}

	}

	public static int lerInt(Scanner sc) throws EntradaInvalidaException {
		if (!sc.hasNextInt()) {
			throw new EntradaInvalidaException();
		}
		return sc.nextInt();
	}

//	sobrescrita
	@Override
	public int verifQuantLivros(List<Livro> l) {
		int i = l.size();
		return i;
	}

}
