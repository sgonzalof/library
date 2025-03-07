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
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class LibraryView {
	
	protected JFrame frmLibrary;
	private JTable table;
	private JTable table_1;
	
	public LibraryView() {
		initialize();
	}
	
	private void initialize() {
		frmLibrary = new JFrame();
		frmLibrary.setTitle("LIBRARY MANAGER");
		frmLibrary.setBounds(0, 0, 1080, 720);
		frmLibrary.getContentPane().setLayout(null);
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(10, 0, 1044, 50);
		
		frmLibrary.getContentPane().add(topPanel);
		topPanel.setLayout(new GridLayout(0, 2, 10, 10));
		
		JButton borrowBookButton = new JButton("Borrow Book");
		borrowBookButton.setForeground(new Color(0, 0, 0));
		borrowBookButton.setBackground(Color.GREEN);
		topPanel.add(borrowBookButton);
		
		JButton returnBookButton = new JButton("Return Book");
		returnBookButton.setBackground(Color.RED); // Cambia el fondo del botón a rojo
		returnBookButton.setForeground(new Color(255, 255, 255));
		topPanel.add(returnBookButton);
		frmLibrary.setVisible(true);
		
		JPanel secondPanel = new JPanel();
		secondPanel.setBounds(10,60,1044,50);
		
		frmLibrary.getContentPane().add(secondPanel);
		secondPanel.setLayout(new GridLayout(0, 4, 10,10));
		
		JButton showLibraryButton = new JButton("Show Library");
		secondPanel.add(showLibraryButton);
		
		JButton addBookButton = new JButton("Add Book");
		secondPanel.add(addBookButton);
		
		JButton removeBookButton = new JButton("Remove Book");
		secondPanel.add(removeBookButton);
		
		JButton modifyBookButton = new JButton("Modify Book");
		secondPanel.add(modifyBookButton);
		
		JPanel thirdPanel = new JPanel();
		thirdPanel.setBounds(10,120,1044,200);
		
		frmLibrary.getContentPane().add(thirdPanel);
		thirdPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		JScrollPane scrollPane = new JScrollPane();
		thirdPanel.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Book Name", "Writer", "Year", "Category", "Borrowed"
			}
		));
		scrollPane.setViewportView(table_1);
		
		
		
		JPanel fourthPanel = new JPanel();
		fourthPanel.setBounds(10,220,1044,50);
		
		frmLibrary.getContentPane().add(fourthPanel);
		fourthPanel.setLayout(new GridLayout(0, 5, 10, 10));
		
		JButton showMembersButton = new JButton("Show Members");
		fourthPanel.add(showMembersButton);
		
		JButton addMemberButton = new JButton("Add Member");
		fourthPanel.add(addMemberButton);
		
		JButton removeMemberButton = new JButton("Remove Member");
		fourthPanel.add(removeMemberButton);
		
		JButton modifyMemberButton = new JButton("Modify Member");
		fourthPanel.add(modifyMemberButton);
		
		JButton showDelaysButton = new JButton("Show Delays");
		fourthPanel.add(showDelaysButton);
		
		
		JPanel bottomPanel = new JPanel();
		fourthPanel.setBounds(10,400,1044,50);
		
		frmLibrary.getContentPane().add(fourthPanel);
		fourthPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		JScrollPane scrollPane1 = new JScrollPane();
		thirdPanel.add(scrollPane1);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Member Name", "id", "Age", "Has a Book?"
			}
		));
		scrollPane.setViewportView(table_2);
		
		
		
		
		
		
		
		
		
		
		

	}
}