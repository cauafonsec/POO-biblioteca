
import java.util.Scanner;

public class InserirDados {
//	Caua da Fonseca RA:2417685

	public void inserirDados() {
		Scanner sc = new Scanner(System.in);
		Banco b = new Banco();
		int value = sc.nextInt();

		switch (value) {
		case 1:
			System.out.println("\nIremos fazer um cadastro seu:");
			System.out.println("voce e:");
			System.out.println("1-Aluno");
			System.out.println("2-Professor");
			System.out.println("3-Funcionario");

			int tipo = sc.nextInt();

			Cadastro cadastro = new Cadastro();

			Pessoa p = cadastro.Cadastrar(tipo);
			if (p != null) {
				System.out.println("Cadastro feito com sucesso:");
				System.out.println(p);
				EmprestimoService emp = new EmprestimoService();
				emp.emprestar(p, b.criarLivro());

			} else {
				System.out.println("\nVoce nao escolheu um tipo de pessoa tente novamente!");

			}

			break;

		case 2:
			System.out.println("Teve atraso: ");
			System.out.println("1-Sim");
			System.out.println("2-Nao");
			int atraso = sc.nextInt();

			if (atraso == 1) {
				System.out.println("\nQuantos dias(valor de 2 reais por dia de atraso): ");
				int dias = sc.nextInt();
				dias = dias * 2;
				System.out.println("\nSua Multa foi de: " + dias + " reais.");
			}

			System.out.println("\nVolte sempre.");

			break;
		case 3:
			System.out.println("\nVolte sempre.");
			break;

		default:
			break;
		}
		sc.close();
	}

}
