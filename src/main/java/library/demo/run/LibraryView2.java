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
		
		LibraryFrame frmLibrary = new LibraryFrame();
		frmLibrary.setVisible(true);
		frmLibrary.setTitle("LIBRARY MANAGER");
				
		
		// left panel
		
		
		JPanel leftPanel = new JPanel();
	    leftPanel.setBackground(new Color(21, 27, 35));
	    leftPanel.setSize(180, 660);
	    frmLibrary.getContentPane().add(leftPanel);
	    
	    
	    
	    // left panel buttons
	    
	    JPanel borrowBtnPanel = new JPanel();
	    borrowBtnPanel.setBackground(new Color(33,40,48));
	    borrowBtnPanel.setBounds(10, 10, 50, 10);
	    leftPanel.add(borrowBtnPanel);

	    

	    
	    // right panel
	    
		JPanel rightPanel = new JPanel();
	    rightPanel.setBackground(new Color(13, 17, 23));
	    rightPanel.setBounds(180, 0, 900, 660);
	    frmLibrary.getContentPane().add(rightPanel);
	    
	}

	
	

}
	
