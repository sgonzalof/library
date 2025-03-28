package library.demo.run;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ReturnBookPanel extends JPanel {
    public ReturnBookPanel() {

		
		Color Darkest =new Color(13, 17, 23);
		Color Dark =new Color(21, 27, 35);
		Color Light =new Color(33, 40, 48);
		Color Lightest =new Color(68, 147, 248);
		Color MoreLightest =new Color(145, 152, 161) ;
		Color HoverBtnColor =new Color(74, 68, 81);
		
        setBackground(Darkest);
		setBounds(180, 0, 1740, 1080);
        setLayout(null);
        
        JPanel titlePanel = new JPanel();
        titlePanel.setBounds(50, 30, 1298, 33);
        titlePanel.setBackground(Light);
        add(titlePanel);
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 8));
        
        JLabel titleLabel = new JLabel("RETURN BOOK VIEW");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 14));
        titleLabel.setBackground(Color.WHITE);
        titlePanel.add(titleLabel);
        
        JPanel bookPanel = new JPanel();
        bookPanel.setBounds(50, 94, 630, 33);
        bookPanel.setBackground(Light);
        add(bookPanel);
        bookPanel.setLayout(null);
        
        JLabel bookLabel = new JLabel("Book:");
        bookLabel.setFont(new Font("Roboto", Font.PLAIN, 14));
        bookLabel.setBounds(10, 0, 84, 33);
        bookPanel.add(bookLabel);
        bookLabel.setForeground(MoreLightest);
        
        JComboBox bookNameComboBox = new JComboBox();
        bookNameComboBox.setEditable(true);
        bookNameComboBox.setBounds(81, 0, 549, 33);
        bookNameComboBox.setBackground(Light);
        bookPanel.add(bookNameComboBox);
        
        JPanel memberPanel = new JPanel();
        memberPanel.setLayout(null);
        memberPanel.setBackground(new Color(33, 40, 48));
        memberPanel.setBounds(718, 94, 630, 33);
        add(memberPanel);
        
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
        borrowBtnPanel.setBounds(224, 699, 400, 60);
        borrowBtnPanel.setBackground(Dark);
        add(borrowBtnPanel);
        borrowBtnPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));
        
        
        
        JLabel borrowBtnLabel = new JLabel("BORROW");
        borrowBtnLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 23));
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
			
			public void mousePressed(MouseEvent e) {

				
			}
		});
        
        JPanel backPanel = new JPanel();
        backPanel.setBackground(new Color(21, 27, 35));
        backPanel.setBounds(785, 699, 400, 60);
        add(backPanel);
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

        

        setVisible(true);
        

        
        
        
        
       

    }


    private void searchBook() {
    	
	
    }
}
