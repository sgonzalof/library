package library.demo.run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import library.demo.util.Database;

public class BorrowBookModel {
	//private Database db;
    private Connection connection;
    
	Database db = new Database();
    
    /*

    public BorrowBookModel(Database db) {
        this.db = db;
    }
*/
    public List<Object[]> getBooksModel() {
        String sql = "SELECT title FROM book WHERE borrowed = ?"; 
        return db.executeQueryArray(sql, 0);
    }

	public List<Object[]> getMembersNamesModel() {
		String sql = "SELECT name FROM members WHERE hasABook = ?"; 
        return db.executeQueryArray(sql, 0);
	}


	public List<Object[]> getMembersIdModel() {
		String sql = "SELECT idMember FROM members WHERE hasABook = ?"; 
        return db.executeQueryArray(sql, 0);
	}
}

