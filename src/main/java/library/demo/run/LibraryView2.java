package library.demo.run;

import javax.swing.JFrame;


//import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JEditorPane;
import java.awt.Button;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import library.demo.util.LibraryFrame;
import library.demo.util.LibraryButtons;

import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;

public class LibraryView2 {
	
	protected LibraryFrame frmLibrary;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	
	/**
	 * @wbp.parser.entryPoint
	 */
	public LibraryView2() {
		initialize();
	}
	
	/**
	 * @wbp.parser.entryPoint
	 */
	private void initialize() {
	    frmLibrary = new LibraryFrame();
	    
	    JPanel background = new JPanel();
	    background.setForeground(new Color(255, 255, 255));
	    background.setBackground(new Color(39, 50, 58));
	    background.setLayout(null);

	    frmLibrary.getContentPane().add(background);
	    
	    JPanel leftPanel = new JPanel();
	    leftPanel.setBackground(new Color(67, 80, 85));
	    leftPanel.setBounds(0, 0, 217, 436);
	    background.add(leftPanel);
	    leftPanel.setLayout(null);
	    
	    JLabel closeWindowLabel = new JLabel("");
	    closeWindowLabel.setForeground(new Color(255, 255, 255));
	    closeWindowLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
	    closeWindowLabel.setBounds(0, 0, 868, 27);
	    leftPanel.add(closeWindowLabel);
	    

	    
	    JLabel lblNewLabel = new JLabel("  X");
	    lblNewLabel.setForeground(new Color(255, 255, 255));
	    lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
	    lblNewLabel.setBounds(0, 0, 30, 27);
	    leftPanel.add(lblNewLabel);
	    
	    
	    JPanel borrowBookBtn = new JPanel();
	    borrowBookBtn.setBackground(new Color(143, 247, 191));
	    borrowBookBtn.setToolTipText("Borrow Book");
	    borrowBookBtn.setBounds(20, 130, 154, 27);
	    leftPanel.add(borrowBookBtn);
	    borrowBookBtn.setLayout(null);
	    
	    JLabel borrowBookLabel = new JLabel("Borrow Book");
	    borrowBookLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
	    borrowBookLabel.setBounds(0, 0, 154, 27);
	    borrowBookBtn.add(borrowBookLabel);	    
	    borrowBookLabel.setHorizontalAlignment(0);
	    
	    JPanel returnBookBtn = new JPanel();
	    returnBookBtn.setLayout(null);
	    returnBookBtn.setToolTipText("Borrow Book");
	    returnBookBtn.setBackground(new Color(41, 161, 156));
	    returnBookBtn.setBounds(20, 168, 154, 27);
	    leftPanel.add(returnBookBtn);
	    
	    JLabel returnBookLabel = new JLabel("Return Book");
	    returnBookLabel.setFont(new Font("Roboto", Font.PLAIN, 11));
	    returnBookLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    returnBookLabel.setBounds(0, 0, 154, 27);
	    returnBookBtn.add(returnBookLabel);
	    
	    JLabel titleLabel_1 = new JLabel("LIBRARY MANAGER");
	    titleLabel_1.setFont(new Font("Roboto", Font.PLAIN, 15));
	    titleLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
	    titleLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	    titleLabel_1.setForeground(Color.WHITE);
	    titleLabel_1.setBounds(0, 0, 838, 27);
	    background.add(titleLabel_1);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(227, 58, 103, 27);
	    background.add(panel);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBounds(355, 58, 103, 27);
	    background.add(panel_1);
	    
	    JPanel panel_2 = new JPanel();
	    panel_2.setBounds(482, 58, 103, 27);
	    background.add(panel_2);
	    
	    JPanel panel_3 = new JPanel();
	    panel_3.setBounds(615, 58, 103, 27);
	    background.add(panel_3);
	    
	    JPanel panel_4 = new JPanel();
	    panel_4.setBounds(744, 58, 103, 27);
	    background.add(panel_4);
	    
	    frmLibrary.setSize(1080, 660);
	    frmLibrary.setVisible(true);
	}
}