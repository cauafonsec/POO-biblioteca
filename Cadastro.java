//Caua Da Fonseca  RA:2417685

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Cadastro extends JFrame {

	private static Cadastro cadastroUnico;

	public static Cadastro getCadastro() {
		if (cadastroUnico == null) {
			cadastroUnico = new Cadastro();
		}
		return cadastroUnico;
	}

	private Cadastro() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		JButton Sair = new JButton();
		JTextField Nome = new JTextField();
		JTextField cpf = new JTextField();
		JTextField jTextField1 = new JTextField();
		JButton Cadastrar1 = new JButton();

		Sair.setText("Sair");
		Sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				SairActionPerformed(evt);
			}
		});

		Nome.setText("Nome");

		cpf.setText("CPF");

		jTextField1.setText("Idade");

		Cadastrar1.setText("Cadastrar");
		Cadastrar1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CadastrarActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addComponent(Nome, GroupLayout.PREFERRED_SIZE,
						GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addComponent(cpf, GroupLayout.PREFERRED_SIZE,
						GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createSequentialGroup().addGap(6, 6, 6).addComponent(jTextField1,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGroup(layout.createSequentialGroup().addGap(199, 199, 199)
						.addComponent(Sair, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18).addComponent(Cadastrar1)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(37, 37, 37)
				.addComponent(Nome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(12, 12, 12)
				.addComponent(cpf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(12, 12, 12)
				.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
						GroupLayout.PREFERRED_SIZE)
				.addGap(108, 108, 108).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(Sair).addComponent(Cadastrar1))));

		pack();
	}

	protected void SairActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	protected void NomeActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	protected void CadastrarActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	public void Cadastrar(int i) {

//		try {

//			if (i == 1) {
//
//				Aluno a1 = new Aluno();
//				a1.setId(i);
//				a1.setCpf(sc.next());
//				a1.setNome(sc.next());
//				a1.setIdade(sc.nextInt());
//				a1.setCurso(sc.next());
//				a1.setRa(sc.nextInt());
//				a1.setAnomatricula(sc.nextInt());
//
//			} else if (i == 2) {
//
//				Professor p1 = new Professor();
//				p1.setId(i);
//				p1.setCpf(sc.next());
//				p1.setNome(sc.next());
//				p1.setIdade(sc.nextInt());
//				p1.setMateria(sc.next());
//				p1.setSalario(sc.nextDouble());
//				p1.setStatus(sc.hasNext());
//
//			} else if (i == 3) {
//
//				Funcionario f = new Funcionario();
//				f.setId(i);
//				f.setCpf(sc.next());
//				f.setNome(sc.next());
//				f.setIdade(sc.nextInt());
//				f.setArea(sc.next());
//				f.setCargo(sc.next());
//				f.setRegistro(sc.nextInt());
//			}
//		} catch (Exception e) {
//			lancarErro("Valor invalido!");
//		}

	}

	private void lancarErro(String string) {
		try {
			Integer i = 0;
			Integer res = 10 / i;
		} catch (Exception e) {
			throw new MsgErro(string);

		}

	}

}
