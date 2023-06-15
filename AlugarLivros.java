//Caua Da Fonseca  RA:2417685

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.time.OffsetDateTime;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
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

		jScrollPane1 = new JScrollPane();
		tabLivros = new JTable();
		jLabelId = new JLabel();
		JInfo = new JButton();
		Alugar = new JButton();
		jLabelCPF = new JLabel();
		cxCpf = new JTextField();
		cxiD = new JTextField();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent evt) {
			}
		});

		tabLivros
				.setModel(new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "ID", "EDITORA", "TITULO", "ANO" }));
		tabLivros.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
				tabLivrosMouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(tabLivros);

		jLabelId.setText("ID:");

		JInfo.setText("Informaçoes");
		JInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				JInfoActionPerformed(evt);
			}
		});

		Alugar.setText("Alugar");
		Alugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				AlugarActionPerformed(evt);
			}
		});

		jLabelCPF.setText("CPF:");

		cxCpf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			}
		});

		cxiD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addGroup(layout
								.createSequentialGroup().addGap(27, 27, 27)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(jLabelCPF).addComponent(jLabelId, GroupLayout.Alignment.TRAILING))
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(cxCpf, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
										.addComponent(cxiD, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE))
								.addGap(0, 0, Short.MAX_VALUE)).addGroup(
										layout.createSequentialGroup().addContainerGap().addComponent(JInfo)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 174,
														Short.MAX_VALUE)
												.addComponent(Alugar))))
				.addContainerGap(31, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(
				GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabelCPF)
								.addComponent(cxCpf, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGap(21, 21, 21)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(jLabelId)
								.addComponent(cxiD, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGap(31, 31, 31)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
						.addGap(33, 33, 33).addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(JInfo).addComponent(Alugar))
						.addContainerGap()));

		pack();
	}

	protected void JInfoActionPerformed(ActionEvent evt) {
		JOptionPane.showMessageDialog(null,
				"Para Alugar um livro digite o cpf do cliente e o id do livro que conta na tabela,\n de dois cliques na tabela e aparecera os livros",
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
				JOptionPane.showMessageDialog(null, "Esta Pessoa nao existe ou cpf errado!", "Erro", 1);
			}
			Livro l = Banco.getBanco().buscarLivro(Integer.parseInt(cxiD.getText()));
			if (l == null) {
				JOptionPane.showMessageDialog(null, "Este Livro nao existe ou ja foi alugado!", "Erro", 1);
			}
			e.getLivro().add(l);
			e.setPessoa(p);

			if (e != null) {
				JOptionPane.showMessageDialog(null,
						"Livro Alugado com sucesso!\nNome da Pessoa:" + p.getNome() + "\nLivro Alugado: "
								+ l.getTitulo() + "\nData devolução: " + OffsetDateTime.now().plusDays(7).toLocalDate(),
						"Alugar", 1);
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

	private JButton Alugar;
	private JButton JInfo;
	private JLabel jLabelCPF;
	private JLabel jLabelId;
	private JScrollPane jScrollPane1;
	private JTable tabLivros;
	private JTextField cxCpf;
	private JTextField cxiD;

}
