package library.demo.util;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class LibraryButtons extends JButton {
	public LibraryButtons(String string){
		
        this.setForeground(Color.BLACK);
        this.setBackground(new Color(87, 127, 143));
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        this.setText(string);
        this.setVisible(true);
        
	}

}
