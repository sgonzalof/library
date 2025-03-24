package library.demo.run;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

import library.demo.util.Database;
import library.demo.util.DbUtil;

// modelo = punto de comunicacion con BD
// se relaciona directamente con la BD por medio 
// de la ejecucion de sentencias SQL

public class LibraryModel {
	
	private JTable table_1;
	private JTable table_2;
    private Connection connection;
	
	

	
	Database db = new Database();
	

	public List<Object[]> getTable1() {
		

		List<Object[]> lista = new ArrayList<>(); //esta lista es el resultado que le va a pasar al controlador como resultado de la consulta
									// a la base de datos
		
		String sql = "SELECT * FROM book"; //crear el string que voy a ejecutar en la base de datos
		
        try {
            lista = db.executeQueryArray(sql);
        } catch (Exception e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }

        return lista;
		
				
	}
	public List<Object[]> getTable2() {
		

		List<Object[]> lista = new ArrayList<>(); //esta lista es el resultado que le va a pasar al controlador como resultado de la consulta
									// a la base de datos
		
		String sql2 = "SELECT * FROM members"; //crear el string que voy a ejecutar en la base de datos
		
        try {
            lista = db.executeQueryArray(sql2);
        } catch (Exception e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }

        return lista;
        
	}
	public void addBook(String i, String t, String w, String y, String c, String b) {

				
		String addBookQuery = "INSERT INTO book (isbn, title, writer, year, category, borrowed) VALUES (?,?,?,?,?,?)";
	    try {
	        db.executeUpdate(addBookQuery, i, t, w, y, c, b);
	        System.out.println("Libro agregado exitosamente.");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	/*
	public void saveTableData(JTable table) {
        // Obtener el modelo de la tabla
        int rowCount = table.getRowCount();
        int columnCount = table.getColumnCount();
        
        // Recorrer todas las filas de la JTable
        for (int i = 0; i < rowCount; i++) {
            // Crear un array para almacenar los datos de cada fila
            Object[] rowData = new Object[columnCount];
            
            for (int j = 0; j < columnCount; j++) {
                // Obtener los datos de cada celda en la fila
                rowData[j] = table.getValueAt(i, j);
            }

            // Preparar la consulta SQL para insertar en la base de datos
            String addBookQuery = "INSERT INTO book (isbn, title, writer, year, category, borrowed) VALUES (?, ?, ?, ?, ?, ?)";
            
            try {
                // Guardar los datos de la fila en la base de datos
                db.executeUpdate(addBookQuery, rowData);
                System.out.println("Fila " + (i + 1) + " guardada exitosamente.");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Error al guardar la fila " + (i + 1));
            }
    
        }
        }
	*/
	
	public void saveTableData(JTable table) {
	    // Obtener el número de filas y columnas de la JTable
	    int rowCount = table.getRowCount();
	    int columnCount = table.getColumnCount();

	    // Determinar el tipo de tabla en base a la primera columna
	    String tableName = "";
	    String insertQuery = "";

	    if (table.getColumnName(0).equals("ISBN")) {
	        tableName = "book";
	        insertQuery = "INSERT OR REPLACE INTO book (isbn, title, writer, year, category, borrowed) VALUES (?, ?, ?, ?, ?, ?)";
	    } else if (table.getColumnName(0).equals("ID")) {
	        tableName = "members";
	        insertQuery = "INSERT OR REPLACE INTO  members (idMember, name, staff, birthDate, category , tlf, hasABook) VALUES (?,?,?,?,?,?,?)";
	    } else {
	        JOptionPane.showMessageDialog(null, "No se pudo determinar la tabla a la que guardar los datos.");
	        return;
	    }

	    // Recorrer todas las filas de la JTable
	    for (int i = 0; i < rowCount; i++) {
	        // Crear un array para almacenar los datos de cada fila
	        Object[] rowData = new Object[columnCount];

	        for (int j = 0; j < columnCount; j++) {
	            // Obtener los datos de cada celda en la fila
	            rowData[j] = table.getValueAt(i, j);
	        }

	        try {
	            // Guardar los datos de la fila en la base de datos
	            db.executeUpdate(insertQuery, rowData);
	            System.out.println("Fila " + (i + 1) + " guardada exitosamente en la tabla " + tableName + ".");
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Error al guardar la fila " + (i + 1) + " en la tabla " + tableName + ".");
	        }
	    }
	}

	
	/*
	 * 
	 * implementado deleteSelectedRow
	 * 
	public void deleteSelectedBookModel(JTable table) {
	    // Obtener el índice de la fila seleccionada
	    int selectedRow = table.getSelectedRow();

	    if (selectedRow == -1) {
	        // Si no hay ninguna fila seleccionada, mostrar un mensaje
	        JOptionPane.showMessageDialog(null, "Por favor, seleccione un libro para eliminar.");
	        return;
	    }

	    // Suponiendo que la columna 0 contiene el ISBN o ID del libro (ajusta esto si es diferente)
	    String isbn = table.getValueAt(selectedRow, 0).toString();

	    // Preparar la consulta SQL para eliminar el libro
	    
	    
	    String deleteBookQuery = "DELETE FROM book WHERE isbn = ?";

	    try {
	        // Llamar a executeUpdate para eliminar el libro de la base de datos
	        db.executeUpdate(deleteBookQuery, isbn);
	        System.out.println("Libro con ISBN " + isbn + " eliminado exitosamente.");

	        // Eliminar la fila de la JTable para reflejar el cambio
	        ((javax.swing.table.DefaultTableModel) table.getModel()).removeRow(selectedRow);
	    } catch (Exception e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error al eliminar el libro.");
	    }
	}
	
	
	*/
	
	
	public void addMember(String idMember, String name, String staff, String birthDate, String category, String tlf,
			String hasABook) {

		
		String addBookQuery = "INSERT INTO members (idMember, name, staff, birthDate, category , tlf, hasABook) VALUES (?,?,?,?,?,?,?)";
	    try {
	        db.executeUpdate(addBookQuery, idMember, name, staff, birthDate, category , tlf, hasABook);
	        System.out.println("Libro agregado exitosamente.");
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	
	public void deleteSelectedRow(JTable table) {
	    // Obtener el índice de la fila seleccionada
	    int selectedRow = table.getSelectedRow();

	    if (selectedRow == -1) {
	        // Si no hay ninguna fila seleccionada, mostrar un mensaje
	        JOptionPane.showMessageDialog(null, "Por favor, seleccione una fila para eliminar.");
	        return;
	    }

	    // Determinar qué tipo de tabla es (book o members) según la columna clave
	    String tableName = "";
	    String columnName = "";
	    String idValue = "";

	    // Aquí asumimos que la columna 0 es el identificador de la fila
	    // Para la tabla book, la columna 0 podría ser 'isbn' y para members 'member_id'
	    if (table.getColumnName(0).equals("ISBN")) {
	        tableName = "book";
	        columnName = "isbn";  // Columna 'isbn' para la tabla book
	    } else if (table.getColumnName(0).equals("ID")) {
	        tableName = "members";
	        columnName = "idMember";  // Columna 'memberId' para la tabla members
	    }

	    if (tableName.isEmpty()) {
	        JOptionPane.showMessageDialog(null, "No se pudo determinar la tabla seleccionada.");
	        return;
	    }

	    // Obtener el valor de la columna clave (isbn o member_id)
	    idValue = table.getValueAt(selectedRow, 0).toString();

	    // Preparar la consulta SQL para eliminar la fila de la tabla correspondiente
	    String deleteQuery = "DELETE FROM " + tableName + " WHERE " + columnName + " = ?";

	    try {
	        // Llamar a executeUpdate para eliminar la fila de la base de datos
	        db.executeUpdate(deleteQuery, idValue);
	        System.out.println("Fila con " + columnName + " " + idValue + " eliminada exitosamente de la tabla " + tableName + ".");

	        // Eliminar la fila de la JTable para reflejar el cambio
	        ((javax.swing.table.DefaultTableModel) table.getModel()).removeRow(selectedRow);
	    } catch (Exception e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Error al eliminar la fila.");
	    }
	
	    
	};

    
}
    


