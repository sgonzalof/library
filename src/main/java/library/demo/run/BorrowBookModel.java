package library.demo.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import library.demo.util.Database;
import library.demo.util.DbUtil;

import java.util.Date;

public class BorrowBookModel {
	//private Database db;
    private Connection connection;
    
	Database db = new Database();
    
    /*
     * 

    public BorrowBookModel(Database db) {
        this.db = db;
    }
    
    */

    public List<Object[]> getBooksModel() {
        String sql = "SELECT title FROM book WHERE borrowed = ?"; 
        return db.executeQueryArray(sql, 0);
    }

	public List<Object[]> getMembersNamesModel() {
		String sql = "SELECT name,idMember FROM members WHERE hasABook = ?"; 
        return db.executeQueryArray(sql, 0);
	}


	public List<Object[]> getMembersIdModel() {
		String sql = "SELECT idMember FROM members WHERE hasABook = ?"; 
        return db.executeQueryArray(sql, 0);
	}
	
	
	public List<Object[]> borrowBookModel(String a, String b) {
	    Date date = new Date();
	    Date returnDate = new Date();

	    String sqlSelectBook = "SELECT * FROM book WHERE title = ?";
	    List<Object[]> bookSelected = db.executeQueryArray(sqlSelectBook, b);

	    String sqlSelectMember = "SELECT * FROM members WHERE idMember = ?";
	    List<Object[]> memberSelected = db.executeQueryArray(sqlSelectMember, a);

	    // Validaciones para evitar IndexOutOfBoundsException
	    if (bookSelected.isEmpty()) {
	        System.err.println("Error: No se encontró el libro con título: " + b);
	        return null;
	    }
	    if (memberSelected.isEmpty()) {
	        System.err.println("Error: No se encontró el miembro con ID: " + a);
	        return null;
	    }
	    
	    // Asegurar que bookSelected y memberSelected tengan suficientes elementos
	    if (bookSelected.get(0).length < 2 || memberSelected.get(0).length < 2) {
	        System.err.println("Error: Los datos recuperados no son suficientes.");
	        return null;
	    }

	    String sql = "INSERT INTO borrow (title, name, idMember, isbn, borrowDate, returnDate) VALUES (?,?,?,?,?,?)";
	    //String sql1 = "REPLACE borrowed  " seguir aqui reemplazar borrowed de tabla books y hasABook de members....
	    /*
	     * 
	     * seguir aqui
	     * 
	     */
	    
	    
	    // Obtener los valores asegurando que existen
	    String title = bookSelected.get(0)[1].toString(); // Segunda columna del libro
	    String memberName = memberSelected.get(0)[1].toString(); // Segunda columna del miembro
	    String memberId = memberSelected.get(0)[0].toString(); // Primera columna del miembro
	    int isbn = Integer.parseInt(bookSelected.get(0)[0].toString()); // Primera columna del libro

	    db.executeUpdate(sql, title, memberName, memberId, isbn, date.toString(), returnDate.toString());

	    System.out.printf("%s, %s, %s - datos del registro en tabla borrow%n", title, memberName, memberId);
	    return bookSelected;
	    
	    
	}
	
}

