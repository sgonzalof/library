package library.demo.run;

import java.sql.Connection;
import java.util.List;

import library.demo.util.Database;

public class ReturnModel {
	
    private Connection connection;
    
	Database db = new Database();

	public List<Object[]> getBorrowsModel() {

		
        String sql = "SELECT * FROM borrow"; 
        return db.executeQueryArray(sql);
        
	}

	public void returnBookModel(String isbn, String idMember) {
		String sql = "DELETE FROM borrow WHERE isbn = ?";  // delete registro de tabla borrow
		String sql1 = "UPDATE book SET borrowed = 0 WHERE ISBN = ?";  // update tabla book
		String sql2 = "UPDATE members SET hasABook = 0 WHERE idMember = ?";  // update tabla members
		
		// control de numero de libros que tiene el miembro y si puede o no sacar otro


		db.executeUpdate(sql, isbn);
		db.executeUpdate(sql1, isbn);
		db.executeUpdate(sql2, idMember);


	}
}


