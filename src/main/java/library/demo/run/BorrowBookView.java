package library.demo.run;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.sqlite.core.DB;

import library.demo.util.Database;
import library.demo.util.DbUtil;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BorrowBookView {
	
	protected JFrame frmBorrow;
	private BorrowBookController controller;
	private BorrowBookModel model;
	private DefaultTableModel borrowTable;
	private DefaultListModel<String> modelList = new DefaultListModel<String>();
	private JTable table;
	private LibraryController c;


	
	public BorrowBookView(BorrowBookController controller) {
		this.controller = controller;
		initialize();
		
	}
	
	private void initialize() {

		 
		frmBorrow = new JFrame();
		JTable borrowMemberTable = new JTable();
		JList<String> borrowBookList = new JList<>(modelList);

		borrowTable = new DefaultTableModel();
		
		frmBorrow.setDefaultCloseOperation(frmBorrow.EXIT_ON_CLOSE);
		frmBorrow.setTitle("BORROW BOOK VIEW");
		frmBorrow.setBounds(40, 40, 1080, 660);
		frmBorrow.getContentPane().setLayout(null);
		frmBorrow.getContentPane().setBackground(Color.DARK_GRAY);
		frmBorrow.setVisible(true);	
		
		ImageIcon logo = new ImageIcon("library-book-logo.png");
		frmBorrow.setIconImage(logo.getImage());
		
		
        // --- TOP PANEL --- return btn
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(10, 10, 1044, 50);
		frmBorrow.getContentPane().add(topPanel);
		topPanel.setLayout(new GridLayout(0, 1, 1, 10));
		
		JButton borrowBtn = new JButton("BORROW");
		borrowBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = borrowMemberTable.getSelectedRow(); // Obtiene la fila seleccionada
		        String a = ""; // Declarar la variable fuera del if con un valor por defecto
		        
				if (selectedRow != -1) { // Verifica que haya una fila seleccionada
				    a = borrowMemberTable.getValueAt(selectedRow, 1).toString(); // Columna 1
				    System.out.println("Valor de borrowMemberTable: " + a);
				} else {
				    System.out.println("No hay fila seleccionada en borrowMemberTable.");
				} 
				
				String b = borrowBookList.getSelectedValue().toString();
				System.out.println("Valor de borrowBookList: " + b);

				controller.borrowBook(a, b);
				
				
				LibraryController c = new LibraryController();
				LibraryView library = new LibraryView(c); // switch between LibraryView and LibraryView3
				LibraryModel model = new LibraryModel();
				c.setVistaModel(library, model);

				frmBorrow.dispose();   // esto cierra frame borrow
			}
		});
		
		
		topPanel.add(borrowBtn);
		
		// --- SECOND PANTEL ---  		//   ---BOOK PANEL --- book JList - select book btn
		
		
		JPanel secondPanel = new JPanel();
		secondPanel.setBounds(10, 70, 1044, 200);
		secondPanel.setVisible(true);
		frmBorrow.getContentPane().add(secondPanel);
		secondPanel.setLayout(new MigLayout("", "[900px][150px]", "[300px]"));

		

        secondPanel.add(new JScrollPane(borrowBookList), "cell 0 0,grow");
        controller.getBooks(modelList);
        

	
				
		
		JButton selectBookBtn = new JButton("Select book");
		selectBookBtn.setSize(2, 50);
		secondPanel.add(selectBookBtn, "cell 1 0,alignx center,aligny center");
		
		
		// --- THIRD PANEL ---
		
		
		JPanel thirdPanel = new JPanel();
		thirdPanel.setBounds(10, 280, 1044, 200);
		frmBorrow.getContentPane().add(thirdPanel);
		thirdPanel.setLayout(new MigLayout("", "[900px][150px]", "[300px,grow]"));
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 2, 2);
		thirdPanel.add(scrollPane, "cell 0 0,grow");


		
		borrowMemberTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"names", "id"
			}
		));
        controller.getMembers(borrowMemberTable);
        
		scrollPane.setViewportView(borrowMemberTable);
	

		
		JButton selectMemberBtn = new JButton("Select member");
		thirdPanel.add(selectMemberBtn, "cell 1 0");
	
		
		
 
		
	}
}


