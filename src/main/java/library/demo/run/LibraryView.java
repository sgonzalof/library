package library.demo.run;

import javax.swing.JFrame;

import net.miginfocom.swing.MigLayout;
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

public class LibraryView {
	
	protected JFrame frmLibrary;
	
	public LibraryView() {
		initialize();
	}
	
	private void initialize() {
		frmLibrary = new JFrame();
		frmLibrary.setTitle("LIBRARY");
		frmLibrary.setBounds(0, 0, 900, 1500);
		frmLibrary.getContentPane().setLayout(new GridLayout(5, 5, 0, 0));
		
		JButton btnNewButton = new JButton("New button");
		frmLibrary.getContentPane().add(btnNewButton);
		frmLibrary.setVisible(true);
		

	}
}
