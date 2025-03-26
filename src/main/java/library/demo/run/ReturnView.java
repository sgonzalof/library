package library.demo.run;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.miginfocom.swing.MigLayout;

public class ReturnView {
	
	protected JFrame frmReturn;
	private ReturnController controller;
	private BorrowBookModel model;
	private DefaultTableModel borrowTable;
	private DefaultListModel<String> modelList = new DefaultListModel<String>();
	private JTable table;
	private LibraryController c;
	private JTable tableBorrows;

	
	public ReturnView (ReturnController controller) {
		this.controller = controller;
		initialize();
		
	}


	private void initialize() {
		// TODO Auto-generated method stub
		

		 
		frmReturn = new JFrame();
		JTable borrowMemberTable = new JTable();

		borrowTable = new DefaultTableModel();
		
		frmReturn.setDefaultCloseOperation(frmReturn.EXIT_ON_CLOSE);
		frmReturn.setTitle("BORROW BOOK VIEW");
		frmReturn.setBounds(40, 40, 1080, 660);
		frmReturn.getContentPane().setLayout(null);
		frmReturn.getContentPane().setBackground(Color.DARK_GRAY);
		frmReturn.setVisible(true);	
		
		ImageIcon logo = new ImageIcon("library-book-logo.png");
		frmReturn.setIconImage(logo.getImage());
		
		
        // --- TOP PANEL --- return btn
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(10, 10, 1044, 50);
		frmReturn.getContentPane().add(topPanel);
		topPanel.setLayout(new GridLayout(0, 1, 1, 10));
		
		JButton returnBtn = new JButton("RETURN");
		returnBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int selectedRow = tableBorrows.getSelectedRow(); // Obtiene la fila seleccionada
				
		        String a = ""; // Declarar la variable fuera del if con un valor por defecto
		        String b ="";
		        String isbn = "";
		        String idMember = "";
		        
				if (selectedRow != -1) { // Verifica que haya una fila seleccionada
				    a = tableBorrows.getValueAt(selectedRow, 0).toString(); 
				    b = tableBorrows.getValueAt(selectedRow, 1).toString(); 
				    isbn = tableBorrows.getValueAt(selectedRow, 3).toString(); 
				    idMember = tableBorrows.getValueAt(selectedRow, 2).toString(); 
				    System.out.println("Valor de tableBorrows: " + a + ", "+ isbn +", "+ b +", " + idMember );
				} else {
				    System.out.println("No hay fila seleccionada en borrowMemberTable.");
				} 
				
				
				controller.returnBook(isbn,idMember);
				
				LibraryController c = new LibraryController();
				LibraryView library = new LibraryView(c); // switch between LibraryView and LibraryView3
				LibraryModel model = new LibraryModel();
				c.setVistaModel(library, model);


				frmReturn.dispose();   // esto cierra frame return
			}
		});
		
		topPanel.add(returnBtn);
		
		// --- SECOND PANTEL --- 
		//   ---BORROWS PANEL --- borrows table
		
		
		JPanel secondPanel = new JPanel();
		secondPanel.setBounds(10, 70, 1044, 200);
		secondPanel.setVisible(true);
		frmReturn.getContentPane().add(secondPanel);
		secondPanel.setLayout(new MigLayout("", "[900px][150px]", "[300px]"));
		

        JScrollPane scrollPane = new JScrollPane();
        secondPanel.add(scrollPane, "cell 0 0,grow");
        
        tableBorrows = new JTable();
        tableBorrows.setModel(new DefaultTableModel(
        	new Object[][] {
        	},
        	new String[] {
        		"Title", "name", "idMember", "isbn", "Borrow Date", "Return Date"
        	}
        ));
        scrollPane.setViewportView(tableBorrows);
        
        controller.getBorrows(tableBorrows);

        

	
				
		
		JButton selectBookBtn = new JButton("Select book");
		selectBookBtn.setSize(2, 50);
		secondPanel.add(selectBookBtn, "cell 1 0,alignx center,aligny center");
		
	}
		 
		
	
}
