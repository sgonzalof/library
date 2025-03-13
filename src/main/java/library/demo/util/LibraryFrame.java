package library.demo.util;

import java.awt.Color;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JInternalFrame;
import javax.swing.JEditorPane;
import javax.swing.JFrame;

import java.awt.Button;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import library.demo.util.LibraryFrame;

import javax.swing.ImageIcon;

public class LibraryFrame extends JFrame {
	public LibraryFrame(){

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
		//this.setBounds(0, 0, 1920, 1080);
		this.getContentPane().setLayout(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(false);
		this.setResizable(false);

        
        // Create menu bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setOpaque(true);
        menuBar.setBackground(Color.BLACK);
        

        

        // Create menus
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu optionsMenu = new JMenu("Options");
		JMenu helpMenu = new JMenu("Help");
		
		

        // Create menu items
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem importItem = new JMenuItem("Import");
		JMenuItem exportItem = new JMenuItem("Export");
		JMenuItem exitItem = new JMenuItem("Exit");
		

        // Add items to the "File" menu
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(importItem);
		fileMenu.add(exportItem);
		fileMenu.add(exitItem);
		
        // Add menus to menu bar
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(optionsMenu);
		menuBar.add(helpMenu);
		


        // Set the menu bar for the frame
		this.setJMenuBar(menuBar);

        // Set frame icon
		ImageIcon logo = new ImageIcon("library-book-logo.png");
		this.setIconImage(logo.getImage());
	}
}
   




