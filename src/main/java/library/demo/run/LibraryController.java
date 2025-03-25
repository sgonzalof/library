package library.demo.run;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JTable;

import library.demo.run.LibraryModel;
import library.demo.run.LibraryView;
import library.demo.util.DbUtil;

public class LibraryController {
	private LibraryModel model;
	private LibraryView view;
	//private LibraryModel borrowM;
	private BorrowBookView borrowV;
	String valueTitle;
	
	
	public void setVistaModel( LibraryView v , LibraryModel m) {
		this.model = m;
		this.view = v;
		//no hay inicializacion especifica del modelo, solo de la vista
		this.view.getFrame().setVisible(true);
        getTable1(); // Llama a getTable1() para cargar los datos
        getTable2();
	}
	
	

	
	//a partir de aqui, implementamos los metodos de las funcionalidades correspondientes
	
	public void getTable1() {
	    // Método para rellenar la tabla de artículos y pedidos
	    List<Object[]> lista = model.getTable1(); // Obtenemos los datos desde el modelo
	    
	    if (lista == null || lista.isEmpty()) {
	        System.out.println("No hay datos para mostrar en la tabla.");
	        return; // Salimos del método si la lista está vacía
	    }

	    // Iteramos sobre los resultados y los mostramos en la vista
	    for (Object[] fila : lista) {
	        view.ShowTable1(fila);
	    }
	}
	
	public void getTable2() {
	    // Método para rellenar la tabla de artículos y pedidos
	    List<Object[]> lista = model.getTable2(); // Obtenemos los datos desde el modelo
	    
	    if (lista == null || lista.isEmpty()) {
	        System.out.println("No hay datos para mostrar en la tabla 2");
	        return; // Salimos del método si la lista está vacía
	    }

	    // Iteramos sobre los resultados y los mostramos en la vista
	    for (Object[] fila : lista) {
	        view.ShowTable2(fila);
	    }
	}
	
	

	public LibraryView getView() {
		return view;
	}

	public void setView(LibraryView view) {
		this.view = view;
	}

	public LibraryModel getModel() {
		return model;
	}

	public void setModel(LibraryModel model) {
		this.model = model;
	}

	public void addBookRow(String i, String t, String w, String y, String c, String b ) {
		model.addBook(i, t, w, y, c, b);
		

	   
	    }

	public void saveTable(JTable table) {
		model.saveTableData(table);
		// TODO Auto-generated method stub
		
	}

	public void deleteSelectedBook(JTable table ) {
		model.deleteSelectedRow(table);
		// TODO Auto-generated method stub
		
	}

	public void addMemberRow(String idMember, String name, String staff, String birthDate, String category, String tlf,
			String hasABook) {
		model.addMember(idMember, name, staff, birthDate, category , tlf, hasABook);

		
	}

	public void deleteSelectedMember(JTable table) {
		model.deleteSelectedRow(table);

	}


	
}
