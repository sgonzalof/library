package library.demo.run;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BorrowBookPanel extends JPanel {

	private LibraryView3 mainPanel;
	//private ReturnBookPanel returnPanel;
	//private BorrowBookPanel borrowPanel;
	
    public BorrowBookPanel() {
    	setLayout(new BorderLayout());
    	setBounds(180, 0, 1740, 1080);
    	setVisible(true);
        setBackground(Color.red);
        


        

		
		Color Darkest =new Color(13, 17, 23);
		Color Dark =new Color(21, 27, 35);
		Color Light =new Color(33, 40, 48);
		Color Lightest =new Color(68, 147, 248);
		Color MoreLightest =new Color(145, 152, 161) ;
		Color HoverBtnColor =new Color(74, 68, 81);
        

        

    	
    	JPanel borrowMainPanel = new JPanel();
    	borrowMainPanel.setBounds(180, 0, 1740, 1080);
    	borrowMainPanel.setLayout(null);
    	borrowMainPanel.setBackground(new Color(13, 17, 23));
    	add(borrowMainPanel);
    	
    	JPanel titlePanel = new JPanel();
    	titlePanel.setBackground(new Color(33, 40, 48));
    	titlePanel.setBounds(50, 30, 1298, 33);
    	borrowMainPanel.add(titlePanel);
    	titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 8));
    	
    	JLabel titleLabel = new JLabel("BORROW BOOK VIEW");
    	titleLabel.setForeground(Color.WHITE);
    	titleLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 14));
    	titleLabel.setBackground(Color.WHITE);
    	titlePanel.add(titleLabel);
    	
    	JPanel bookPanel = new JPanel();
    	bookPanel.setLayout(null);
    	bookPanel.setBackground(new Color(33, 40, 48));
    	bookPanel.setBounds(50, 94, 630, 33);
    	borrowMainPanel.add(bookPanel);
    	
    	JLabel lblNewLabel = new JLabel("Book:");
    	lblNewLabel.setForeground(new Color(145, 152, 161));
    	lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
    	lblNewLabel.setBounds(10, 0, 84, 33);
    	bookPanel.add(lblNewLabel);
    	
    	JComboBox bookNameComboBox = new JComboBox();
    	bookNameComboBox.setEditable(true);
    	bookNameComboBox.setBackground(new Color(33, 40, 48));
    	bookNameComboBox.setBounds(81, 0, 549, 33);
    	bookPanel.add(bookNameComboBox);
    	
    	JPanel memberPanel = new JPanel();
    	memberPanel.setLayout(null);
    	memberPanel.setBackground(new Color(33, 40, 48));
    	memberPanel.setBounds(718, 94, 630, 33);
    	borrowMainPanel.add(memberPanel);
    	
    	JLabel memberLabel = new JLabel("Member:");
    	memberLabel.setForeground(new Color(145, 152, 161));
    	memberLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
    	memberLabel.setBounds(10, 0, 84, 33);
    	memberPanel.add(memberLabel);
    	
    	JComboBox memberComboBox = new JComboBox();
    	memberComboBox.setEditable(true);
    	memberComboBox.setBackground(new Color(33, 40, 48));
    	memberComboBox.setBounds(81, 0, 549, 33);
    	memberPanel.add(memberComboBox);
    	
    	JPanel borrowBtnPanel = new JPanel();
    	borrowBtnPanel.setBackground(new Color(21, 27, 35));
    	borrowBtnPanel.setBounds(224, 699, 400, 60);
    	borrowMainPanel.add(borrowBtnPanel);
    	borrowBtnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
    	
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
			
			public void mousePressed(MouseEvent e) {
				borrowMainPanel.setVisible(false);

				mainPanel.setVisible(true);

				
			}
		});

		
    	
    	JLabel borrowBtnLabel = new JLabel("BORROW");
    	borrowBtnLabel.setForeground(new Color(68, 147, 248));
    	borrowBtnLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 23));
    	borrowBtnPanel.add(borrowBtnLabel);
    	
    	JPanel backPanel = new JPanel();
    	backPanel.setBackground(new Color(21, 27, 35));
    	backPanel.setBounds(785, 699, 400, 60);
    	borrowMainPanel.add(backPanel);
    	backPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
    	
		backPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				backPanel.setBackground(HoverBtnColor);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				backPanel.setBackground(Light);
			}
			@Override
			
			public void mousePressed(MouseEvent e) {
				

				
			}
		});
    	
    	JLabel backLabel = new JLabel("BACK TO MAIN VIEW");
    	backLabel.setForeground(new Color(255, 123, 114));
    	backLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 23));
    	backPanel.add(backLabel);
    	
    	
    	


        
        
        
       

    }


    private void searchBook() {
    	
	
    }
}