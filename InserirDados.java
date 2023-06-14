//Caua Da Fonseca  RA:2417685

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class InserirDados extends JFrame {

	Pessoa pe = new Pessoa();

	private static InserirDados inseredados;

	public static InserirDados getInseredados() {
		if (inseredados == null) {
			inseredados = new InserirDados();
		}
		return inseredados;
	}

	private InserirDados() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		rotCpf = new JLabel();
		rotNome = new JLabel();
		cxCpf = new JTextField();
		cxNome = new JTextField();
		btSair = new JButton();
		btInsPes = new JButton();
		btClientes = new JButton();
		rotIdade = new JLabel();
		cxIdade = new JTextField();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

		rotCpf.setFont(new java.awt.Font("Segoe UI", 1, 18));
		rotCpf.setText("CPF: ");

		rotNome.setFont(new java.awt.Font("Segoe UI", 1, 18));
		rotNome.setText("NOME: ");

		cxCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cxCpfActionPerformed(evt);
			}
		});

		cxNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cxNomeActionPerformed(evt);
			}
		});

		btSair.setText("Sair");
		btSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btSairActionPerformed(evt);
			}
		});

		btInsPes.setText("Inserir");
		btInsPes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btInsPesActionPerformed(evt);
			}
		});

		btClientes.setText("Clientes");
		btClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btClientesActionPerformed(evt);
			}
		});

		rotIdade.setFont(new java.awt.Font("Segoe UI", 1, 18));
		rotIdade.setText("Idade:");

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(20, 20, 20)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(btSair)
								.addComponent(rotNome).addComponent(rotCpf).addComponent(rotIdade))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addComponent(cxNome, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
												.addComponent(cxCpf)
												.addComponent(cxIdade, GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
										.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addGap(0, 285, Short.MAX_VALUE)
										.addComponent(btClientes).addGap(18, 18, 18).addComponent(btInsPes)
										.addGap(24, 24, 24)))));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(24, 24, 24)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addComponent(rotCpf)
						.addComponent(cxCpf, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(cxNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(rotNome, GroupLayout.Alignment.TRAILING))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(rotIdade)
						.addComponent(cxIdade, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(btClientes)
						.addComponent(btSair).addComponent(btInsPes))
				.addContainerGap()));

		pack();
	}

	private void cxCpfActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	private void cxNomeActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

	}

	private void limpar() {

		cxCpf.setText("");
		cxNome.setText("");
		cxIdade.setText("");
		cxCpf.requestFocus();

	}

	private void btInsPesActionPerformed(ActionEvent evt) {
		criarPessoa();
		limpar();
	}

	private void criarPessoa() {
		try {
			pe = new Pessoa();

			pe.setCpf(cxCpf.getText());
			pe.setNome(cxNome.getText());
			pe.setIdade(Integer.parseInt(cxIdade.getText()));

			pe = Banco.getBanco().cadPes(pe);

			if (pe != null) {
				JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso!", "Cadastro", 1);
			} else {
				JOptionPane.showMessageDialog(null, "CPF ja cadastrado", "Cadastro", 1);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Fez Algo de Errado ai.", "ERRO", 1);
		}
	}

	private void btClientesActionPerformed(ActionEvent evt) {
		RepositoryGeral.getRepoGeral().setVisible(true);

	}

	private void btSairActionPerformed(ActionEvent evt) {
		int resp = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair", JOptionPane.YES_NO_OPTION);
		if (resp == 0) {
			System.exit(0);
		}
	}

	private JButton btClientes;
	private JButton btInsPes;
	private JButton btSair;
	private JTextField cxCpf;
	private JTextField cxIdade;
	private JTextField cxNome;
	private JLabel rotCpf;
	private JLabel rotIdade;
	private JLabel rotNome;

}
