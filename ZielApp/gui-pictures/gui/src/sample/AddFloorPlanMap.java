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
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class AddFloorPlanMap extends JFrame {

	private JPanel contentPane;
	private JTextField txtHsaf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddFloorPlanMap frame = new AddFloorPlanMap();
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
	public AddFloorPlanMap() {
		setTitle("Add Floorplan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 126);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblLevel = new JLabel("Floor Level:");
		GridBagConstraints gbc_lblLevel = new GridBagConstraints();
		gbc_lblLevel.anchor = GridBagConstraints.EAST;
		gbc_lblLevel.insets = new Insets(0, 0, 5, 5);
		gbc_lblLevel.gridx = 0;
		gbc_lblLevel.gridy = 0;
		contentPane.add(lblLevel, gbc_lblLevel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2", "1", "0", "-1", "-2"}));
		comboBox.setSelectedIndex(1);
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 0;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblBackground = new JLabel("Background:");
		GridBagConstraints gbc_lblBackground = new GridBagConstraints();
		gbc_lblBackground.anchor = GridBagConstraints.EAST;
		gbc_lblBackground.insets = new Insets(0, 0, 5, 5);
		gbc_lblBackground.gridx = 0;
		gbc_lblBackground.gridy = 1;
		contentPane.add(lblBackground, gbc_lblBackground);
		
		txtHsaf = new JTextField();
		txtHsaf.setText("hsaf1");
		GridBagConstraints gbc_txtHsaf = new GridBagConstraints();
		gbc_txtHsaf.gridwidth = 2;
		gbc_txtHsaf.insets = new Insets(0, 0, 5, 5);
		gbc_txtHsaf.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtHsaf.gridx = 1;
		gbc_txtHsaf.gridy = 1;
		contentPane.add(txtHsaf, gbc_txtHsaf);
		txtHsaf.setColumns(10);
		
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
