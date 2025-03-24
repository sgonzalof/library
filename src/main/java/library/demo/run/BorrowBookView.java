package library.demo.run;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import org.sqlite.core.DB;

import library.demo.util.DbUtil;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import net.miginfocom.swing.MigLayout;

public class BorrowBookView {
	
	protected JFrame frmLibrary;
	private BorrowBookController controller;
	private BorrowBookModel model;
	private DefaultTableModel borrowTable;
	private DbUtil DatabaseToJList;
	private DefaultListModel modelList = new DefaultListModel();

	
	public BorrowBookView(BorrowBookController controller) {
		this.controller = controller;
		initialize();
		
	}
	
	private void initialize() {

		 
		frmLibrary = new JFrame();
		frmLibrary.setDefaultCloseOperation(frmLibrary.EXIT_ON_CLOSE);
		frmLibrary.setTitle("BORROW BOOK VIEW");
		frmLibrary.setBounds(40, 40, 1080, 660);
		frmLibrary.getContentPane().setLayout(null);
		frmLibrary.getContentPane().setBackground(Color.DARK_GRAY);
		frmLibrary.setVisible(true);	
		
		ImageIcon logo = new ImageIcon("library-book-logo.png");
		frmLibrary.setIconImage(logo.getImage());
		
		
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(10, 10, 1044, 50);
		frmLibrary.getContentPane().add(topPanel);
		topPanel.setLayout(new GridLayout(0, 1, 10, 10));
		
		JButton borrowBtn = new JButton("BORROW");
		topPanel.add(borrowBtn);
		
		
		JPanel secondPanel = new JPanel();
		secondPanel.setBounds(10, 70, 1044, 50);
		secondPanel.setVisible(true);		
		frmLibrary.getContentPane().add(secondPanel);
		secondPanel.setLayout(new MigLayout("", "[900px:n:900px][150px:n:150px]", "[50px,grow]"));
		

		
		JList<String> borrowBookList = new JList<>(modelList);
        secondPanel.add(new JScrollPane(borrowBookList));
		controller.getBooks(modelList);
		//borrowBookList.setModel(modelList);
		
		//secondPanel.add(borrowBookList);
		borrowBookList.setVisible(true);

	
				
		
		JButton selectBookBtn = new JButton("Select book");
		secondPanel.add(selectBookBtn, "cell 1 0");
		
		JPanel thirdPanel = new JPanel();
		thirdPanel.setBounds(10, 131, 1044, 50);
		frmLibrary.getContentPane().add(thirdPanel);
		thirdPanel.setLayout(new MigLayout("", "[900px:n:900px][150px:n:150px]", "[grow]"));
		
		JList borrowMemberlist = new JList();
		thirdPanel.add(borrowMemberlist, "flowx,cell 0 0,grow");
		
		JButton selectMemberBtn = new JButton("Select member");
		thirdPanel.add(selectMemberBtn, "cell 1 0");
		
		
	}
}


