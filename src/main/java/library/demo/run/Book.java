package library.demo.run;

public class Book {
	private int isbn;
	private String title;
	private String writer;
	private int year;
	

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {	
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getYear() {  // returns the value (int) of the atribute year 
		return year;        // of the class book. 
	}                       // while its public you can call it from outside
							// of the class book
	
	
	public void setYear(int year) { // void means there no need for the return sentence
		this.year = year;			// it sets the atribute year the value that I give 
	}								// as argument to the method
	

}
	