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
		
		String sql = "INSERT INTO borrow (title, name, idMember, isbn, borrowDate, returnDate) VALUES = (?,?,?,?,?,?)";
		return db.executeQueryArray(sql, bookSelected.get(1), memberSelected.get(1),
				memberSelected.get(0), bookSelected.get(0), date.toString(), returnDate.toString());
		
		
		
				
		
	}

		
}

