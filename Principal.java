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
		JMenuItem mnItRelGerPes = new JMenuItem();
		JMenu jMenu2 = new JMenu();
		JMenuItem jMenuItem1 = new JMenuItem();
		JMenu jMenu1 = new JMenu();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		rotPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
		rotPrincipal.setText("Biblioteca");

		mnPrincipal.setText("Menu");

		mnItCadPes.setText("Cadastrar Pessoa");
		mnItCadPes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				cadastroPessoa(evt);
			}
		});
		mnPrincipal.add(mnItCadPes);

		mnItRelGerPes.setText("Alugar Livros");
		mnItRelGerPes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				Banco.getBanco().criarLivro();
				AlugarLivros.getAlugaLivros().setVisible(true);

			}
		});
		mnPrincipal.add(mnItRelGerPes);

		bmPrincipal.add(mnPrincipal);

		jMenu1.setText("Sobre");
		bmPrincipal.add(jMenu1);

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
