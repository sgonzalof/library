package library.demo.run;

import java.util.List;

import library.demo.util.Database;

// modelo = punto de comunicacion con BD
// se relaciona directamente con la BD por medio 
// de la ejecucion de sentencias SQL

public class LibraryModel {
	
	Database db = new Database();

	public List<Object[]> GetTable1() {
		// TODO Auto-generated method stub
		List<Object[]> lista = null; //esta lista es el resultado que le va a pasar al controlador como resultado de la consulta
									// a la base de datos
		
		String sql = "SELECT * FROM book"; //crear el string que voy a ejecutar en la base de datos
		
		lista = db.executeQueryArray(sql);
		
		return lista;
		
	}

}
