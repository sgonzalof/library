package library.demo.util;

//import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import library.demo.run.*;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;


/**
 * Punto de entrada principal que incluye botones para la ejecucion de las pantallas 
 * de las aplicaciones de ejemplo
 * y acciones de inicializacion de la base de datos.
 * No sigue MVC pues es solamente temporal para que durante el desarrollo se tenga posibilidad
 * de realizar acciones de inicializacion
 */
public class SwingMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { //NOSONAR codigo autogenerado
			public void run() {
				
				
				try {
					// Setting LookAndFeel NIMBUS THEME
					
				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            
			                // Definimos los colores principales
			                Color darkGray = new Color(43, 43, 43); // #2B2B2B
			                Color lightBlue = new Color(87, 127, 143); // #8AFF80

			                // Aplicamos los colores personalizados a Nimbus
			                UIManager.put("control", darkGray);
			                UIManager.put("info", darkGray);
			                UIManager.put("nimbusBase", darkGray);
			                UIManager.put("nimbusAlertYellow", lightBlue);
			                UIManager.put("nimbusDisabledText", new Color(120, 120, 120));
			                UIManager.put("nimbusFocus", lightBlue);
			                UIManager.put("nimbusGreen", lightBlue);
			                UIManager.put("nimbusInfoBlue", lightBlue);
			                UIManager.put("nimbusLightBackground", darkGray);
			                UIManager.put("nimbusOrange", lightBlue);
			                UIManager.put("nimbusRed", new Color(200, 50, 50));
			                UIManager.put("nimbusSelectedText", Color.BLACK);
			                UIManager.put("nimbusSelectionBackground", lightBlue);
			                UIManager.put("text", Color.WHITE);
			                
			                // Set Nimbus dark menu bar properties
			                UIManager.put("MenuBar.background", Color.BLACK);
			                UIManager.put("Menu.background", Color.BLACK);
			                UIManager.put("Menu.foreground", Color.WHITE);
			                UIManager.put("MenuItem.background", Color.BLACK);
			                UIManager.put("MenuItem.foreground", Color.WHITE);
			                UIManager.put("Menu[Selected].background", new Color(60, 60, 60)); // Dark gray when selected
			                UIManager.put("Menu[Selected].foreground", Color.WHITE);
			                
			                

				            
				            SwingMain window = new SwingMain();
				            						
							window.frame.setVisible(true);
							ImageIcon logo = new ImageIcon("library-book-logo.png");
							break;
				        }
				    }
				} catch (Exception e) {
				    e.printStackTrace();
				}
				
				
				/* 
				 * this is commented because i implement the NIMBUS THEME
				 * only as reminder
				 * 
				 * 
				
				try {
					
					//FlatLightLaf.setup();
					SwingMain window = new SwingMain();

					
					window.frame.setVisible(true);
					ImageIcon logo = new ImageIcon("library-book-logo.png");
					
					
					
				} catch (Exception e) {
					e.printStackTrace(); //NOSONAR codigo autogenerado
				}*/
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new LibraryFrame();
		frame.setTitle("LIBRARY LOGIN");
		/*
		 * 
		 * frame.setBounds(0, 0, 287, 185);
		
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		ImageIcon logo = new ImageIcon("library-book-logo.png");
		frame.setIconImage(logo.getImage());
		
		*/
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBounds(10, 10, 1044, 50);	
		loginPanel.setLayout(new GridLayout(2, 1, 10, 10));
		frame.getContentPane().add(loginPanel);
		
	    JTextPane userField = new JTextPane();
	    loginPanel.add(userField);
	    userField.setBackground(new Color(67, 80, 85));
	    
	    JTextPane passwordField = new JTextPane();
	    passwordField.setToolTipText("*******");
	    loginPanel.add(passwordField);







		
		
		
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(10, 200, 1044, 50);
		frame.getContentPane().add(topPanel);
		topPanel.setLayout(new GridLayout(1, 2, 10, 10));
	    topPanel.setBackground(Color.DARK_GRAY); 
		

		
		LibraryButtons btnNewButton = new LibraryButtons("WELCOME TO THE LIBRARY MANAGER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// button that opens a new view of the library
				LibraryView3 library = new LibraryView3();

				}	
		});

	    // Add button to the top panel 
	    topPanel.add(btnNewButton);
	    frame.getContentPane().add(topPanel, BorderLayout.NORTH); // Use NORTH to avoid conflicts
	    


	    frame.setVisible(true); // Ensure frame is visible
		
		
		//frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
	
		//Database db=new Database(); //creo la base de datos de prueba
		
		//db.createDatabase(false); //le paso el valor falso porque considero que no esta creada aun
		//db.loadDatabase(); //cargo datos de prueba
		
	}


		
	//public JFrame getFrame() { return this.frame; }
	
	
	
}
