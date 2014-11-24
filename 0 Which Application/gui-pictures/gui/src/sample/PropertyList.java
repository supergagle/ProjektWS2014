package sample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.table.DefaultTableModel;

public class PropertyList extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PropertyList frame = new PropertyList();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PropertyList() {
		setTitle("Property List");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 352, 207);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.EAST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{65, 0};
		gbl_panel.rowHeights = new int[]{26, 0, 25, 0, 41, 0};
		gbl_panel.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnEdit = new JButton("Edit");
		GridBagConstraints gbc_btnEdit = new GridBagConstraints();
		gbc_btnEdit.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnEdit.insets = new Insets(0, 0, 5, 0);
		gbc_btnEdit.gridx = 0;
		gbc_btnEdit.gridy = 0;
		panel.add(btnEdit, gbc_btnEdit);
		
		JButton btnNew = new JButton("New");
		GridBagConstraints gbc_btnNew = new GridBagConstraints();
		gbc_btnNew.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNew.insets = new Insets(0, 0, 5, 0);
		gbc_btnNew.gridx = 0;
		gbc_btnNew.gridy = 1;
		panel.add(btnNew, gbc_btnNew);
		
		JButton btnDelete = new JButton("Delete");
		GridBagConstraints gbc_btnDelete = new GridBagConstraints();
		gbc_btnDelete.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDelete.insets = new Insets(0, 0, 5, 0);
		gbc_btnDelete.gridx = 0;
		gbc_btnDelete.gridy = 2;
		panel.add(btnDelete, gbc_btnDelete);
		
		JButton btnClose = new JButton("Close");
		GridBagConstraints gbc_btnClose = new GridBagConstraints();
		gbc_btnClose.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnClose.anchor = GridBagConstraints.SOUTH;
		gbc_btnClose.gridx = 0;
		gbc_btnClose.gridy = 4;
		panel.add(btnClose, gbc_btnClose);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		panel_1.add(table, BorderLayout.CENTER);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Type", "Default"},
				{null, null, null},
				{"Elevator", "Boolean", "FALSE"},
				{"Length", "Integer", "0"},
				{"Building", "String", "Building"},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Name", "Type", "Default Value"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(76);
		table.getColumnModel().getColumn(1).setPreferredWidth(74);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
	}

}
