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
	    background.setBackground(new Color(0, 11, 88));
	    background.setLayout(null);

	    frmLibrary.getContentPane().add(background);
	    
	    JPanel upperPanel = new JPanel();
	    upperPanel.setForeground(new Color(255, 255, 255));
	    upperPanel.setBackground(new Color(0, 49, 97));
	    upperPanel.setBounds(0, 0, 868, 255);
	    background.add(upperPanel);
	    
	    JPanel closeBar = new JPanel();
	    closeBar.setBounds(0, 0, 868, 29);
	    background.add(closeBar);
	    closeBar.setLayout(null);
	    
	    JLabel closeBtn = new JLabel("X");
	    closeBtn.setToolTipText("");
	    closeBtn.setDisplayedMnemonic('x');
	    closeBtn.setBackground(new Color(0, 49, 97));
	    closeBtn.setForeground(new Color(255, 255, 255));
	    closeBtn.setBounds(0, 0, 31, 29);
	    closeBar.add(closeBtn);
	    frmLibrary.setSize(1080, 660);
	    frmLibrary.setVisible(true);
	}
}