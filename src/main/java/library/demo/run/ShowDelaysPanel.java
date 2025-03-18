package library.demo.run;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ShowDelaysPanel extends JPanel {
	private JTable table;
    public ShowDelaysPanel() {
    	
		
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

        add(titlePanel);
        titlePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 8));
        
        JLabel titleLabel = new JLabel("RETURN BOOK VIEW");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Roboto SemiBold", Font.PLAIN, 14));
        titleLabel.setBackground(Color.WHITE);
        titlePanel.add(titleLabel);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(50, 96, 1290, 782);
        add(scrollPane);
        
        table = new JTable();
        scrollPane.setViewportView(table);
        
        
    }
}
