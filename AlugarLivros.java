//Caua Da Fonseca  RA:2417685

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AlugarLivros extends JFrame {

	public static AlugarLivros aluga;

	public static AlugarLivros getAlugaLivros() {
		if (aluga == null) {
			aluga = new AlugarLivros();
		}
		return aluga;
	}

	private AlugarLivros() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		tabLivros = new javax.swing.JTable();
		jLabelId = new javax.swing.JLabel();
		JInfo = new javax.swing.JButton();
		Alugar = new javax.swing.JButton();
		jLabelCPF = new javax.swing.JLabel();
		cxCpf = new javax.swing.JTextField();
		cxiD = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowActivated(java.awt.event.WindowEvent evt) {
			}
		});

		tabLivros
				.setModel(new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "ID", "EDITORA", "TITULO", "ANO" }));
		tabLivros.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tabLivrosMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(tabLivros);

		jLabelId.setText("ID:");

		JInfo.setText("Informaçoes");
		JInfo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JInfoActionPerformed(evt);
			}
		});

		Alugar.setText("Alugar");
		Alugar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				AlugarActionPerformed(evt);
			}
		});

		jLabelCPF.setText("CPF:");

		cxCpf.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			}
		});

		cxiD.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup().addGap(27, 27, 27)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabelCPF)
												.addComponent(jLabelId, javax.swing.GroupLayout.Alignment.TRAILING))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(cxiD, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(0, 0, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(JInfo)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174,
												Short.MAX_VALUE)
										.addComponent(Alugar))))
				.addContainerGap(31, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelCPF).addComponent(cxCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelId).addComponent(cxiD, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(31, 31, 31)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(33, 33, 33)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(JInfo).addComponent(Alugar))
						.addContainerGap()));

		pack();
	}

	protected void JInfoActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(null,
				"Para Alugar um livro digite o cpf do cliente e o id do livro que conta na tabela, de dois cliques na tabela e aparecera os livros",
				"info", 1);
	}

	protected void AlugarActionPerformed(ActionEvent evt) {
		AlugarLivro();
	}

	private void AlugarLivro() {
		try {
			Emprestimo e = new Emprestimo();
			Pessoa p = Banco.getBanco().buscarPessoa(cxCpf.getText());
			if (p == null) {
				lancarErro("Esta Pessoa nao existe ou cpf errado!");
			}
			Livro l = Banco.getBanco().buscarLivro(Integer.parseInt(cxiD.getText()));
			if (l == null) {
				lancarErro("Este Livro nao existe ou ja foi alugado!");
			}
			e.setLivro(l);
			e.setPessoa(p);

			if (e != null) {
				JOptionPane.showMessageDialog(null, "Livro Alugado com sucesso", "Alugar", 1);
				Banco.getBanco().removerLivro(Integer.parseInt(cxiD.getText()));
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Algo deu errado", "Erro", 1);
		}

	}

	protected void tabLivrosMouseClicked(MouseEvent evt) {
		listarLivros();
	}

	public void listarLivros() {
		DefaultTableModel tabModel = (DefaultTableModel) tabLivros.getModel();
		int posLin = 0;
		tabModel.setRowCount(posLin);

		for (Livro l : Banco.getBanco().getBdLivros()) {

			tabModel.insertRow(posLin, new Object[] { l.getId(), l.getEditora(), l.getTitulo(), l.getAno() });
			posLin++;
		}

	}

	private void lancarErro(String string) {
		try {
			Integer i = 0;
			Integer res = 10 / i;
		} catch (Exception e) {
			throw new MsgErro(string);

		}
	}

	private javax.swing.JButton Alugar;
	private javax.swing.JButton JInfo;
	private javax.swing.JLabel jLabelCPF;
	private javax.swing.JLabel jLabelId;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tabLivros;
	private javax.swing.JTextField cxCpf;
	private javax.swing.JTextField cxiD;

}
