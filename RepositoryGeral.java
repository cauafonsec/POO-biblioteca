//Caua Da Fonseca  RA:2417685

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class RepositoryGeral extends JFrame {

	public static RepositoryGeral repoGeral;

	private RepositoryGeral() {
		initComponents();
	}

	public static RepositoryGeral getRepoGeral() {
		if (repoGeral == null) {
			repoGeral = new RepositoryGeral();
		}
		return repoGeral;
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new JScrollPane();
		tabPes2 = new JTable();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowActivated(WindowEvent evt) {
				formWindowActivated(evt);
			}
		});

		tabPes2.setModel(
				new DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "ID", "CPF", "NOME", "IDADE" }));
		tabPes2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt) {
			}
		});
		jScrollPane1.setViewportView(tabPes2);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(41, 41, 41)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 307, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(52, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(51, 51, 51)
						.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(76, Short.MAX_VALUE)));

		pack();

	}

	protected void formWindowActivated(WindowEvent evt) {
		listarTabela();

	}

	public void listarTabela() {
		DefaultTableModel tabModel = (DefaultTableModel) tabPes2.getModel();
		int posLin = 0;
		tabModel.setRowCount(posLin);

		for (Pessoa p : Banco.getBanco().getBdPes()) {
			p.setId(posLin);
			tabModel.insertRow(posLin, new Object[] { p.getId(), p.getCpf(), p.getNome(), p.getIdade() });
			posLin++;
		}

	}

	private JScrollPane jScrollPane1;
	private JTable tabPes2;
}
