//Caua Da Fonseca  RA:2417685

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Principal extends JFrame {

	public Principal() {

		initComponents();
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		JLabel rotPrincipal = new JLabel();
		JMenuBar bmPrincipal = new JMenuBar();
		JMenu mnPrincipal = new JMenu();
		JMenuItem mnItCadPes = new JMenuItem();
		JMenuItem mnItAlugLivro = new JMenuItem();
		JMenu jMenu1 = new JMenu();
		JMenuItem jInfo = new JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		rotPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 48));
		rotPrincipal.setText("Biblioteca");

		mnPrincipal.setText("Menu");

		mnItCadPes.setText("Cadastrar Pessoa");
		mnItCadPes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cadastroPessoa(evt);
			}
		});
		mnPrincipal.add(mnItCadPes);

		mnItAlugLivro.setText("Alugar Livros");
		mnItAlugLivro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Banco.getBanco().criarLivro();
				AlugarLivros.getAlugaLivros().setVisible(true);

			}
		});
		mnPrincipal.add(mnItAlugLivro);

		bmPrincipal.add(mnPrincipal);

		jMenu1.setText("Sobre");

		jInfo.setText("Info");
		jInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				SobreInfo(evt);
			}
		});
		bmPrincipal.add(jMenu1);

		jMenu1.add(jInfo);

		setJMenuBar(bmPrincipal);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addGap(23, 23, 23).addComponent(rotPrincipal).addContainerGap(56, Short.MAX_VALUE)));
		layout.setVerticalGroup(
				layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup()
						.addGap(139, 139, 139).addComponent(rotPrincipal).addContainerGap(122, Short.MAX_VALUE)));

		pack();
	}

	protected void SobreInfo(ActionEvent evt) {
		JOptionPane.showMessageDialog(null, "Projeto de aluguel de livros. \nAluno: Cauã da Fonseca\nRA:2417685",
				"Sobre", 1);

	}

	private void cadastroPessoa(ActionEvent evt) {
		InserirDados.getInseredados().setVisible(true);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new Principal().setVisible(true);
			}
		});

	}

}
