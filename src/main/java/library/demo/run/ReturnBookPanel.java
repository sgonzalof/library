package library.demo.run;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ReturnBookPanel extends JPanel { 
    public ReturnBookPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.blue);
		setBounds(180, 0, 1740, 1080);

        JLabel label = new JLabel("Panel de Préstamo de Libros", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        add(label, BorderLayout.CENTER);
        
    }

   

}


