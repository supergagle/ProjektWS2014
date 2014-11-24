package sample;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class RoutingView extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminView frame = new AdminView();
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
	public RoutingView() {
		setTitle("Routing View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFiles = new JMenu("Files");
		menuBar.add(mnFiles);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFiles.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFiles.add(mntmSave);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JRadioButtonMenuItem rdbtnmntmAdminView = new JRadioButtonMenuItem("Admin view");
		mnView.add(rdbtnmntmAdminView);
		
		JRadioButtonMenuItem rdbtnmntmRoutingView = new JRadioButtonMenuItem("Routing View");
		mnView.add(rdbtnmntmRoutingView);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblFrom = new JLabel("From:");
		panel.add(lblFrom);
		
		Component verticalGlue = Box.createVerticalGlue();
		panel.add(verticalGlue);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTo = new JLabel("To:");
		panel.add(lblTo);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		panel.add(verticalGlue_1);
		
		txtSearch = new JTextField();
		txtSearch.setText("Search:");
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnGo = new JButton("Go");
		panel.add(btnGo);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JTree tree = new JTree();
		tree.setModel(new DefaultTreeModel(
				new DefaultMutableTreeNode("Building") {
					{
						DefaultMutableTreeNode node_1;
						node_1 = new DefaultMutableTreeNode("Name");
							node_1.add(new DefaultMutableTreeNode("50.34"));
							node_1.add(new DefaultMutableTreeNode("Infobau"));
			 				node_1.add(new DefaultMutableTreeNode("..."));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("Opening Hours");
							node_1.add(new DefaultMutableTreeNode("9-5"));
						add(node_1);
						node_1 = new DefaultMutableTreeNode("Institutes");
							node_1.add(new DefaultMutableTreeNode("..."));
						add(node_1);
					}
				}
		));
		splitPane.setLeftComponent(tree);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JSlider slider = new JSlider();
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setMajorTickSpacing(1);
		slider.setMaximum(5);
		slider.setMinimum(-1);
		slider.setValue(0);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);
		panel_1.add(slider, BorderLayout.EAST);
	}

}
