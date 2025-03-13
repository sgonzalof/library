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
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class BorrowBookFrame {
	
	protected LibraryFrame frmLibrary;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	

	/**
	 * @wbp.parser.entryPoint
	 */
	
	
	
	public BorrowBookFrame() {
		LibraryFrame frmLibrary = new LibraryFrame();
		frmLibrary.setVisible(true);
		frmLibrary.setTitle("LIBRARY MANAGER");
		
	}
}
		