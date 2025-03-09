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
		
		this.setBounds(40, 40, 1080, 660);
		this.getContentPane().setLayout(null);
		//this.getContentPane().setBackground(Color.DARK_GRAY);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu optionsMenu = new JMenu("Options");
		JMenu helpMenu = new JMenu("Help");
		
		JMenuItem newItem = new JMenuItem("New");
		JMenuItem openItem = new JMenuItem("Open");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem importItem = new JMenuItem("Import");
		JMenuItem exportItem = new JMenuItem("Export");
		JMenuItem exitItem = new JMenuItem("Exit");
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(importItem);
		fileMenu.add(exportItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(optionsMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		
		
		ImageIcon logo = new ImageIcon("library-book-logo.png");
		this.setIconImage(logo.getImage());
	}

}
