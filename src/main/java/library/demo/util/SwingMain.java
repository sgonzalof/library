package library.demo.util;

//import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.EventQueue;
import javax.swing.JFrame;
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
				            
			                UIManager.put("control", new Color(30, 30, 30)); // Background color
			                UIManager.put("info", new Color(50, 50, 50));
			                UIManager.put("nimbusBase", new Color(40, 40, 40)); // Base color for components
			                UIManager.put("nimbusAlertYellow", new Color(255, 220, 0));
			                UIManager.put("nimbusDisabledText", new Color(100, 100, 100));
			                UIManager.put("nimbusFocus", new Color(80, 80, 80));
			                UIManager.put("nimbusGreen", new Color(0, 200, 0));
			                UIManager.put("nimbusInfoBlue", new Color(50, 100, 255));
			                UIManager.put("nimbusLightBackground", new Color(20, 20, 20));
			                UIManager.put("nimbusOrange", new Color(255, 120, 0));
			                UIManager.put("nimbusRed", new Color(200, 50, 50));
			                UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
			                UIManager.put("nimbusSelectionBackground", new Color(60, 60, 60));
			                UIManager.put("text", new Color(200, 200, 200)); // Text color
				            
				            
				            
				            
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
		frame = new JFrame();
		frame.setTitle("LIBRARY LOGIN");
		frame.setBounds(0, 0, 287, 185);
		frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		
		ImageIcon logo = new ImageIcon("library-book-logo.png");
		frame.setIconImage(logo.getImage());
		
		
		JButton btnNewButton = new JButton("WELCOME TO THE LIBRARY MANAGER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		// button that opens a new view of the library
				LibraryView library = new LibraryView();	}	// 
		});
		frame.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		//Database db=new Database(); //creo la base de datos de prueba
		
		//db.createDatabase(false); //le paso el valor falso porque considero que no esta creada aun
		//db.loadDatabase(); //cargo datos de prueba
		
	}
		
	public JFrame getFrame() { return this.frame; }
	
}
