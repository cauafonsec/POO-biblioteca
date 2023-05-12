

import java.util.Scanner;

public class Cadastro {
//	Caua da Fonseca RA:2417685

	Scanner sc = new Scanner(System.in);

//	cadastro do tipo de pessoa

	public Pessoa Cadastrar(int i) {

		if (i == 1) {

			Aluno a1 = new Aluno();
			a1.setId(i);
			System.out.println("\nDigite seu cpf: ");
			a1.setCpf(sc.next());
			System.out.println("\nDigite seu nome: ");
			a1.setNome(sc.next());
			System.out.println("\nDigite sua idade: ");
			a1.setIdade(sc.nextInt());
			System.out.println("\nDigite seu curso matriculado: ");
			a1.setCurso(sc.next());
			System.out.println("\nDigite seu RA: ");
			a1.setRa(sc.nextInt());
			System.out.println("\nDigite seu ano de matricula: ");
			a1.setAnomatricula(sc.nextInt());
			return a1;

		} else if (i == 2) {

			Professor p1 = new Professor();
			p1.setId(i);
			System.out.println("\nDigite seu cpf: ");
			p1.setCpf(sc.next());
			System.out.println("\nDigite seu nome: ");
			p1.setNome(sc.next());
			System.out.println("\nDigite sua idade: ");
			p1.setIdade(sc.nextInt());
			System.out.println("\nDigite a materia que da aula: ");
			p1.setMateria(sc.next());
			System.out.println("\nDigite seu salario: ");
			p1.setSalario(sc.nextDouble());
			System.out.println("Esta dando aula ainda:");
			System.out.println("0-nao");
			System.out.println("1-sim");
			p1.setStatus(sc.hasNext());
			return p1;

		} else if (i == 3) {

			Funcionario f = new Funcionario();
			f.setId(i);
			System.out.println("\nDigite seu cpf: ");
			f.setCpf(sc.next());
			System.out.println("\nDigite seu nome: ");
			f.setNome(sc.next());
			System.out.println("\nDigite sua idade: ");
			f.setIdade(sc.nextInt());
			System.out.println("\nDigite sua area de atuacao: ");
			f.setArea(sc.next());
			System.out.println("\nDigite seu cargo: ");
			f.setCargo(sc.next());
			System.out.println("\nDigite o seu numero de registro");
			f.setRegistro(sc.nextInt());
			return f;
		}

		return null;

	}

}
