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
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.ImageIcon;

public class AdminView extends JFrame {

	private JPanel contentPane;
	private JTextField txtSearch;

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
	public AdminView() {
		setTitle("Admin View");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFiles = new JMenu("Files");
		menuBar.add(mnFiles);
		
		mnFiles.add(new JMenuItem("Create new Map"));
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFiles.add(mntmOpen);
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFiles.add(mntmSave);
		mnFiles.add(new JMenuItem("Close Map"));
		mnFiles.add(new JMenuItem("Exit"));
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		mnEdit.add(new JMenuItem("Add Vertex"));
		mnEdit.add(new JMenuItem("Add Edge"));
		mnEdit.add(new JMenuItem("Add Stairs"));
		mnEdit.add(new JMenuItem("Add Entrance"));
		mnEdit.add(new JMenuItem("Set Scale"));
		mnEdit.add(new JMenuItem("Create Building"));
		mnEdit.add(new JMenuItem("Add floor plan map"));
		mnEdit.add(new JMenuItem("Replace Background image"));

		
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
		
		JButton btnMove = new JButton("Move");
		btnMove.setToolTipText("Move");
		btnMove.setIcon(new ImageIcon("/home/magic/pse/pse13-group2/functional_specification/gui-pictures/move16.png"));
		panel.add(btnMove);
		
		Component glue = Box.createGlue();
		panel.add(glue);
		
		JButton btnModify = new JButton("Modify");
		btnModify.setIcon(new ImageIcon("/home/magic/pse/pse13-group2/functional_specification/gui-pictures/edit16.png"));
		panel.add(btnModify);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setIcon(new ImageIcon("/home/magic/pse/pse13-group2/functional_specification/gui-pictures/add16.png"));
		panel.add(btnAdd);
		
		txtSearch = new JTextField();
		txtSearch.setHorizontalAlignment(SwingConstants.LEFT);
		txtSearch.setText("Search:");
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		
		Component glue_1 = Box.createGlue();
		panel.add(glue_1);
		
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
					getContentPane().add(node_1);
					node_1 = new DefaultMutableTreeNode("Opening Hours");
						node_1.add(new DefaultMutableTreeNode("9-5"));
					getContentPane().add(node_1);
					node_1 = new DefaultMutableTreeNode("Institutes");
						node_1.add(new DefaultMutableTreeNode("..."));
					getContentPane().add(node_1);
					node_1 = new DefaultMutableTreeNode("Coordinates");
						node_1.add(new DefaultMutableTreeNode("..."));
					getContentPane().add(node_1);
					node_1 = new DefaultMutableTreeNode("...");
						node_1.add(new DefaultMutableTreeNode("..."));
					getContentPane().add(node_1);
				}
			}
		));
		splitPane.setLeftComponent(tree);
		
		JPanel panel_1 = new JPanel();
		splitPane.setRightComponent(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JSlider slider = new JSlider();
		slider.setMajorTickSpacing(1);
		slider.setMinimum(-1);
		slider.setMaximum(5);
		slider.setValue(5);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		panel_1.add(slider, BorderLayout.EAST);
	}

}
