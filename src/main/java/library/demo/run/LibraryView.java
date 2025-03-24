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
import library.demo.util.Database;
import library.demo.util.LibraryButtons;

import javax.swing.ImageIcon;

public class LibraryView {
	
	protected JFrame frmLibrary;
	private JTable table_1;
	private JTable table_2;
	private LibraryController controller;
	private BorrowBookController controllerBorrow;
	private DefaultTableModel modelTable1;
	private DefaultTableModel modelTable2;
	private Database db;


	
	public LibraryView(LibraryController c) {
		initialize(c);
	}
	
	private void initialize(LibraryController c) {
		this.controller = c;
		
		modelTable1 = new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
				},
				new String[] {
					"ISBN", "TITLE", "WRITER", "YEAR", "CAT", "IS BORROWED"
				}
				
			);
		
		
		modelTable2 = new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"ID", "NAME", "IS STAFF", "BIRTHDATE", "CAT", "TLF", "HAS BOOKS"
				}
			);
		
		
		
  

		 
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
		
		
		
		/*
		 * 		first panel, borrow book and return book buttons
		 */

		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(10, 10, 1044, 50);
		
		frmLibrary.getContentPane().add(topPanel);
		topPanel.setLayout(new GridLayout(0, 2, 10, 10));
		
		// --- BORROW BTN ---
		
		LibraryButtons borrowBookButton = new LibraryButtons("Borrow Book");
		borrowBookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BorrowBookModel modelBorrow = new BorrowBookModel();
				BorrowBookController controllerBorrow = new BorrowBookController(modelBorrow);

				
				BorrowBookView borrowView = new BorrowBookView(controllerBorrow); // switch between LibraryView and LibraryView3

				//controllerBorrow.setBorrowModel(borrowView, model);
				frmLibrary.dispose();   // esto cerraba la ventana de login
				
				
				}	
			});
		borrowBookButton.setForeground(new Color(0, 0, 0));
		borrowBookButton.setFocusable(false);
		borrowBookButton.setBackground(new Color(138, 255, 128));
		topPanel.add(borrowBookButton);
		
		// --- RETURN BTN ---
		
		LibraryButtons returnBookButton = new LibraryButtons("Return Book");
		returnBookButton.setFocusable(false);
		returnBookButton.setBackground(new Color(53, 56, 56)); // Change button background to red
		returnBookButton.setForeground(new Color(255, 255, 255));
		topPanel.add(returnBookButton);
		
		
		/*
		 * 		second panel, library button
		*/
		JPanel secondPanel = new JPanel();
		secondPanel.setBounds(10, 70, 1044, 50);
		
		frmLibrary.getContentPane().add(secondPanel);
		secondPanel.setLayout(new GridLayout(0, 4, 10,10));
		

		LibraryButtons showLibraryButton = new LibraryButtons("Show Library");
		secondPanel.add(showLibraryButton);
		
		// --- ADD BOOK BTN ---
		
		LibraryButtons addBookButton = new LibraryButtons("Add Book");
		addBookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String isbn = (String) table_1.getValueAt(0, 0);
				String title = (String) table_1.getValueAt(0, 1);
				String writer = (String) table_1.getValueAt(0, 2);
				String year = (String) table_1.getValueAt(0, 3);
				String category = (String) table_1.getValueAt(0, 4);
				String borrowed = (String) table_1.getValueAt(0, 5);

				controller.addBookRow(isbn, title, writer, year, category, borrowed);
				
				modelTable1.insertRow(0, new Object[][] {null, null, null, null, null, null});

					}
				
			}
		);
		secondPanel.add(addBookButton);
		
		// --- REMOVE BOOK BTN ---
		
		LibraryButtons removeBookButton = new LibraryButtons("Remove Book");
		removeBookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.deleteSelectedBook(table_1);
			}
		});
		secondPanel.add(removeBookButton);
		
		
		// --- MODIFY BOOK BTN ---
		
		LibraryButtons modifyBookButton = new LibraryButtons("Modify Book");
		modifyBookButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.saveTable(table_1);
				
			}
		});
		secondPanel.add(modifyBookButton);
		
		
		/*
		 * 		third panel, library table
		 */
		
		JPanel thirdPanel = new JPanel();
		thirdPanel.setBounds(10, 130, 1044, 200);
		
		frmLibrary.getContentPane().add(thirdPanel);
		thirdPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		JScrollPane scrollPane = new JScrollPane();
		thirdPanel.add(scrollPane);
		
		
		
		table_1 = new JTable();
		table_1.setModel(modelTable1);
		scrollPane.setViewportView(table_1);
		
		
		/*
		 * 		fourth panel, member administration buttons
		 */

		
		JPanel fourthPanel = new JPanel();
		fourthPanel.setBounds(10,350,1044,50);
		
		frmLibrary.getContentPane().add(fourthPanel);
		fourthPanel.setLayout(new GridLayout(0, 5, 10, 10));
		
		// --- SHOW MEMBERS BTN ---
		
		LibraryButtons showMembersButton = new LibraryButtons("Show Members");
				fourthPanel.add(showMembersButton);
		
		// --- ADD MEMBER BTN --
				
		LibraryButtons addMemberButton = new LibraryButtons("Add Member");
		addMemberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idMember = (String) table_2.getValueAt(0, 0);
				String name = (String) table_2.getValueAt(0, 1);
				String staff = (String) table_2.getValueAt(0, 2);
				String birthDate = (String) table_2.getValueAt(0, 3);
				String category = (String) table_2.getValueAt(0, 4);
				String tlf = (String) table_2.getValueAt(0, 5);
				String hasABook = (String) table_2.getValueAt(0, 6);

				controller.addMemberRow(idMember, name, staff, birthDate, category, tlf, hasABook);
				
				modelTable2.insertRow(0, new Object[][] {null, null, null, null, null, null, null});

				
			}
		});
		fourthPanel.add(addMemberButton);
		
		// --- REMOVE MEMBER BTN ---
		
		LibraryButtons removeMemberButton = new LibraryButtons("Remove Member");
		removeMemberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.deleteSelectedMember(table_2);
			}
		});
		fourthPanel.add(removeMemberButton);
		
		// --- MODIFY MEMBER BTN ---
		
		LibraryButtons modifyMemberButton = new LibraryButtons("Modify Member");
		modifyMemberButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.saveTable(table_2);
			}
		});
		fourthPanel.add(modifyMemberButton);
		
		LibraryButtons showDelaysButton = new LibraryButtons("Show Delays");
		fourthPanel.add(showDelaysButton);
		
		/*
		 * 	bottomPanel , members table
		 */

		
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBounds(10,410,1044,200);
		
		frmLibrary.getContentPane().add(bottomPanel);
		bottomPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		JScrollPane scrollPane2 = new JScrollPane();
		bottomPanel.add(scrollPane2);
		
		table_2 = new JTable();
		table_2.setModel(modelTable2);
		scrollPane2.setViewportView(table_2);
		

			

	}
	
	public JFrame getFrame() {
		return this.frmLibrary;
	}

	private JButton JButton(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ShowTable1(Object[] rowBook) {
	    if (rowBook == null) {
	        System.out.println("Advertencia: Se intentó agregar una fila nula a la tabla.");
	        return;
	    }

	    if (modelTable1 == null) {
	        System.out.println("Error: modelTable1 no está inicializado.");
	        return;
	    }

	    // Agregamos la fila al modelo sin volver a establecerlo en la tabla
	    modelTable1.addRow(rowBook);

	}
	
	public void ShowTable2(Object[] rowBook) {
	    if (rowBook == null) {
	        System.out.println("Advertencia: Se intentó agregar una fila nula a la tabla.");
	        return;
	    }

	    if (modelTable2 == null) {
	        System.out.println("Error: modelTable1 no está inicializado.");
	        return;
	    }

	    // Agregamos la fila al modelo sin volver a establecerlo en la tabla
	    modelTable2.addRow(rowBook);

	}


}