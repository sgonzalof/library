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

	
	public ReturnView (ReturnController controller) {
		this.controller = controller;
		initialize();
		
	}


	private void initialize() {
		// TODO Auto-generated method stub
		

		 
		frmReturn = new JFrame();
		JTable borrowMemberTable = new JTable();
		JList<String> borrowBookList = new JList<>(modelList);

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
				
				LibraryController c = new LibraryController();
				LibraryView library = new LibraryView(c); // switch between LibraryView and LibraryView3
				LibraryModel model = new LibraryModel();
				c.setVistaModel(library, model);


				frmReturn.dispose();   // esto cierra frame borrow
			}
		});
		topPanel.add(returnBtn);
		
		// --- SECOND PANTEL --- 
		//   ---BOOK PANEL --- book JList - select book btn
		
		
		JPanel secondPanel = new JPanel();
		secondPanel.setBounds(10, 70, 1044, 200);
		secondPanel.setVisible(true);
		frmReturn.getContentPane().add(secondPanel);
		secondPanel.setLayout(new MigLayout("", "[900px][150px]", "[300px]"));

		

        secondPanel.add(new JScrollPane(borrowBookList), "cell 0 0,grow");

        

	
				
		
		JButton selectBookBtn = new JButton("Select book");
		selectBookBtn.setSize(2, 50);
		secondPanel.add(selectBookBtn, "cell 1 0,alignx center,aligny center");
		
		
		 
		
	}




		
	

}
