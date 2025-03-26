package library.demo.run;

import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReturnController {
	
    private ReturnModel model;
	private ReturnView view;
	private JTable table;
	

	public ReturnController(ReturnModel model) {
	    this.model = model;  
	};  
    	
	
	public void getBorrows(JTable table) {
	    List<Object[]> listaBorrows = model.getBorrowsModel();

	    // Obtener el modelo de la JTable
	    DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

	    // Limpiar todas las filas existentes
	    tableModel.setRowCount(0);

	    // Llenar la tabla con los datos obtenidos de la base de datos
	    for (Object[] row : listaBorrows) {
	        tableModel.addRow(row);
	    }

	    // Mensaje de depuración (opcional)
	    if (listaBorrows.isEmpty()) {
	        System.out.println("No hay préstamos en la base de datos.");
	    } else {
	        System.out.println("Se han cargado " + listaBorrows.size() + " préstamos.");
	    }
	}


	public void returnBook(String isbn, String idMember) {
		
		
		
		model.returnBookModel(isbn, idMember);

		
	}


}
