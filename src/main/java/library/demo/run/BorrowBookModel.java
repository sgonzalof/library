package library.demo.run;

import java.util.List;

import library.demo.util.Database;

public class BorrowBookModel {
	private Database db;

    public BorrowBookModel(Database db) {
        this.db = db;
    }

    public List<Object[]> getBooksModel() {
        String sql = "SELECT title FROM book WHERE borrowed = ?"; 
        return db.executeQueryArray(sql, 0);
    }
}
