package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;

public class PropertyConfig {

	private JFrame frmProperty;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PropertyConfig window = new PropertyConfig();
					window.frmProperty.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PropertyConfig() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmProperty = new JFrame();
		frmProperty.setTitle("Property configuration");
		frmProperty.setBounds(100, 100, 202, 155);
		frmProperty.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frmProperty.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(12, 7, 40, 15);
		panel.add(lblName);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalGlue.setBounds(63, 14, 0, 0);
		panel.add(verticalGlue);
		
		textField = new JTextField();
		textField.setBounds(74, 5, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setBounds(12, 34, 34, 15);
		panel.add(lblType);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalGlue_1.setBounds(74, 41, 0, 0);
		panel.add(verticalGlue_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(102, 29, 86, 24);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Boolean", "Text", "Integer"}));
		panel.add(comboBox);
		
		JLabel lblDefaultValue = new JLabel("Default Value");
		lblDefaultValue.setBounds(12, 63, 96, 15);
		panel.add(lblDefaultValue);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalGlue_2.setBounds(113, 70, 0, 0);
		panel.add(verticalGlue_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(118, 58, 70, 24);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"FALSE", "TRUE", "NULL"}));
		panel.add(comboBox_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(22, 94, 81, 25);
		panel.add(btnCancel);
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		verticalGlue_3.setBounds(113, 99, 0, 0);
		panel.add(verticalGlue_3);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(128, 94, 54, 25);
		panel.add(btnOk);
	}
}
