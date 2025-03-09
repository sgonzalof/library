package library.demo.util;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class LibraryButtons extends JButton {
	public LibraryButtons(String string){
		
		this.setFocusable(false);
		
        this.setForeground(Color.WHITE);
        this.setBackground(new Color(50, 50, 50));
        this.setFocusPainted(false);
        this.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        this.setText(string);
        
	}

}
