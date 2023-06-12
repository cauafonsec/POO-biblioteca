//Caua Da Fonseca  RA:2417685

import java.awt.event.WindowEvent;

import javax.swing.JFrame;
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

		jScrollPane1 = new javax.swing.JScrollPane();
		tabPes2 = new javax.swing.JTable();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowActivated(java.awt.event.WindowEvent evt) {
				formWindowActivated(evt);
			}
		});

		tabPes2.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "ID", "CPF", "NOME", "IDADE" }));
		tabPes2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
			}
		});
		jScrollPane1.setViewportView(tabPes2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout
						.createSequentialGroup().addGap(41, 41, 41).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(52, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout
						.createSequentialGroup().addGap(51, 51, 51).addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
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

	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable tabPes2;
}
