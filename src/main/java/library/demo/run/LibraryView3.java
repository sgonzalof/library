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

public class LibraryView3 {
	
	protected LibraryFrame frmLibrary;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;

	

	/**
	 * @wbp.parser.entryPoint
	 */
	
	
	
	public LibraryView3() {
		
		
		
		Color Darkest =new Color(13, 17, 23);
		Color Dark =new Color(21, 27, 35);
		Color Light =new Color(33, 40, 48);
		Color Lightest =new Color(68, 147, 248);
		Color MoreLightest =new Color(145, 152, 161) ;
		Color HoverBtnColor =new Color(74, 68, 81);
		
		
		
		
		
		// Comment the 3 below lines to see the frame in the window builder,
		// then uncomment the next JFrame lines
		//
	
		
		
		LibraryFrame frmLibrary = new LibraryFrame();
		frmLibrary.setVisible(true);
		frmLibrary.setTitle("LIBRARY MANAGER");
		
		
	

		/*
		
		JFrame frmLibrary = new JFrame();  //change this lines with the commented section above
		frmLibrary.setResizable(false);
		frmLibrary.setBounds(0, 0, 1920, 1080);
		frmLibrary.getContentPane().setLayout(null);
		
		
		*/
	
		// LEFT PANEL
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBackground(Dark);
		leftPanel.setBounds(0, 0, 180, 1080);
		frmLibrary.getContentPane().add(leftPanel);
		leftPanel.setLayout(null);
		
		
		// user 
		
		JLabel userLabel = new JLabel("User:");
		userLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 17));
		userLabel.setForeground(new Color(255, 255, 255));
		userLabel.setBounds(10, 10, 160, 34);
		leftPanel.add(userLabel);
		
		
		
		// borrow button
		
		JPanel borrowBtnPanel = new JPanel();
		
		borrowBtnPanel.setBackground(Light);
		borrowBtnPanel.setBounds(10, 156, 160, 46);
		leftPanel.add(borrowBtnPanel);
		FlowLayout fl_borrowBtnPanel = new FlowLayout(FlowLayout.CENTER, 5, 15);
		borrowBtnPanel.setLayout(fl_borrowBtnPanel);
		
		JLabel borrowBtnLabel = new JLabel("BORROW");
		borrowBtnLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 17));
		borrowBtnLabel.setForeground(Lightest);
		borrowBtnPanel.add(borrowBtnLabel);
		
		borrowBtnPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				borrowBtnPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				borrowBtnPanel.setBackground(Light);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				BorrowBookFrame library = new BorrowBookFrame();
			}
		});

	
		// return button
		JPanel returnBtnPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) returnBtnPanel.getLayout();
		flowLayout.setVgap(15);
		returnBtnPanel.setBackground(Light);
		returnBtnPanel.setBounds(10, 228, 160, 46);
		leftPanel.add(returnBtnPanel);
		
		JLabel returnBtnLabel = new JLabel("RETURN");
		returnBtnLabel.setBackground(new Color(68, 147, 248));
		returnBtnLabel.setForeground(new Color(68, 147, 248));
		returnBtnLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 17));
		returnBtnPanel.add(returnBtnLabel);
		
		returnBtnPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				returnBtnPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				returnBtnPanel.setBackground(Light);
			}
		});

	

			

		
		JPanel showDelaysBtnPanel = new JPanel();
		FlowLayout fl_showDelaysBtnPanel = (FlowLayout) showDelaysBtnPanel.getLayout();
		fl_showDelaysBtnPanel.setVgap(15);
		showDelaysBtnPanel.setBackground(new Color(33, 40, 48));
		showDelaysBtnPanel.setBounds(10, 363, 160, 46);
		leftPanel.add(showDelaysBtnPanel);
		
		JLabel showDelaysBtnLabel = new JLabel("SHOW DELAYS");
		showDelaysBtnLabel.setForeground(new Color(255, 123, 114));
		showDelaysBtnLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 17));
		showDelaysBtnLabel.setBackground(new Color(68, 147, 248));
		showDelaysBtnPanel.add(showDelaysBtnLabel);
		
		
		showDelaysBtnPanel.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				showDelaysBtnPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				showDelaysBtnPanel.setBackground(Light);
			}
		});
		
	
	
		
		// MAIN PANEL
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(13, 17, 23));
		mainPanel.setBounds(180, 0, 1740, 1080);
		frmLibrary.getContentPane().add(mainPanel);
		mainPanel.setLayout(null);
		
		// LIBRARY ZONE
		
		JPanel addBookPanel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) addBookPanel.getLayout();
		flowLayout_1.setVgap(8);
		addBookPanel.setBackground(new Color(33, 40, 48));
		addBookPanel.setBounds(50, 30, 150, 33);
		mainPanel.add(addBookPanel);
		
		addBookPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				addBookPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				addBookPanel.setBackground(Light);
			}
		});
		

		
		JLabel addBookLabel = new JLabel("Add Book");
		addBookLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		addBookLabel.setForeground(new Color(145, 152, 161));
		addBookPanel.add(addBookLabel);
		
		JPanel deleteBookPanel = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) deleteBookPanel.getLayout();
		flowLayout_2.setVgap(8);
		deleteBookPanel.setBackground(new Color(33, 40, 48));
		deleteBookPanel.setBounds(210, 30, 150, 33);
		mainPanel.add(deleteBookPanel);
		
		deleteBookPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				deleteBookPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				deleteBookPanel.setBackground(Light);
			}
		});
		
		JLabel deleteBookLabel = new JLabel("Delete Book");
		deleteBookLabel.setForeground(new Color(145, 152, 161));
		deleteBookLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		deleteBookPanel.add(deleteBookLabel);
		
		JPanel modifyBookPanel = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) modifyBookPanel.getLayout();
		flowLayout_3.setVgap(8);
		modifyBookPanel.setBackground(new Color(33, 40, 48));
		modifyBookPanel.setBounds(370, 30, 150, 33);
		mainPanel.add(modifyBookPanel);
		
		modifyBookPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				modifyBookPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				modifyBookPanel.setBackground(Light);
			}
		});
		
		JLabel modifyBookLabel = new JLabel("Modify Book");
		modifyBookLabel.setForeground(new Color(145, 152, 161));
		modifyBookLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		modifyBookPanel.add(modifyBookLabel);
		
		JPanel showLibPanel = new JPanel();
		FlowLayout flowLayout_4 = (FlowLayout) showLibPanel.getLayout();
		flowLayout_4.setVgap(8);
		showLibPanel.setBackground(new Color(33, 40, 48));
		showLibPanel.setBounds(530, 30, 150, 33);
		mainPanel.add(showLibPanel);
		
		showLibPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				showLibPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				showLibPanel.setBackground(Light);
			}
		});
		
		JLabel showLibLabel = new JLabel("Show Library");
		showLibLabel.setForeground(new Color(145, 152, 161));
		showLibLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		showLibPanel.add(showLibLabel);
		
		
		
		// MEMBER ZONE
		
		JPanel addMemberPanel = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) addMemberPanel.getLayout();
		flowLayout_5.setVgap(8);
		addMemberPanel.setBackground(new Color(33, 40, 48));
		addMemberPanel.setBounds(50, 417, 150, 33);
		mainPanel.add(addMemberPanel);
		
		addMemberPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				addMemberPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				addMemberPanel.setBackground(Light);
			}
		});
		
		JLabel AddMemberLabel = new JLabel("Add Member");
		AddMemberLabel.setForeground(new Color(145, 152, 161));
		AddMemberLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		addMemberPanel.add(AddMemberLabel);
		
		JPanel deleteMemberPanel = new JPanel();
		FlowLayout fl_deleteMemberPanel = (FlowLayout) deleteMemberPanel.getLayout();
		fl_deleteMemberPanel.setVgap(8);
		deleteMemberPanel.setBackground(new Color(33, 40, 48));
		deleteMemberPanel.setBounds(210, 417, 150, 33);
		mainPanel.add(deleteMemberPanel);
		
		deleteMemberPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				deleteMemberPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				deleteMemberPanel.setBackground(Light);
			}
		});
		
		JLabel deleteMemberLabel = new JLabel("Delete Member");
		deleteMemberLabel.setForeground(new Color(145, 152, 161));
		deleteMemberLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		deleteMemberPanel.add(deleteMemberLabel);
		
		JPanel modifyMemberPanel = new JPanel();
		FlowLayout fl_modifyMemberPanel = (FlowLayout) modifyMemberPanel.getLayout();
		fl_modifyMemberPanel.setVgap(8);
		modifyMemberPanel.setBackground(new Color(33, 40, 48));
		modifyMemberPanel.setBounds(370, 417, 150, 33);
		mainPanel.add(modifyMemberPanel);
		
		modifyMemberPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				modifyMemberPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				modifyMemberPanel.setBackground(Light);
			}
		});
		
		JLabel modifyMemberLabel = new JLabel("Modify Member");
		modifyMemberLabel.setForeground(new Color(145, 152, 161));
		modifyMemberLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		modifyMemberPanel.add(modifyMemberLabel);
		
		JPanel showMembersPanel = new JPanel();
		FlowLayout fl_showMembersPanel = (FlowLayout) showMembersPanel.getLayout();
		fl_showMembersPanel.setVgap(8);
		showMembersPanel.setBackground(new Color(33, 40, 48));
		showMembersPanel.setBounds(530, 417, 150, 33);
		mainPanel.add(showMembersPanel);
		
		showMembersPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				showMembersPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				showMembersPanel.setBackground(Light);
			}
		});
		
		JLabel showMembersLabel = new JLabel("Show Members");
		showMembersLabel.setForeground(new Color(145, 152, 161));
		showMembersLabel.setFont(new Font("Roboto Light", Font.PLAIN, 15));
		showMembersPanel.add(showMembersLabel);
		
		
		// TABLES
		
		JScrollPane libscrollPane = new JScrollPane();
		libscrollPane.setBounds(50, 76, 1650, 321);
		mainPanel.add(libscrollPane);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Book Name", "Writer", "Year", "Category", "Borrowed"
			}
		));
		libscrollPane.setViewportView(table_3);
		
		
		
		JScrollPane membscrollPane = new JScrollPane();
		membscrollPane.setBounds(50, 461, 1650, 321);
		mainPanel.add(membscrollPane);
		
		table_2 = new JTable();
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Member Id", "Has a Book", "Staff", "Age", "Tlf"
			}
		));
		membscrollPane.setViewportView(table_2);


		
	
	
	}
}