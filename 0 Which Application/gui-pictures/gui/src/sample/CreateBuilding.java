package sample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreateBuilding extends JFrame {

	private JPanel contentPane;
	private JTextField txtHsaf;
	private JTextField txtHsafxml;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateBuilding frame = new CreateBuilding();
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
	public CreateBuilding() {
		setTitle("Create Building");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 127);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{36, 23, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblBuildingName = new JLabel("Name:");
		GridBagConstraints gbc_lblBuildingName = new GridBagConstraints();
		gbc_lblBuildingName.anchor = GridBagConstraints.EAST;
		gbc_lblBuildingName.insets = new Insets(0, 0, 5, 5);
		gbc_lblBuildingName.gridx = 0;
		gbc_lblBuildingName.gridy = 0;
		contentPane.add(lblBuildingName, gbc_lblBuildingName);
		
		txtHsaf = new JTextField();
		txtHsaf.setText("HSaF");
		GridBagConstraints gbc_txtHsaf = new GridBagConstraints();
		gbc_txtHsaf.gridwidth = 2;
		gbc_txtHsaf.insets = new Insets(0, 0, 5, 0);
		gbc_txtHsaf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHsaf.gridx = 1;
		gbc_txtHsaf.gridy = 0;
		contentPane.add(txtHsaf, gbc_txtHsaf);
		txtHsaf.setColumns(10);
		
		JLabel lblFile = new JLabel("File:");
		GridBagConstraints gbc_lblFile = new GridBagConstraints();
		gbc_lblFile.anchor = GridBagConstraints.EAST;
		gbc_lblFile.insets = new Insets(0, 0, 5, 5);
		gbc_lblFile.gridx = 0;
		gbc_lblFile.gridy = 1;
		contentPane.add(lblFile, gbc_lblFile);
		
		txtHsafxml = new JTextField();
		txtHsafxml.setText("hsaf.xml");
		GridBagConstraints gbc_txtHsafxml = new GridBagConstraints();
		gbc_txtHsafxml.gridwidth = 2;
		gbc_txtHsafxml.insets = new Insets(0, 0, 5, 0);
		gbc_txtHsafxml.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHsafxml.gridx = 1;
		gbc_txtHsafxml.gridy = 1;
		contentPane.add(txtHsafxml, gbc_txtHsafxml);
		txtHsafxml.setColumns(10);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancel.gridx = 1;
		gbc_btnCancel.gridy = 2;
		contentPane.add(btnCancel, gbc_btnCancel);
		
		JButton btnOk = new JButton("OK");
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.gridx = 2;
		gbc_btnOk.gridy = 2;
		contentPane.add(btnOk, gbc_btnOk);
	}

}
