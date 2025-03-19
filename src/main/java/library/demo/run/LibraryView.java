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

public class LibraryView {
	
	protected JFrame frmLibrary;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private LibraryController controller;

	
	public LibraryView(LibraryController c) {
		initialize(c);
	}
	
	private void initialize(LibraryController c) {
		 /*
		 this is commented because i added the class LibraryFrame, so 
		 its called with all settings of the frames of the library
		  
		  TO-DO -- add to the logging frame (SwingMain.java)
		  TO-DO -- add class for buttons 
		  
		*/  
		controller = c;
		 
		frmLibrary = new JFrame();
		frmLibrary.setDefaultCloseOperation(frmLibrary.EXIT_ON_CLOSE);
		frmLibrary.setTitle("LIBRARY MANAGER");
		frmLibrary.setBounds(40, 40, 1080, 660);
		frmLibrary.getContentPane().setLayout(null);
		frmLibrary.getContentPane().setBackground(Color.DARK_GRAY);
		frmLibrary.setVisible(true);
		
		
		
		ImageIcon logo = new ImageIcon("library-book-logo.png");
		frmLibrary.setIconImage(logo.getImage());
		
		/*
		LibraryFrame frmLibrary = new LibraryFrame();

		frmLibrary.setTitle("LIBRARY MANAGER");
		*/
		// first panel, borrow book and return book buttons
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(10, 10, 1044, 50);
		
		frmLibrary.getContentPane().add(topPanel);
		topPanel.setLayout(new GridLayout(0, 2, 10, 10));
		
		LibraryButtons borrowBookButton = new LibraryButtons("Borrow Book");
		borrowBookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		borrowBookButton.setForeground(new Color(0, 0, 0));
		borrowBookButton.setFocusable(false);
		borrowBookButton.setBackground(new Color(138, 255, 128));
		topPanel.add(borrowBookButton);
		
		
		LibraryButtons returnBookButton = new LibraryButtons("Return Book");
		returnBookButton.setFocusable(false);
		returnBookButton.setBackground(new Color(53, 56, 56)); // Change button background to red
		returnBookButton.setForeground(new Color(255, 255, 255));
		topPanel.add(returnBookButton);
		
		
		
		// second panel, library buttons
		
		JPanel secondPanel = new JPanel();
		secondPanel.setBounds(10, 70, 1044, 50);
		
		frmLibrary.getContentPane().add(secondPanel);
		secondPanel.setLayout(new GridLayout(0, 4, 10,10));
		

		LibraryButtons showLibraryButton = new LibraryButtons("Show Library");
		secondPanel.add(showLibraryButton);
		
		LibraryButtons addBookButton = new LibraryButtons("Add Book");
		secondPanel.add(addBookButton);
		
		LibraryButtons removeBookButton = new LibraryButtons("Remove Book");
		secondPanel.add(removeBookButton);
		
		LibraryButtons modifyBookButton = new LibraryButtons("Modify Book");
		secondPanel.add(modifyBookButton);
		
		
		// third panel, library table
		
		JPanel thirdPanel = new JPanel();
		thirdPanel.setBounds(10, 130, 1044, 200);
		
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
		
		/*
		 * 
		 * commented because doesn't work
		 * 
		 * 
		
		table_1.setForeground(new Color(0,0,0));
		table_1.setBackground(new Color(0,0,0));
		table_1.setGridColor(new Color(0,0,0));
		table_1.
		
		
		*/
		scrollPane.setViewportView(table_1);
		
		
		// fourth panel, member administration buttons
		
		JPanel fourthPanel = new JPanel();
		fourthPanel.setBounds(10,350,1044,50);
		
		frmLibrary.getContentPane().add(fourthPanel);
		fourthPanel.setLayout(new GridLayout(0, 5, 10, 10));
		
		LibraryButtons showMembersButton = new LibraryButtons("Show Members");
				fourthPanel.add(showMembersButton);
		
		LibraryButtons addMemberButton = new LibraryButtons("Add Member");
		fourthPanel.add(addMemberButton);
		
		LibraryButtons removeMemberButton = new LibraryButtons("Remove Member");
		fourthPanel.add(removeMemberButton);
		
		LibraryButtons modifyMemberButton = new LibraryButtons("Modify Member");
		fourthPanel.add(modifyMemberButton);
		
		LibraryButtons showDelaysButton = new LibraryButtons("Show Delays");
		fourthPanel.add(showDelaysButton);
		
		
		// bottom panel, member table
		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(10,410,1044,200);
		
		frmLibrary.getContentPane().add(bottomPanel);
		bottomPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		JScrollPane scrollPane2 = new JScrollPane();
		bottomPanel.add(scrollPane2);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Member Id", "Has a book", "Staff", "Age", "Tlf"
			}
		));
		scrollPane2.setViewportView(table_2);
		

			

	}

	private JButton JButton(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}