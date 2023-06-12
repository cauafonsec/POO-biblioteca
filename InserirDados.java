//Caua Da Fonseca  RA:2417685

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		rotCpf = new javax.swing.JLabel();
		rotNome = new javax.swing.JLabel();
		cxCpf = new javax.swing.JTextField();
		cxNome = new javax.swing.JTextField();
		btSair = new javax.swing.JButton();
		btInsPes = new javax.swing.JButton();
		btClientes = new javax.swing.JButton();
		rotIdade = new javax.swing.JLabel();
		cxIdade = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		rotCpf.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		rotCpf.setText("CPF: ");

		rotNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		rotNome.setText("NOME: ");

		cxCpf.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cxCpfActionPerformed(evt);
			}
		});

		cxNome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cxNomeActionPerformed(evt);
			}
		});

		btSair.setText("Sair");
		btSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btSairActionPerformed(evt);
			}
		});

		btInsPes.setText("Inserir");
		btInsPes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btInsPesActionPerformed(evt);
			}
		});

		btClientes.setText("Clientes");
		btClientes.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btClientesActionPerformed(evt);
			}
		});

		rotIdade.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		rotIdade.setText("Idade:");

		cxIdade.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cxIdadeActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(20, 20, 20)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(btSair)
						.addComponent(rotNome).addComponent(rotCpf).addComponent(rotIdade))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(cxNome, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
								.addComponent(cxCpf)
								.addComponent(cxIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)).addGroup(
								layout.createSequentialGroup().addGap(0, 285, Short.MAX_VALUE).addComponent(btClientes)
										.addGap(18, 18, 18).addComponent(btInsPes).addGap(24, 24, 24)))));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(24, 24, 24)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(rotCpf).addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cxNome, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(rotNome, javax.swing.GroupLayout.Alignment.TRAILING))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(rotIdade).addComponent(cxIdade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btClientes).addComponent(btSair).addComponent(btInsPes))
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

	private void cxIdadeActionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub

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
