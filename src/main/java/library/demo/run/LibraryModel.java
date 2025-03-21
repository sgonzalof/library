package library.demo.run;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import library.demo.util.Database;
import library.demo.util.DbUtil;

// modelo = punto de comunicacion con BD
// se relaciona directamente con la BD por medio 
// de la ejecucion de sentencias SQL

public class LibraryModel {
	

	
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
		

		
		String addBookQuery = "INSERT INTO books (isbn, title, writer, year, category, borrowed) VALUES (?,?,?,?,?,?)";

		
	}
	
}
	
	
	
	
    


